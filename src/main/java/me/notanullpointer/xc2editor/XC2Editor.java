package me.notanullpointer.xc2editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import me.notanullpointer.xc2editor.save.*;
import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.structure.SaveFile;
import me.notanullpointer.xc2editor.ui.Menu;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InvalidPropertiesFormatException;


public class XC2Editor extends Application {

    private static SaveFile file;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FileChooser saveChooser = new FileChooser();
        saveChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        saveChooser.setInitialFileName("bf2savefile.sav");
        saveChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("Xenoblade Chronicles 2 Save", ".sav"));
        File res = saveChooser.showOpenDialog(primaryStage);
        if(res == null)
            System.exit(-1);
        try {
            file = new SaveFile(Files.readAllBytes(Paths.get(res.getPath())));
            System.out.println(res.length());
            if(file.getMagic().getValue() != 237915)
                throw new InvalidPropertiesFormatException("Invalid magic");
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid file");
            alert.setContentText("The file you specified doesn't exist or isn't a save!");
            alert.showAndWait();
            start(primaryStage);
        }
        linkDrivers();
        linkBlades();
        FXMLLoader ldr = new FXMLLoader(this.getClass().getClassLoader().getResource("fxml/menu.fxml"));
        me.notanullpointer.xc2editor.assets.Image.load();
        Scene prim = new Scene(ldr.load());
        Menu controller = ldr.getController();
        controller.setStage(primaryStage, prim);
        primaryStage.setTitle("Xenoblade 2 Save Editor");
        primaryStage.setScene(prim);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    private void linkDrivers() {
        for (Driver d:Driver.values()) {
            d.linkTo(getSaveFile().getDrivers()[d.getDriverId()-1]);
        }
    }

    private void linkBlades() {
        for(Int16 id:getSaveFile().getCommonBladeIds()) {
            if(id.getValue() == 0) continue;
            Blade.getCommon(getSaveFile().findBladeById(id.getValue()));
        }
        for(Blade blade:Blade.values()) {
            blade.linkTo(getSaveFile().findBladeById((short)blade.getId()));
        }
        Blade.registerRares();
    }

    public static SaveFile getSaveFile() {
        return file;
    }

    public static void main(String... args) {
        launch(args);
    }
}
