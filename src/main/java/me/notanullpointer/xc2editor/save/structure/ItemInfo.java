package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.load32;

public class ItemInfo {

    public Int32 data;
    public Int32 time;
    public Int32 serial;

    public ItemInfo fromByteArray(byte[] data) {
        this.data = load32(data, 0x0);
        time = load32(data, 0x4);
        serial = load32(data, 0x8);
        return this;
    }

}
