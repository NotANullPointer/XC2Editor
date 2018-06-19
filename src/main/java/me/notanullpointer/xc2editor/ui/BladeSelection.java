package me.notanullpointer.xc2editor.ui;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;

import me.notanullpointer.xc2editor.save.Blade;
import me.notanullpointer.xc2editor.ui.components.BladeView;

public class BladeSelection {

    private @FXML ScrollPane scrollpane;
    private static Blade selectedBlade;

    public void init(Blade[] blades) {
        VBox vbox0 = new VBox(32);
        VBox vbox1 = new VBox(32);
        VBox vbox2 = new VBox(32);
        VBox vbox3 = new VBox(32);
        int counter = 0;
        while(counter < blades.length) {
            vbox0.getChildren().add(new BladeView(blades[counter]));
            counter += 4;
        }
        counter = 1;
        while(counter < blades.length) {
            vbox1.getChildren().add(new BladeView(blades[counter]));
            counter += 4;
        }
        counter = 2;
        while(counter < blades.length) {
            vbox2.getChildren().add(new BladeView(blades[counter]));
            counter += 4;
        }
        counter = 3;
        while(counter < blades.length) {
            vbox3.getChildren().add(new BladeView(blades[counter]));
            counter += 4;
        }
        HBox hbox = new HBox(64, vbox0, vbox1, vbox2, vbox3);
        scrollpane.setContent(hbox);
    }

    public static void setSelectedBlade(Blade blade) {
        selectedBlade = blade;
    }

    public static Blade getSelectedBlade() {
        return selectedBlade;
    }

    public static boolean hasChoosen() {
        return !(selectedBlade == null);
    }

}
