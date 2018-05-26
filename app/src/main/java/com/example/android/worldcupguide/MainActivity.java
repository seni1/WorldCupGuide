package com.example.android.worldcupguide;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;


public class MainActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Set the content of the activity to use activity_main.xml layout file
            setContentView(R.layout.activity_main);

            //Find the ViewPager that will allow the user to swipe between fragments
            ViewPager viewPager = findViewById(R.id.viewpager);

            //Create an adapter that knows which fragment should be shown on each page
            CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());

            //Set the adapter onto the ViewPager
            viewPager.setAdapter(adapter);

            //Find the tab layout that shows the tabs
            TabLayout tabLayout = findViewById(R.id.tabs);

            //Connect the tab layout with the ViewPager. This will
            // 1. Update the tab layout when the ViewPager is swiped.
            // 2. Update the ViewPager when a tab is selected
            // 3. Set the tab layout's tab names with the ViewPager's adapter's titles by calling
            // onPageTitle()
            tabLayout.setupWithViewPager(viewPager);

    }
}






















