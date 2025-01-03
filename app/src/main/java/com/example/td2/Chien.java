package com.example.td2;

import android.media.Image;

public class Chien {
    private String image;
    private String name;
    private String race;
    private String origin;

    public Chien(String image, String name, String race, String origin) {
        this.image = image;
        this.name = name;
        this.race = race;
        this.origin = origin;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
