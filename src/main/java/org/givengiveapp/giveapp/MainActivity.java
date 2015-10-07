package org.givengiveapp.giveapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.EActivity;

import com.parse.Parse;
import com.parse.ParseObject;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @AfterInject
    protected void init() {
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "khuD3t09t9virEcZPlYeJXLseB8dMNcGcvIwj14Q", "DzIEvK6ZXoyvAAkvVC7Kkmxs9sYDBaQB4IggT5Hs");
    }

    @Click
    void mainOfferButton() {
        OfferActivity_.intent(this).start();
    }

    @Click
    void mainRequestButton() {
        RequestActivity_.intent(this).start();
    }

    @Click
    void mainOfferSearchButton() {
        SearchOffersActivity_.intent(this).start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
