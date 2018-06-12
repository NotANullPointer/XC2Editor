package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum Driver {

    REX(Image.REX, "Rex", (byte)0x01),
    NIA(Image.NIA, "Nia", (byte)0x02),
    TORA(Image.TORA, "Tora", (byte)0x04),
    VANDHAM(Image.VANDHAM, "Vandham", (byte)0x05),
    MORAG(Image.MORAG, "Mòrag", (byte)0x06),
    ZEKE(Image.ZEKE, "Zeke", (byte)0x03),
    MALOS(Image.MALOS, "Malos", (byte)0x08),
    JIN_CHAP1(Image.JIN, "Jin (Chapter 1)", (byte)0x07),
    JIN_CHAP8(Image.JIN, "Jin (Chapter 8)", (byte)0x09),
    JIN_CHALLENGE(Image.JIN, "Jin (DLC)", (byte)0x12);

    Image driverImg;
    String driverName;
    byte driverId;

    Driver(Image img, String name, byte id) {
        this.driverImg = img;
        this.driverName = name;
        this.driverId = id;
    }

    public Image getDriverImage() {
        return driverImg;
    }

    public String getDriverName() {
        return driverName;
    }

    public byte getDriverId() {
        return driverId;
    }
}
