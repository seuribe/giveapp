package org.givengiveapp.giveapp;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_offer_search)
public class SearchOffersActivity extends Activity {

    private static final String TAG = "SearchOffers";

    @ViewById
    ListView offerList;

    @Bean
    ItemAdapter adapter;

    @AfterViews
    protected void load() {
        Log.d(TAG, "load");
        ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("Offer");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> list, ParseException e) {
                Log.d(TAG, "query finished, e: " + e);
                if (e != null) {
                    return;
                }
                Log.d(TAG, "results: " + list.size());
                List<Item> items = new ArrayList<Item>();
                for (ParseObject obj : list) {
                    items.add(new Item(obj.getString("title"), obj.getString("text"), Item.Type.Offer));
                }
                display(items);
            }
        });
    }

    @MainThread
    private void display(List<Item> items) {
        Log.d(TAG, "display");
        adapter.setItems(items);
        offerList.setAdapter(adapter);
    }

}
