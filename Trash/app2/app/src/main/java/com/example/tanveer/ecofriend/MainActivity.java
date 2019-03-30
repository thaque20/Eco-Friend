package com.example.tanveer.ecofriend;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_search:
                    mTextMessage.setText(R.string.title_search);
                    return true;
                case R.id.nav_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
                case R.id.nav_browser:
                    mTextMessage.setText(R.string.title_browser);
                    return true;
                case R.id.nav_device:
                    mTextMessage.setText(R.string.title_device);
                    return true;
                case R.id.nav_about:
                    mTextMessage.setText(R.string.title_about);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}