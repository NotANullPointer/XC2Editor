package me.notanullpointer.xc2editor.ui;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.Toolkit;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import me.notanullpointer.xc2editor.assets.Image;
import me.notanullpointer.xc2editor.save.Driver;

import java.awt.image.BufferedImage;

public class CharEdit {

    private @FXML ImageView driverImg;
    private @FXML Label driverName;
    private @FXML ImageView accessory0;
    private @FXML ImageView accessory1;
    private @FXML ImageView accessory2;
    private @FXML JFXCheckBox accessoryToggle2;
    private @FXML JFXComboBox accessorySelection2;
    private @FXML ImageView pouch0;
    private @FXML ImageView pouch1;
    private @FXML ImageView pouch2;
    private @FXML ImageView bladeBase;
    private @FXML ImageView bravery;
    private @FXML ImageView truth;
    private @FXML ImageView compassion;
    private @FXML ImageView justice;
    private @FXML ImageView blade1;
    private @FXML ImageView blade2;
    private @FXML ImageView blade3;

    public void setDriver(Driver driver) {
        FontLoader fontLoader = Toolkit.getToolkit().getFontLoader();
        driverImg.setImage(SwingFXUtils.toFXImage(driver.getDriverImage().getImage(), null));
        driverName.setText(driver.getDriverName());
        driverName.setLayoutX(9+(135-fontLoader.computeStringWidth(driverName.getText(), driverName.getFont()))/2);
        accessory0.setImage(toFXImage(Image.BELT.getImage()));
        accessory1.setImage(toFXImage(Image.ORB.getImage()));
        accessory2.setImage(toFXImage(Image.CHOCKER.getImage()));
        pouch0.setImage(toFXImage(Image.DESSERTS.getImage()));
        pouch1.setImage(toFXImage(Image.SEAFOOD.getImage()));
        pouch2.setImage(toFXImage(Image.STAPLE_FOOD.getImage()));
        bladeBase.setImage(toFXImage(Image.BLADE_BASE.getImage()));
        bravery.setImage(toFXImage(Image.BRAVERY.getImage()));
        truth.setImage(toFXImage(Image.TRUTH.getImage()));
        compassion.setImage(toFXImage(Image.COMPASSION.getImage()));
        justice.setImage(toFXImage(Image.JUSTICE.getImage()));
        blade1.setImage(toFXImage(Image.NIAB_T.getImage()));
        blade2.setImage(toFXImage(Image.NIAB_T.getImage()));
        blade3.setImage(toFXImage(Image.NIAB_T.getImage()));
    }

    public void toggleAccessory2() {
        accessory2.setDisable(!accessory2.isDisable());
        accessorySelection2.setDisable(!accessorySelection2.isDisable());
    }

    public javafx.scene.image.Image toFXImage(BufferedImage img) {
        return SwingFXUtils.toFXImage(img, null);
    }

}
