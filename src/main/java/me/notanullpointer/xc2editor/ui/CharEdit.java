package me.notanullpointer.xc2editor.ui;

import com.jfoenix.controls.*;
import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.Toolkit;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import me.notanullpointer.xc2editor.assets.Image;
import me.notanullpointer.xc2editor.save.Accessory;
import me.notanullpointer.xc2editor.save.Blade;
import me.notanullpointer.xc2editor.save.Driver;
import me.notanullpointer.xc2editor.save.PouchItem;
import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Utils;
import me.notanullpointer.xc2editor.save.structure.DriverArt;
import me.notanullpointer.xc2editor.save.structure.SDataDriver;
import me.notanullpointer.xc2editor.save.structure.SDataIdea;
import me.notanullpointer.xc2editor.save.structure.SDataPouch;
import org.controlsfx.control.PopOver;
import org.controlsfx.control.textfield.TextFields;

import java.awt.image.BufferedImage;

public class CharEdit {

    private boolean shouldOpenPouch1 = true, shouldOpenPouch2 = true, shouldOpenPouch3 = true;
    private boolean shouldOpenAccessory1 = true, shouldOpenAccessory2 = true, shouldOpenAccessory3 = true;

    private Driver driver;

    private @FXML ImageView driverImg;
    private @FXML Label driverName;
    private @FXML ImageView accessory0;
    private @FXML ImageView accessory1;
    private @FXML ImageView accessory2;
    private @FXML ImageView pouch0;
    private @FXML ImageView pouch1;
    private @FXML ImageView pouch2;
    private @FXML JFXCheckBox pouchToggle1;
    private @FXML JFXCheckBox pouchToggle2;
    private @FXML JFXCheckBox accessoryToggle2;
    private @FXML ImageView bladeBase;
    private @FXML ImageView bravery;
    private @FXML ImageView truth;
    private @FXML ImageView compassion;
    private @FXML ImageView justice;
    private @FXML ImageView blade1;
    private @FXML ImageView blade2;
    private @FXML ImageView blade3;

    private @FXML JFXSlider levelSlider;
    private @FXML JFXSlider braverySlider;
    private @FXML JFXSlider truthSlider;
    private @FXML JFXSlider compassionSlider;
    private @FXML JFXSlider justiceSlider;
    private @FXML JFXTextField bonusExpTextBox;
    private @FXML JFXTextField skillPointsTextBox;
    private @FXML JFXTextField weaponPointsTextBox;
    private @FXML JFXComboBox<String> pouchText0;
    private @FXML JFXComboBox<String> pouchText1;
    private @FXML JFXComboBox<String> pouchText2;
    private @FXML JFXComboBox<String> accessorySelection0;
    private @FXML JFXComboBox<String> accessorySelection1;
    private @FXML JFXComboBox<String> accessorySelection2;

    public void setDriver(Driver driver) {
        this.driver = driver;
        FontLoader fontLoader = Toolkit.getToolkit().getFontLoader();
        driverImg.setImage(SwingFXUtils.toFXImage(driver.getDriverImage().getImage(), null));
        driverName.setText(driver.getDriverName());
        driverName.setLayoutX(9+(135-fontLoader.computeStringWidth(driverName.getText(), driverName.getFont()))/2);
        accessory0.setImage(toFXImage(Image.UNKNOWN.getImage()));
        accessory1.setImage(toFXImage(Image.UNKNOWN.getImage()));
        accessory2.setImage(toFXImage(Image.UNKNOWN.getImage()));
        pouch0.setImage(toFXImage(Image.UNKNOWN.getImage()));
        pouch1.setImage(toFXImage(Image.UNKNOWN.getImage()));
        pouch2.setImage(toFXImage(Image.UNKNOWN.getImage()));
        bladeBase.setImage(toFXImage(Image.BLADE_BASE.getImage()));
        bravery.setImage(toFXImage(Image.BRAVERY.getImage()));
        truth.setImage(toFXImage(Image.TRUTH.getImage()));
        compassion.setImage(toFXImage(Image.COMPASSION.getImage()));
        justice.setImage(toFXImage(Image.JUSTICE.getImage()));
        pouchText0.getItems().addAll(PouchItem.stringValues());
        pouchText0.setEditable(true);
        TextFields.bindAutoCompletion(pouchText0.getEditor(), pouchText0.getItems());
        pouchText1.getItems().addAll(PouchItem.stringValues());
        pouchText1.setEditable(true);
        TextFields.bindAutoCompletion(pouchText1.getEditor(), pouchText1.getItems());
        pouchText2.getItems().addAll(PouchItem.stringValues());
        pouchText2.setEditable(true);
        TextFields.bindAutoCompletion(pouchText2.getEditor(), pouchText2.getItems());
        accessorySelection0.getItems().addAll(Accessory.stringValues());
        accessorySelection0.setEditable(true);
        TextFields.bindAutoCompletion(accessorySelection0.getEditor(), accessorySelection0.getItems());
        accessorySelection1.getItems().addAll(Accessory.stringValues());
        accessorySelection1.setEditable(true);
        TextFields.bindAutoCompletion(accessorySelection1.getEditor(), accessorySelection1.getItems());
        accessorySelection2.getItems().addAll(Accessory.stringValues());
        accessorySelection2.setEditable(true);
        TextFields.bindAutoCompletion(accessorySelection2.getEditor(), accessorySelection2.getItems());

        SDataDriver dataDriver = driver.getData();
        levelSlider.setValue(dataDriver.getLevel().getValue());
        braverySlider.setValue(dataDriver.getIdeaLevels()[0].ideaLevel.getValue());
        truthSlider.setValue(dataDriver.getIdeaLevels()[1].ideaLevel.getValue());
        compassionSlider.setValue(dataDriver.getIdeaLevels()[2].ideaLevel.getValue());
        justiceSlider.setValue(dataDriver.getIdeaLevels()[3].ideaLevel.getValue());
        bonusExpTextBox.setText(Integer.toString(dataDriver.getExp().getValue()));
        weaponPointsTextBox.setText("0");
        skillPointsTextBox.setText(Integer.toString(dataDriver.getSkillPoints().getValue()));

        Blade setBlade1 = Blade.fromId(dataDriver.getEquippedBlades()[0].getValue());
        Blade setBlade2 = Blade.fromId(dataDriver.getEquippedBlades()[1].getValue());
        Blade setBlade3 = Blade.fromId(dataDriver.getEquippedBlades()[2].getValue());
        if(setBlade1 != null)
            blade1.setImage(toFXImage(setBlade1.getThumbnail().getImage()));
        if(setBlade2 != null)
            blade2.setImage(toFXImage(setBlade2.getThumbnail().getImage()));
        if(setBlade3 != null)
            blade3.setImage(toFXImage(setBlade3.getThumbnail().getImage()));

        if(dataDriver.getPouchInfo()[1].isEnabled.getValue() == 1) {
            togglePouch1();
            pouchToggle1.setSelected(true);
        }
        if(dataDriver.getPouchInfo()[2].isEnabled.getValue() == 1) {
            togglePouch2();
            pouchToggle2.setSelected(true);
        }

        PouchItem pouchItem1 = PouchItem.fromId(dataDriver.getPouchInfo()[0].itemId.getValue());
        PouchItem pouchItem2 = PouchItem.fromId(dataDriver.getPouchInfo()[1].itemId.getValue());
        PouchItem pouchItem3 = PouchItem.fromId(dataDriver.getPouchInfo()[2].itemId.getValue());
        if(pouchItem1 != null) {
            pouch0.setImage(toFXImage(pouchItem1.getCategory().getImage().getImage()));
            pouchText0.setValue(pouchItem1.getName());
        }
        if(pouchItem2 != null) {
            pouch1.setImage(toFXImage(pouchItem2.getCategory().getImage().getImage()));
            pouchText1.setValue(pouchItem2.getName());
        }
        if(pouchItem3 != null) {
            pouch2.setImage(toFXImage(pouchItem3.getCategory().getImage().getImage()));
            pouchText2.setValue(pouchItem3.getName());
        }

        if((byte)dataDriver.isAccessory2Enabled().getValue() == (byte)0x80) {
            toggleAccessory2();
            accessoryToggle2.setSelected(true);
        }

        Accessory accessory1 = Accessory.fromId(dataDriver.getAccessoryId0().getValue());
        Accessory accessory2 = Accessory.fromId(dataDriver.getAccessoryId1().getValue());
        Accessory accessory3 = Accessory.fromId(dataDriver.getAccessoryId2().getValue());
        if(accessory1 != null) {
            this.accessory0.setImage(toFXImage(accessory1.getIcon().getImage()));
            accessorySelection0.setValue(accessory1.getName());
        }
        if(accessory2 != null) {
            this.accessory1.setImage(toFXImage(accessory2.getIcon().getImage()));
            accessorySelection1.setValue(accessory2.getName());
        }
        if(accessory3 != null) {
            this.accessory2.setImage(toFXImage(accessory3.getIcon().getImage()));
            accessorySelection2.setValue(accessory3.getName());
        }

        bonusExpTextBox.setOnKeyTyped(this::allowNumbers);
        weaponPointsTextBox.setOnKeyTyped(this::allowNumbers);
        skillPointsTextBox.setOnKeyTyped(this::allowNumbers);
    }

    public void toggleAccessory2() {
        accessory2.setDisable(!accessory2.isDisable());
        accessorySelection2.setDisable(!accessorySelection2.isDisable());
    }

    public void togglePouch1() {
        pouch1.setDisable(!pouch1.isDisable());
        pouchText1.setDisable(!pouchText1.isDisable());
    }

    public void togglePouch2() {
        pouch2.setDisable(!pouch2.isDisable());
        pouchText2.setDisable(!pouchText2.isDisable());
    }

    public void updateImagePouch1() {
        PouchItem pouchItem1 = PouchItem.fromName(pouchText0.getValue());
        pouch0.setImage(pouchItem1 != null ? toFXImage(pouchItem1.getCategory().getImage().getImage()) : toFXImage(Image.UNKNOWN.getImage()));
    }

    public void updateImagePouch2() {
        PouchItem pouchItem2 = PouchItem.fromName(pouchText1.getValue());
        pouch1.setImage(pouchItem2 != null ? toFXImage(pouchItem2.getCategory().getImage().getImage()) : toFXImage(Image.UNKNOWN.getImage()));
    }

    public void updateImagePouch3() {
        PouchItem pouchItem3 = PouchItem.fromName(pouchText2.getValue());
        pouch2.setImage(pouchItem3 != null ? toFXImage(pouchItem3.getCategory().getImage().getImage()) : toFXImage(Image.UNKNOWN.getImage()));
    }

    public void updateImageAccessory1() {
        Accessory accessory1 = Accessory.fromName(accessorySelection0.getValue());
        accessory0.setImage(accessory1 != null ? toFXImage(accessory1.getIcon().getImage()) : toFXImage(Image.UNKNOWN.getImage()));
    }

    public void updateImageAccessory2() {
        Accessory accessory2 = Accessory.fromName(accessorySelection1.getValue());
        accessory1.setImage(accessory2 != null ? toFXImage(accessory2.getIcon().getImage()) : toFXImage(Image.UNKNOWN.getImage()));
    }

    public void updateImageAccessory3() {
        Accessory accessory3 = Accessory.fromName(accessorySelection2.getValue());
        accessory2.setImage(accessory3 != null ? toFXImage(accessory3.getIcon().getImage()) : toFXImage(Image.UNKNOWN.getImage()));
    }

    public void allowNumbers(KeyEvent e) {
        if (!(e.getCharacter().equals("0") || e.getCharacter().equals("1") || e.getCharacter().equals("2")
                || e.getCharacter().equals("3") || e.getCharacter().equals("4") || e.getCharacter().equals("5")
                || e.getCharacter().equals("6") || e.getCharacter().equals("7") || e.getCharacter().equals("8") || e.getCharacter().equals("9")))
        e.consume();
    }

    public void infoPouch1() {
        if (shouldOpenPouch1) {
            PouchItem pouchItem1 = PouchItem.fromName(pouchText0.getValue() == null ? "" : pouchText0.getValue());
            String info;
            info = pouchItem1 != null ? String.format("Name: %s\tCategory: %s\n\nEffects:\n\t%s\n\t%s\n\t%s\n\nDuration: %d minutes\n",
                    pouchItem1.getName(), pouchItem1.getCategory().getName(), pouchItem1.getPouchEffect().getEffect1(), pouchItem1.getPouchEffect().getEffect2(), pouchItem1.getPouchEffect().getEffect3(), pouchItem1.getDuration()) : "No Item";
            PopOver popOver = new PopOver();
            Label content = new Label(info);
            content.setPadding(new Insets(20, 20, 20, 20));
            popOver.setContentNode(content);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenPouch1 = true);
            shouldOpenPouch1 = false;
            popOver.show(pouch0);
        }
    }

    public void infoPouch2() {
        if (shouldOpenPouch2) {
            PouchItem pouchItem2 = PouchItem.fromName(pouchText1.getValue() == null ? "" : pouchText1.getValue());
            String info;
            info = pouchItem2 != null ? String.format("Name: %s\tCategory: %s\n\nEffects:\n\t%s\n\t%s\n\t%s\n\nDuration: %d minutes\n",
                    pouchItem2.getName(), pouchItem2.getCategory().getName(), pouchItem2.getPouchEffect().getEffect1(), pouchItem2.getPouchEffect().getEffect2(), pouchItem2.getPouchEffect().getEffect3(), pouchItem2.getDuration()) : "No Item";
            PopOver popOver = new PopOver();
            Label content = new Label(info);
            content.setPadding(new Insets(20, 20, 20, 20));
            popOver.setContentNode(content);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenPouch2 = true);
            shouldOpenPouch2 = false;
            popOver.show(pouch1);
        }
    }

    public void infoPouch3() {
        if (shouldOpenPouch3) {
            PouchItem pouchItem3 = PouchItem.fromName(pouchText2.getValue() == null ? "" : pouchText2.getValue());
            String info;
            info = pouchItem3 != null ? String.format("Name: %s\tCategory: %s\n\nEffects:\n\t%s\n\t%s\n\t%s\n\nDuration: %d minutes\n",
                    pouchItem3.getName(), pouchItem3.getCategory().getName(), pouchItem3.getPouchEffect().getEffect1(), pouchItem3.getPouchEffect().getEffect2(), pouchItem3.getPouchEffect().getEffect3(), pouchItem3.getDuration()) : "No Item";
            PopOver popOver = new PopOver();
            Label content = new Label(info);
            content.setPadding(new Insets(20, 20, 20, 20));
            popOver.setContentNode(content);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenPouch3 = true);
            shouldOpenPouch3 = false;
            popOver.show(pouch2);
        }
    }

    public void infoAccessory1() {
        if (shouldOpenAccessory1) {
            Accessory accessory1 = Accessory.fromName(accessorySelection0.getValue() == null ? "" : accessorySelection0.getValue());
            String info;
            info = accessory1 != null ? String.format("Name: %s\tRarity: %s\n\nEffect:\n\t%s\n", Utils.mergeArrayWithoutLastElement(accessory1.getName().split(" ")), Utils.lastArrayElement(accessory1.getName().split(" ")), accessory1.getDescription()) : "No Item";
            PopOver popOver = new PopOver();
            Label content = new Label(info);
            content.setPadding(new Insets(20, 20, 20, 20));
            popOver.setContentNode(content);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenAccessory1 = true);
            shouldOpenAccessory1 = false;
            popOver.show(accessory0);
        }
    }

    public void infoAccessory2() {
        if (shouldOpenAccessory2) {
            Accessory accessory2 = Accessory.fromName(accessorySelection1.getValue() == null ? "" : accessorySelection1.getValue());
            String info;
            info = accessory2 != null ? String.format("Name: %s\tRarity: %s\n\nEffect:\n\t%s\n", Utils.mergeArrayWithoutLastElement(accessory2.getName().split(" ")), Utils.lastArrayElement(accessory2.getName().split(" ")), accessory2.getDescription()) : "No Item";
            PopOver popOver = new PopOver();
            Label content = new Label(info);
            content.setPadding(new Insets(20, 20, 20, 20));
            popOver.setContentNode(content);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenAccessory2 = true);
            shouldOpenAccessory2 = false;
            popOver.show(accessory1);
        }
    }

    public void infoAccessory3() {
        if (shouldOpenAccessory3) {
            Accessory accessory3 = Accessory.fromName(accessorySelection2.getValue() == null ? "" : accessorySelection2.getValue());
            String info;
            info = accessory3 != null ? String.format("Name: %s\tRarity: %s\n\nEffect:\n\t%s\n", Utils.mergeArrayWithoutLastElement(accessory3.getName().split(" ")), Utils.lastArrayElement(accessory3.getName().split(" ")), accessory3.getDescription()) : "No Item";
            PopOver popOver = new PopOver();
            Label content = new Label(info);
            content.setPadding(new Insets(20, 20, 20, 20));
            popOver.setContentNode(content);
            popOver.setAutoHide(true);
            popOver.setAutoFix(true);
            popOver.setOnHiding(e -> shouldOpenAccessory3 = true);
            shouldOpenAccessory3 = false;
            popOver.show(accessory2);
        }
    }

    public SDataDriver save() {
        SDataDriver sDataDriver = new SDataDriver().fromByteArray(driver.getData().getRawData());
        sDataDriver.getSkillPoints().setValue(Integer.valueOf(skillPointsTextBox.getText()));
        for (DriverArt weapon:sDataDriver.getWeapons())
            weapon.weaponPoints.setValue(Integer.valueOf(weaponPointsTextBox.getText()));
        sDataDriver.getExp().setValue(Integer.valueOf(bonusExpTextBox.getText()));
        SDataIdea[] ideas = sDataDriver.getIdeaLevels();
        ideas[0].getIdeaLevel().setValue((int)braverySlider.getValue());
        ideas[1].getIdeaLevel().setValue((int)truthSlider.getValue());
        ideas[2].getIdeaLevel().setValue((int)compassionSlider.getValue());
        ideas[3].getIdeaLevel().setValue((int)justiceSlider.getValue());
        PouchItem pouchItem1 = PouchItem.fromName(pouchText0.getValue() == null ? "" : pouchText0.getValue());
        PouchItem pouchItem2 = PouchItem.fromName(pouchText1.getValue() == null ? "" : pouchText1.getValue());
        PouchItem pouchItem3 = PouchItem.fromName(pouchText2.getValue() == null ? "" : pouchText2.getValue());
        Accessory accessory1 = Accessory.fromName(accessorySelection0.getValue() == null ? "" : accessorySelection0.getValue());
        Accessory accessory2 = Accessory.fromName(accessorySelection1.getValue() == null ? "" : accessorySelection1.getValue());
        Accessory accessory3 = Accessory.fromName(accessorySelection2.getValue() == null ? "" : accessorySelection2.getValue());
        SDataPouch[] pouch = sDataDriver.getPouchInfo();
        pouch[0].itemId.setValue(pouchItem1 == null ? pouch[0].itemId.getValue() : (short)pouchItem1.getId());
        pouch[0].time.setValue(pouchItem1 == null ? pouch[0].time.getValue() : (short)pouchItem1.getDuration());
        pouch[1].itemId.setValue(pouchItem2 == null ? pouch[1].itemId.getValue() : (short)pouchItem2.getId());
        pouch[1].time.setValue(pouchItem2 == null ? pouch[1].time.getValue() : (short)pouchItem2.getDuration());
        pouch[2].itemId.setValue(pouchItem3 == null ? pouch[2].itemId.getValue() : (short)pouchItem3.getId());
        pouch[2].time.setValue(pouchItem3 == null ? pouch[2].time.getValue() : (short)pouchItem3.getDuration());
        Int16 accessoryId0 = sDataDriver.getAccessoryId0();
        Int16 accessoryId1 = sDataDriver.getAccessoryId1();
        Int16 accessoryId2 = sDataDriver.getAccessoryId2();
        accessoryId0.setValue(accessory1 == null ? accessoryId0.getValue() : (short)accessory1.getId());
        accessoryId1.setValue(accessory2 == null ? accessoryId1.getValue() : (short)accessory2.getId());
        accessoryId2.setValue(accessory3 == null ? accessoryId2.getValue() : (short)accessory3.getId());
        sDataDriver.isAccessory2Enabled().setValue(accessoryToggle2.isSelected() ? (char)0x80 : (char)0x0);
        return sDataDriver;
    }

    private javafx.scene.image.Image toFXImage(BufferedImage img) {
        return SwingFXUtils.toFXImage(img, null);
    }

}
