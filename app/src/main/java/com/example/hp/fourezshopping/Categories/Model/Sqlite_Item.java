package com.example.hp.fourezshopping.Categories.Model;

import java.util.ArrayList;

/**
 * Created by Quoc Nguyen on 13-Dec-16.
 */

public class Sqlite_Item {
    private int id;
    private String name;
    private String price;
    private byte[] image;
    private String qty ;

    public Sqlite_Item(String name, String price, byte[] image, int id,String qty) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.id = id;
        this.qty = qty;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}