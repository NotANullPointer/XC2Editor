package me.notanullpointer.xc2editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.notanullpointer.xc2editor.assets.Image;
import me.notanullpointer.xc2editor.save.Blade;
import me.notanullpointer.xc2editor.save.Driver;
import me.notanullpointer.xc2editor.ui.BladeSelection;
import me.notanullpointer.xc2editor.ui.CharEdit;

import javax.imageio.ImageIO;
import java.io.File;


public class XC2Editor extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*FXMLLoader ldr = new FXMLLoader(getClass().getResource("char_edit.fxml"));
        me.notanullpointer.xc2editor.assets.Image.load();
        Scene prim = new Scene(ldr.load());
        CharEdit controller = ldr.getController();
        controller.setDriver(Driver.NIA);
        primaryStage.setTitle("Xenoblade 2 Save Editor");
        primaryStage.setScene(prim);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();*/
        FXMLLoader ldr = new FXMLLoader(getClass().getResource("blade_selection.fxml"));
        me.notanullpointer.xc2editor.assets.Image.load();
        Scene prim = new Scene(ldr.load());
        BladeSelection controller = ldr.getController();
        controller.init(Blade.values());
        primaryStage.setTitle("Xenoblade 2 Save Editor");
        primaryStage.setScene(prim);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
        ImageIO.write(Image.ROLE_ATK.getImage(), "png", new File("/home/alessandro/Desktop/atk.png"));
    }

    public static void main(String... args) {
        launch(args);
    }
}
