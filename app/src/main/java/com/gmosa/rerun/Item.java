package com.gmosa.rerun;

/**
 * Created by emobilis on 4/25/18.
 */

/**
 * Created by emobilis on 4/24/18.
 */

public class Item {
    private String name;
    private int year;
    private String description;
    private int poster;

    public Item(String name, int year, String description, int poster) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public int getPoster() {
        return poster;
    }
}
