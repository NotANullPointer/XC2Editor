package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum Role {

    ATK(Image.ROLE_ATK, "Attack"),
    TNK(Image.ROLE_TNK, "Tank"),
    HLR(Image.ROLE_HLR, "Healer");

    private Image thumbnail;
    private String name;

    Role(Image thumbnail, String name) {
        this.thumbnail = thumbnail;
        this.name = name;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public String getName() {
        return name;
    }

}
