package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class SDataIdea {

    public Int32 pointCount;
    public Int32 ideaLevel;

    public SDataIdea fromByteArray(byte[] data) {
        pointCount = new Int32().fromByteArray(arrayRange(data, 0, 4));
        ideaLevel = new Int32().fromByteArray(arrayRange(data, 4, 8));
        return this;
    }

    public Int32 getPointCount() {
        return pointCount;
    }

    public Int32 getIdeaLevel() {
        return ideaLevel;
    }
}
