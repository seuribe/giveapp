package org.givengiveapp.giveapp;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_request)
public class RequestActivity extends Activity {

    @Click
    public void publishButton() {
        finish();
    }
}
