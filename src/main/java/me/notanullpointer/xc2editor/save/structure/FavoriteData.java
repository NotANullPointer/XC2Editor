package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;

public class FavoriteData {

    public Int16 favoriteCategory;
    public Int16 favoriteItem;
    public Int16 favoriteCategoryDiscovered;
    public Int16 favoriteItemDiscovered;

    public FavoriteData fromByteArray(byte[] data) {
        favoriteCategory = load16(data, 0x0);
        favoriteItem = load16(data, 0x2);
        favoriteCategoryDiscovered = load16(data, 0x4);
        favoriteItemDiscovered = load16(data, 0x6);
        return this;
    }

}
