package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;

public class SDataPartyMember {

    public Int16 driverId;
    public Int16 field_2;
    public Int16 field_4;

    public SDataPartyMember fromByteArray(byte[] data) {
        driverId = load16(data, 0x0);
        field_2 = load16(data, 0x2);
        field_4 = load16(data, 0x4);
        return this;
    }

}
