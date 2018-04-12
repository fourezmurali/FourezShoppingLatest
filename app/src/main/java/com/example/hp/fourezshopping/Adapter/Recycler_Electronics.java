package com.example.hp.fourezshopping.Adapter;

/**
 * Created by HP on 19/03/2018.
 */

public class Recycler_Electronics {

    private String Title;
    private String Description;
    private String Category;
    private int Thumbnail;
    private int Thumbnailfirst;
    private int Thumbnailsecond;
    private int Thumbnailthird;
    private int Thumbnailfront;
    private String Titlefront;
    private String Price;


    public Recycler_Electronics() {

    }


    public Recycler_Electronics(String title, String description, String category, int thumbnail, int thumbnailfirst, int thumbnailsecond, int thumbnailthird) {
        Title = title;
        Description = description;
        Category = category;
        Thumbnail = thumbnail;
        Thumbnailfirst=thumbnailfirst;
        Thumbnailsecond=thumbnailsecond;
        Thumbnailthird=thumbnailthird;
    }

    public int getThumbnailfirst() {
        return Thumbnailfirst;
    }

    public int getThumbnailsecond() {
        return Thumbnailsecond;
    }

    public int getThumbnailthird() {
        return Thumbnailthird;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getCategory() {
        return Category;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnailfirst(int thumbnailfirst) {
        Thumbnailfirst = thumbnailfirst;
    }

    public void setThumbnailsecond(int thumbnailsecond) {
        Thumbnailsecond = thumbnailsecond;
    }

    public void setThumbnailthird(int thumbnailthird) {
        Thumbnailthird = thumbnailthird;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
