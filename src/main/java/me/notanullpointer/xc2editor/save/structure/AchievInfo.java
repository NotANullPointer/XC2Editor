package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;
import static me.notanullpointer.xc2editor.save.parser.Utils.load16;

public class AchievInfo {

    public Int16 id;
    public Int16 alignment;
    public AchievQuest achievQuest[/*5*/];

    public AchievInfo fromByteArray(byte[] data) {
        id = load16(data, 0x0);
        alignment = load16(data, 0x2);
        achievQuest = loadIdeas(data);
        return this;
    }

    private AchievQuest[] loadIdeas(byte[] data) {
        AchievQuest[] res = new AchievQuest[5];
        for(int i = 0; i < 5; i++) {
            res[i] = new AchievQuest().fromByteArray(arrayRange(data, 0x4+0x1C*i, 0x4+0x1C*(i+1)));
        }
        return res;
    }

}
