package com.example.coolkies;

public class GalleryItem {
    private final int imageResourceId;
    private final String name;

    public GalleryItem(int imageResourceId, String name) {
        this.imageResourceId = imageResourceId;
        this.name = name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }
}