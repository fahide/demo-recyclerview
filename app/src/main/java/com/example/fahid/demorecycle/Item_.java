package com.example.fahid.demorecycle;

/**
 * Created by FAHID on 8/29/2018.
 */

public class Item_ {
    private String name;
    private String region;
    private int image;

    public Item_(int image) {
        this.image = image;
    }

    public Item_(String name, String region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getImage() {
        return image;
    }
}
