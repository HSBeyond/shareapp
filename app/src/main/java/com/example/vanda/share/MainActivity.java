package com.example.vanda.share;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import static com.example.vanda.share.R.id;
import static com.example.vanda.share.R.layout;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case id.navigation_shouye:
                    replaceFragment(new FirstFragment());
                    // mTextMessage.setText(R.string.title_home);
                    return true;
                case id.navigation_shangcheng:
                    replaceFragment(new SecondFragment());
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case id.navigation_wode:
                    replaceFragment(new ThirdFragment());
                    // mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(id.content, fragment);
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //appy运行指定首画面
        navigation.setSelectedItemId(id.navigation_shouye);
    }


}
