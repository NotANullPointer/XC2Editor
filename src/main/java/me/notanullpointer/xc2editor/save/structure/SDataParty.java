package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;
import me.notanullpointer.xc2editor.save.parser.Int8;

import static me.notanullpointer.xc2editor.save.parser.Utils.*;

public class SDataParty {

    public SDataPartyMember members[/*10*/];
    public Int8 gap3C[/*4*/];
    public Int32 partyLeader;
    public Int32 field_44;
    public Int32 field_48;
    public Int16 partyGauge;
    public Int16 field_4E;
    public Int32 field_50;

    public SDataParty fromByteArray(byte[] data) {
        gap3C = loadGap(data, 0x3C, 4);
        partyLeader = load32(data, 0x40);
        field_44 = load32(data, 0x44);
        field_48 = load32(data, 0x48);
        partyGauge = load16(data, 0x4C);
        field_4E = load16(data, 0x4E);
        field_50 = load32(data, 0x50);
        return this;
    }

    private SDataPartyMember[] loadPartyMembers(byte[] data) {
        SDataPartyMember[] res = new SDataPartyMember[10];
        for(int i = 0; i < 10; i++) {
            res[i] = new SDataPartyMember().fromByteArray(arrayRange(data, 0x6*i, 0x6*(i+1)));
        }
        return res;
    }
}
