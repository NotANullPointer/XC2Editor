package me.notanullpointer.xc2editor.ui.components;

import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.Toolkit;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import me.notanullpointer.xc2editor.save.Blade;
import me.notanullpointer.xc2editor.save.Driver;
import me.notanullpointer.xc2editor.ui.BladeSelection;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class BladeView extends AnchorPane {

    private Blade blade;
    private @FXML ImageView bladeThumb;
    private @FXML ImageView bladeWeapon;
    private @FXML ImageView bladeDriver;
    private @FXML ImageView bladeElement;
    private @FXML ImageView bladeRole;
    private @FXML Label bladeLabel;
    private BladeSelection parent;

    public BladeView(Blade blade, BladeSelection parent) {
        this.parent = parent;
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getClassLoader().getResource("fxml/blade.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        this.blade = blade;
        init();
    }

    private javafx.scene.image.Image toFXImage(BufferedImage img) {
        return SwingFXUtils.toFXImage(img, null);
    }

    private void init() {
        if(blade.getData().getCreator().getValue() != 0)
            this.bladeDriver.setImage(toFXImage(Driver.fromId(blade.getData().getCreator().getValue()).getDriverThumb().getImage()));
        if(blade.getThumbnail() != null)
            this.bladeThumb.setImage(toFXImage(blade.getThumbnail().getImage()));
        if(blade.getWeapon() != null)
            this.bladeWeapon.setImage(toFXImage(blade.getWeapon().getThumbnail().getImage()));
        if(blade.getElement() != null)
            this.bladeElement.setImage(toFXImage(blade.getElement().getThumbnail().getImage()));
        if(blade.getRole() != null)
            this.bladeRole.setImage(toFXImage(blade.getRole().getThumbnail().getImage()));
        this.bladeLabel.setText(blade.getName());
        FontLoader fontLoader = Toolkit.getToolkit().getFontLoader();
        this.bladeLabel.setLayoutX((128-fontLoader.computeStringWidth(blade.getName(), bladeLabel.getFont()))/2);
        this.setOnMouseClicked(event -> parent.setSelectedBlade(blade));
    }

}
