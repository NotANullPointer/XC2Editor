package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;

public class ArtsEnhance {

    public Int16 enhanceRev;
    public Int16 recastRev;
    public Int16 itemId;
    public Int16 field_6;
    public Int16 field_8;
    public Int16 field_A;

    public ArtsEnhance fromByteArray(byte[] data) {
        enhanceRev = load16(data, 0x0);
        recastRev = load16(data, 0x2);
        itemId = load16(data, 0x4);
        field_6 = load16(data, 0x6);
        field_8 = load16(data, 0x8);
        field_A = load16(data, 0xA);
        return this;
    }

}
