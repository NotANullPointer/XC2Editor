package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.load32;

public class ItemInfo {

    private Int32 data;
    private Int32 time;
    private Int32 serial;

    public ItemInfo fromByteArray(byte[] data) {
        this.data = load32(data, 0x0);
        time = load32(data, 0x4);
        serial = load32(data, 0x8);
        return this;
    }

    public short getId() {
        return (short)(data.getValue() & 0x00001FFF);
    }

    public byte getType() {
        return (byte)((data.getValue() & 0x0007E000) >> 13);
    }

    public short getCount() {
        return (short)((data.getValue() & 0x1FF80000) >> 19);
    }

    public boolean isEquipped() {
        return ((data.getValue() & 0x40000000) >> 30) == 1;
    }

    public int getSerial() {
        return (serial.getValue() & 0x03FFFFFF);
    }

    private int mask;

    public void setId(short newId) {
        mask = 0x00001FFF;
        data.setValue((data.getValue() & (~mask)) | (newId & mask));
    }

    public void setType(byte newType) {
        mask = 0x0007E000;
        data.setValue((data.getValue() & (~mask)) | ((newType << 13) & mask));
    }

    public void setCount(short newCount) {
        mask = 0x1FF80000;
        data.setValue((data.getValue() & (~mask)) | ((newCount << 19) & mask));
    }

    public void setEquipped(boolean isEquipped) {
        mask = 0x40000000;
        data.setValue((data.getValue() & (~mask)) | (((isEquipped ? 1 : 0) << 30) & mask));
    }

    public void setSerial(int newSerial) {
        mask = 0x03FFFFFF;
        serial.setValue((serial.getValue() & (~mask)) | ((newSerial) & mask));
    }

}
