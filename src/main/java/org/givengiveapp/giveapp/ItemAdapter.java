package org.givengiveapp.giveapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

@EBean
public class ItemAdapter extends BaseAdapter {

    List<Item> items;

    @RootContext
    Context context;

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override public int getCount() {
        return items.size();
    }

    @Override public Item getItem(int position) {
        return items.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {

        ItemView itemView;
        if (convertView == null) {
            itemView = ItemView_.build(context);
        } else {
            itemView = (ItemView)convertView;
        }
        itemView.bind(getItem(position));

        return itemView;
    }
}
