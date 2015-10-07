package org.givengiveapp.giveapp;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.item_layout)
public class ItemView extends LinearLayout{

    @ViewById
    TextView itemType;

    @ViewById
    TextView itemTitle;

    @ViewById
    TextView itemText;

    public ItemView(Context context) {
        super(context);
    }

    public void bind(Item item) {
        itemType.setText(item.type.name());
        itemTitle.setText(item.title);
        itemText.setText(item.text);
    }

}