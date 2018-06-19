package me.notanullpointer.xc2editor.save.parser;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class String32 implements SaveComponent {

    Int8 string[] = new Int8[32];
    Int32 length;

    @Override
    public byte[] toByteArray() {
        //TODO: STUB
        return new byte[0];
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < length.getValue(); i++) {
            res.append(string[i].getValue());
        }
        return res.toString();
    }

    @Override
    public String32 fromByteArray(byte[] bytes) {
        for(int i = 0x0; i<0x20; i++) {
            Int8 val = new Int8();
            val.setValue((char)bytes[i]);
            this.string[i] = val;
        }
        this.length = new Int32().fromByteArray(arrayRange(bytes, 0x20, 0x24));
        return this;
    }
}
