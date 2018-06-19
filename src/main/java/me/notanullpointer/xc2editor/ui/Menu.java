package me.notanullpointer.xc2editor.ui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import me.notanullpointer.xc2editor.save.Driver;
import org.controlsfx.control.PopOver;

public class Menu {

    private boolean shouldOpenDriverEdit = true;
    private static Stage stage;
    private static Scene menu;
    private @FXML JFXButton driverEditor;

    public void setStage(Stage stage, Scene scene) {
        Menu.stage = stage;
        Menu.menu = scene;
    }

    public void loadDriverPopOver() {
        if (shouldOpenDriverEdit) {
            AnchorPane pane = new AnchorPane();
            pane.setPrefWidth(200);
            pane.setPrefHeight(100);
            JFXComboBox<String> comboBox = new JFXComboBox<>();
            comboBox.setLayoutY(20);
            comboBox.setLayoutX(10);
            comboBox.setPrefWidth(180);
            comboBox.setPrefHeight(20);
            comboBox.getItems().addAll(Driver.stringValues());
            comboBox.setValue("Rex");
            pane.getChildren().add(comboBox);
            JFXButton button = new JFXButton("Open");
            button.setStyle("-fx-background-color: #1E88E5;");
            button.setButtonType(JFXButton.ButtonType.FLAT);
            button.setLayoutY(60);
            button.setLayoutX(10);
            button.setPrefWidth(180);
            button.setPrefHeight(20);
            button.setTextFill(Color.WHITE);
            button.setOnMouseClicked(e -> this.loadDriver(Driver.fromName(comboBox.getValue())));
            pane.getChildren().add(button);
            PopOver popOver = new PopOver(pane);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenDriverEdit = true);
            shouldOpenDriverEdit = false;
            popOver.show(driverEditor);
        }
    }

    public void loadDriver(Driver driver) {
        FXMLLoader ldr = new FXMLLoader(this.getClass().getClassLoader().getResource("fxml/char_edit.fxml"));
        Scene drvEditor = null;
        try {
            drvEditor = new Scene(ldr.load());
        } catch(Exception e) {
            //no
        }
        ((CharEdit)ldr.getController()).setDriver(driver);
        stage.setScene(drvEditor);
    }

    public static void toMainMenu() {
        stage.setScene(menu);
    }

}
