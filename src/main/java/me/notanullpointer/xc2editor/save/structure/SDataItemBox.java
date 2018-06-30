package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;
import static me.notanullpointer.xc2editor.save.parser.Utils.loadArr32;

public class SDataItemBox {

    public ItemInfo pcWpnChipBox[/*200*/];
    public ItemInfo pcEquipBox[/*900*/];
    public ItemInfo equipOrbBox[/*500*/];
    public ItemInfo salvageBox[/*200*/];
    public ItemInfo preciousBox[/*500*/];
    public ItemInfo infoBox[/*200*/];
    public ItemInfo eventBox[/*100*/];
    public ItemInfo collectionListBox[/*500*/];
    public ItemInfo treasureBox[/*200*/];
    public ItemInfo emptyOrbBox[/*500*/];
    public ItemInfo favoriteBox[/*500*/];
    public ItemInfo crystalListBox[/*200*/];
    public ItemInfo boosterBox[/*200*/];
    public ItemInfo hanaRoleBox[/*200*/];
    public ItemInfo hanaAtrBox[/*200*/];
    public ItemInfo hanaArtsBox[/*200*/];
    public ItemInfo hanaNArtsBox[/*200*/];
    public ItemInfo hanaAssistBox[/*700*/];
    public Int32 serials[/*19*/];
    
    int[][] posLen = {{0x0, 0xC8}, {0xC8*0xC, 0x384}, {0x44C*0xC, 0x1F4}, {0x640*0xC, 0xC8},
                      {0x708*0xC, 0x1F4}, {0x8FC*0xC, 0xC8}, {0x9C4*0xC, 0x64}, {0xA28*0xC, 0x1F4},
                      {0xC1C*0xC, 0xC8}, {0xCE4*0xC, 0x1F4}, {0xED8*0xC, 0x1F4}, {0x10CC*0xC, 0xC8},
                      {0x1194*0xC, 0xC8}, {0x125C*0xC, 0xC8}, {0x1324*0xC, 0xC8}, {0x13EC*0xC, 0xC8},
                      {0x14B4*0xC, 0xC8}, {0x157C*0xC, 0x2BC}};

    public SDataItemBox fromByteArray(byte[] data) {
        for(int i = 1; i<19; i++) {
            loadItemInfo(data, i);
        }
        serials = loadArr32(data, 0x122A0, 19);
        return this;
    }
    
    private ItemInfo[] loadItemInfo(byte[] data, int num) {
        ItemInfo[] res = new ItemInfo[posLen[num-1][1]];
        for(int i = 0; i < posLen[num-1][1]; i++) {
            res[i] = new ItemInfo().fromByteArray(arrayRange(data, posLen[num-1][0]+0xC*i, posLen[num-1][0]+0xC*(i+1)));
        }
        return res;
    }

}
