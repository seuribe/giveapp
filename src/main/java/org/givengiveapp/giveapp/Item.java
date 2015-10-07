package org.givengiveapp.giveapp;

/**
 * Created by Sebastian on 05.07.2015.
 */
public class Item {
    public enum Type {
        Offer, Request;
    }
    public final Type type;
    public final String title;
    public final String text;

    public Item(String title, String text, Type type) {
        this.title = title;
        this.text = text;
        this.type = type;
    }

}
