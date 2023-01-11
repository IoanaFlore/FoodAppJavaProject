package com.example.myfoodapp.models;

public class FeaturedVerModel {

    int image;
    String name;
    String description;
    String rating;

    public FeaturedVerModel(int image, String name, String description, String rating) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}