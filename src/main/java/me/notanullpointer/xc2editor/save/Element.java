package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum Element {

    FIRE(Image.ELEM_FIRE, "Fire"),
    WATER(Image.ELEM_WATER, "Water"),
    EARTH(Image.ELEM_EARTH, "Earth"),
    ELECTRIC(Image.ELEM_ELECTRIC, "Electric"),
    WIND(Image.ELEM_WIND, "Wind"),
    ICE(Image.ELEM_ICE, "Ice"),
    LIGHT(Image.ELEM_LIGHT, "Light"),
    DARK(Image.ELEM_DARK, "Dark");

    private Image thumbnail;
    private String name;

    Element(Image thumbnail, String name) {
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
