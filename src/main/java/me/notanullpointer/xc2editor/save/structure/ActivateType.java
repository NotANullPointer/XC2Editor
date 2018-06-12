package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

public enum ActivateType {

    UNUSE(new Int16().setValue((short)0)),
    PARTY(new Int16().setValue((short)1)),
    MERCENARY_TEAM(new Int16().setValue((short)2));

    public Int16 id;

    ActivateType(Int16 id) {
        this.id = id;
    }

}
