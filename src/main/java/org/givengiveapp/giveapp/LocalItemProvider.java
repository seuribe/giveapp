package org.givengiveapp.giveapp;

import org.androidannotations.annotations.EBean;

import java.util.List;

@EBean
public class LocalItemProvider implements ItemProvider {
    private List<Item> items;

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override public List<Item> getItems() {
        return items;
    }
}
