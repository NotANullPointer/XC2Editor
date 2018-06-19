package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum Element {

    FIRE(1, Image.ELEM_FIRE, "Fire"),
    WATER(2, Image.ELEM_WATER, "Water"),
    EARTH(3, Image.ELEM_EARTH, "Earth"),
    ELECTRIC(4, Image.ELEM_ELECTRIC, "Electric"),
    WIND(5, Image.ELEM_WIND, "Wind"),
    ICE(6, Image.ELEM_ICE, "Ice"),
    LIGHT(7, Image.ELEM_LIGHT, "Light"),
    DARK(8, Image.ELEM_DARK, "Dark");

    private Image thumbnail;
    private String name;
    private int id;

    Element(int id, Image thumbnail, String name) {
        this.thumbnail = thumbnail;
        this.name = name;
        this.id = id;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static Element fromId(int id) {
        for (Element e:values()) {
            if(e.getId() == id) {
                return e;
            }
        }
        return null;
    }

}
