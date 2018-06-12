package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;
import me.notanullpointer.xc2editor.save.parser.Int8;

public class SDataParty {

    public SDataPartyMember members[/*10*/];
    public Int8 gap3C[/*4*/];
    public Int32 partyLeader;
    public Int32 field_44;
    public Int32 field_48;
    public Int16 partyGauge;
    public Int16 field_4E;
    public Int32 field_50;

}
