package com.example.shiza.callhistorycontrol;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Setting up a toolbar for the navigation purpose.

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        toolbar.setTitle(" Call History Control");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

//        The fragments management is done here

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("HOME"),
                Home.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("ABOUT APP"),
                Home.class, null);


    }

}
