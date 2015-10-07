package org.givengiveapp.giveapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.Parse;
import com.parse.ParseObject;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_offer)
public class OfferActivity extends Activity {

    @ViewById
    EditText offerTitle;

    @ViewById
    EditText offerText;

    @Click
    public void publishButton() {
        ParseObject offer = new ParseObject("Offer");
        offer.put("title", offerTitle.getText().toString());
        offer.put("text", offerText.getText().toString());
        offer.saveInBackground();
        finish();
    }

}
