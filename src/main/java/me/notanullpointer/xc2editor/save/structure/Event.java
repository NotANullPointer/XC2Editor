package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;

public class Event {

    public Int16 eventId;
    public Int16 creator;
    public Int16 playBladeId;
    public Int16 voiceId;
    public Int16 attribute;
    public Int16 extraParts;
    public Int16 a;
    public Int16 weapons[/*10*/];
    public Int16 b[/*6*/];
    public Int16 blades[/*10*/];
    public Int16 c[/*5*/];
    public Int32 gameTime;
    public Int16 currentMapWeatherId;
    public Int16 currentWtrType;
    public Int16 d[/*8*/];

}
