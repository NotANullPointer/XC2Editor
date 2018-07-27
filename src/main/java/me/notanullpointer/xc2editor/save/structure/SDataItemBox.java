package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;
import static me.notanullpointer.xc2editor.save.parser.Utils.loadArr32;

public class SDataItemBox {

    private ItemInfo pcWpnChipBox[/*200*/];
    private ItemInfo pcEquipBox[/*900*/];
    private ItemInfo equipOrbBox[/*500*/];
    private ItemInfo salvageBox[/*200*/];
    private ItemInfo preciousBox[/*500*/];
    private ItemInfo infoBox[/*200*/];
    private ItemInfo eventBox[/*100*/];
    private ItemInfo collectionListBox[/*500*/];
    private ItemInfo treasureBox[/*200*/];
    private ItemInfo emptyOrbBox[/*500*/];
    private ItemInfo favoriteBox[/*500*/];
    private ItemInfo crystalListBox[/*200*/];
    private ItemInfo boosterBox[/*200*/];
    private ItemInfo hanaRoleBox[/*200*/];
    private ItemInfo hanaAtrBox[/*200*/];
    private ItemInfo hanaArtsBox[/*200*/];
    private ItemInfo hanaNArtsBox[/*200*/];
    private ItemInfo hanaAssistBox[/*700*/];
    private Int32 serials[/*19*/];
    
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

    public ItemInfo[] getPcWpnChipBox() {
        return pcWpnChipBox;
    }

    public ItemInfo[] getPcEquipBox() {
        return pcEquipBox;
    }

    public ItemInfo[] getEquipOrbBox() {
        return equipOrbBox;
    }

    public ItemInfo[] getSalvageBox() {
        return salvageBox;
    }

    public ItemInfo[] getPreciousBox() {
        return preciousBox;
    }

    public ItemInfo[] getInfoBox() {
        return infoBox;
    }

    public ItemInfo[] getEventBox() {
        return eventBox;
    }

    public ItemInfo[] getCollectionListBox() {
        return collectionListBox;
    }

    public ItemInfo[] getTreasureBox() {
        return treasureBox;
    }

    public ItemInfo[] getEmptyOrbBox() {
        return emptyOrbBox;
    }

    public ItemInfo[] getFavoriteBox() {
        return favoriteBox;
    }

    public ItemInfo[] getCrystalListBox() {
        return crystalListBox;
    }

    public ItemInfo[] getBoosterBox() {
        return boosterBox;
    }

    public ItemInfo[] getHanaRoleBox() {
        return hanaRoleBox;
    }

    public ItemInfo[] getHanaAtrBox() {
        return hanaAtrBox;
    }

    public ItemInfo[] getHanaArtsBox() {
        return hanaArtsBox;
    }

    public ItemInfo[] getHanaNArtsBox() {
        return hanaNArtsBox;
    }

    public ItemInfo[] getHanaAssistBox() {
        return hanaAssistBox;
    }

    public Int32[] getSerials() {
        return serials;
    }
}
