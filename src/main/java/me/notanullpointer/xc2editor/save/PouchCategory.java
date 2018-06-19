package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum PouchCategory {

    STAPLE_FOODS(Image.STAPLE_FOOD, "Staple Food"),
    VEGETABLES(Image.VEGGIES, "Veggies"),
    MEAT(Image.MEATS, "Meats"),
    SEAFOOD(Image.SEAFOOD, "Seafood"),
    DESSERTS(Image.DESSERTS, "Desserts"),
    DRINKS(Image.DRINKS, "Drinks"),
    INSTRUMENTS(Image.INSTRUMENTS, "Instruments"),
    ART(Image.ART, "Art"),
    LITERATURE(Image.LITERATURE, "Literature"),
    BOARD_GAMES(Image.BOARD_GAMES, "Board Games"),
    COSMETICS(Image.COSMETICS, "Cosmetics"),
    TEXTILES(Image.TEXTILES, "Textiles");

    private Image texture;
    private String name;

    PouchCategory(Image texture, String name) {
        this.texture = texture;
        this.name = name;
    }

    public Image getImage() {
        return texture;
    }

    public String getName() {
        return name;
    }
}
