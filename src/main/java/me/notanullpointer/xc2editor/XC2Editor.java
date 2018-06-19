package me.notanullpointer.xc2editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import me.notanullpointer.xc2editor.assets.Image;
import me.notanullpointer.xc2editor.save.Blade;
import me.notanullpointer.xc2editor.save.Driver;
import me.notanullpointer.xc2editor.save.PouchItem;
import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.structure.SDataDriver;
import me.notanullpointer.xc2editor.save.structure.SaveFile;
import me.notanullpointer.xc2editor.ui.BladeSelection;
import me.notanullpointer.xc2editor.ui.CharEdit;
import me.notanullpointer.xc2editor.ui.Menu;

import javax.imageio.ImageIO;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;


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
        System.out.println(res.getName());
        file = new SaveFile(Files.readAllBytes(Paths.get(res.getPath())));
        linkDrivers();
        linkBlades();
        FXMLLoader ldr = new FXMLLoader(this.getClass().getClassLoader().getResource("fxml/blade_selection.fxml"));
        me.notanullpointer.xc2editor.assets.Image.load();
        Scene prim = new Scene(ldr.load());
        BladeSelection controller = ldr.getController();
        controller.init(Blade.values());
        primaryStage.setTitle("Xenoblade 2 Save Editor");
        primaryStage.setScene(prim);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
        /*FXMLLoader ldr = new FXMLLoader(this.getClass().getClassLoader().getResource("fxml/menu.fxml"));
        me.notanullpointer.xc2editor.assets.Image.load();
        Scene prim = new Scene(ldr.load());
        Menu controller = ldr.getController();
        controller.setStage(primaryStage, prim);
        primaryStage.setTitle("Xenoblade 2 Save Editor");
        primaryStage.setScene(prim);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();*/
    }

    public void linkDrivers() {
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
    }

    public static SaveFile getSaveFile() {
        return file;
    }

    public static void main(String... args) {
        launch(args);
    }
}
