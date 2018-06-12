package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;
import me.notanullpointer.xc2editor.save.parser.Int8;

public class GameFlag {

    public Int8 flags1bit[/*8192*/]; //8 flags for each
    public Int16 flags2bit[/*8192*/]; //4 flags for each
    public Int8 flag4bit[/*4096*/]; //2 flags for each
    public Int8 flags8bit[/*8192*/]; //1 flag for each
    public Int16 flags16bit[/*3072*/]; //1 flag for each
    public Int32 flags32bit[/*3336*/]; //1 flag for each

}
