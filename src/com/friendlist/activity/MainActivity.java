package com.friendlist.activity;


import com.example.androidtablayout.R;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	
	@SuppressWarnings("deprecation")
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        TabHost tabHost = getTabHost();
         
        // Tab for all
        TabSpec all = tabHost.newTabSpec("ALL");
        // setting Title and Icon for the Tab
        all.setIndicator("ALL", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent allIntent = new Intent(this, AllActivity.class);
        all.setContent(allIntent);
         
        // Tab for love
        TabSpec love = tabHost.newTabSpec("Love");        
        love.setIndicator("Love", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent loveIntent = new Intent(this, LoveActivity.class);
        love.setContent(loveIntent);
         
        // Tab for hate
        TabSpec hate = tabHost.newTabSpec("Hate");
        hate.setIndicator("Hate", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent hateIntent = new Intent(this, HateActivity.class);
        hate.setContent(hateIntent);
        // Tab for add
        TabSpec add = tabHost.newTabSpec("Add");
        add.setIndicator("Add", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent addIntent = new Intent(this, AddActivity.class);
        add.setContent(addIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(all); // Adding all tab
        tabHost.addTab(love); // Adding love tab
        tabHost.addTab(hate); // Adding hates tab
        tabHost.addTab(add);// thêm mới 
        
    }
	
}
