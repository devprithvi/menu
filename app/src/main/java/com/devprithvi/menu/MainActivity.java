package com.devprithvi.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.update_app:
                UpdateApp();
                return true;
            case R.id.rate_us:
                rateUs();
                return true;
            case R.id.contact_us:
                contactUs();
                return true;
            case R.id.privacy_policy:
                privacyPolicy();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void privacyPolicy() {
        Toast.makeText(this, "Privacy and policy..", Toast.LENGTH_LONG).show();

    }

    private void contactUs() {
        Toast.makeText(this, "COntact..", Toast.LENGTH_LONG).show();

    }

    private void rateUs() {
        Toast.makeText(this, "rating..", Toast.LENGTH_LONG).show();

    }

    private void UpdateApp() {
        Toast.makeText(this, "Updateing..", Toast.LENGTH_LONG).show();

    }
}