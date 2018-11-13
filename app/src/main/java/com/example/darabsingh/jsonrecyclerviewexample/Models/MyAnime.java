package com.example.darabsingh.jsonrecyclerviewexample.Models;

public class MyAnime {
    private  String name;
    private  String desc;
    private  String rating;
    private int nb_Episode;
    private String category;
    private String image_url;
    private String studio;

    public MyAnime()
    {

    }

    public MyAnime(String name, String desc, String rating, int nb_Episode, String category, String image_url, String studio) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.nb_Episode = nb_Episode;
        this.category = category;
        this.image_url = image_url;
        this.studio = studio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getNb_Episode() {
        return nb_Episode;
    }

    public void setNb_Episode(int nb_Episode) {
        this.nb_Episode = nb_Episode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
