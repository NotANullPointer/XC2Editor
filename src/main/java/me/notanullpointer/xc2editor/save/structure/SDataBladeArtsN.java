package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;

public class SDataBladeArtsN {

    public Int16 id;
    public Int16 recastRev;
    public Int16 field_4;
    public Int16 field_6;
    public Int16 field_8;
    public Int16 field_A;

    public SDataBladeArtsN fromByteArray(byte[] data) {
        id = load16(data, 0x0);
        recastRev = load16(data, 0x2);
        field_4 = load16(data, 0x4);
        field_6 = load16(data, 0x6);
        field_8 = load16(data, 0x8);
        field_A = load16(data, 0xA);
        return this;
    }

}
