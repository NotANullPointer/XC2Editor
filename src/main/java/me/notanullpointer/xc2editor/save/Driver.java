package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;
import me.notanullpointer.xc2editor.save.structure.SDataDriver;

import java.util.ArrayList;

public enum Driver {

    REX(Image.REX, Image.MD_REX_T, "Rex", (short)0x01),
    NIA(Image.NIA, Image.NIA_T, "Nia", (short)0x02),
    TORA(Image.TORA, Image.TORA_T, "Tora", (short)0x04),
    VANDHAM(Image.VANDHAM, Image.VANDHAM_T, "Vandham", (short)0x05),
    MORAG(Image.MORAG, Image.MORAG_T, "Mòrag", (short)0x06),
    ZEKE(Image.ZEKE, Image.ZEKE_T, "Zeke", (short)0x03),
    MALOS(Image.MALOS, Image.MALOS_T, "Malos", (short)0x08),
    JIN_CHAP1(Image.JIN, Image.JIN_T, "Jin (Chapter 1)", (short)0x07),
    JIN_CHAP8(Image.JIN, Image.JIN_T, "Jin (Chapter 8)", (short)0x09),
    JIN_CHALLENGE(Image.JIN, Image.JIN_T, "Jin (DLC)", (short)0xC);

    Image driverImg;
    Image driverThumb;
    String driverName;
    short driverId;
    SDataDriver data;

    Driver(Image img, Image thumb, String name, short id) {
        this.driverImg = img;
        this.driverThumb = thumb;
        this.driverName = name;
        this.driverId = id;
    }

    public Image getDriverImage() {
        return driverImg;
    }

    public Image getDriverThumb() {
        return driverThumb;
    }

    public String getDriverName() {
        return driverName;
    }

    public short getDriverId() {
        return driverId;
    }

    public void linkTo(SDataDriver data) {
        this.data = data;
    }

    public SDataDriver getData() {
        return data;
    }

    public static Driver fromName(String name) {
        for (Driver dr:values()) {
            if(name.equalsIgnoreCase(dr.getDriverName()))
                return dr;
        }
        return null;
    }

    public static Driver fromId(short id) {
        for (Driver dr:values()) {
            if(dr.getDriverId() == id)
                return dr;
        }
        return null;
    }

    public static String[] stringValues() {
        ArrayList<String> strValues = new ArrayList<>();
        for(Driver dr:values()) {
            strValues.add(dr.getDriverName());
        }
        return strValues.toArray(new String[0]);
    }
}
