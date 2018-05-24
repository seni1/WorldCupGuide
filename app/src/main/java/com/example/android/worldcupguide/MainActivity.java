package com.example.android.worldcupguide;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.TextView;

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


//        //Find the View that shows the moscow category
//        TextView moscowView = findViewById(R.id.moscow_tv);
//
//        //Set the ClickListener on the moscowView
//        moscowView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //Create a new intent to open the {@link MoscowActivity
//                Intent moscowIntent = new Intent(MainActivity.this, MoscowActivity.class);
//
//                //Start the new activity
//                startActivity(moscowIntent);
//            }
//        });
//
//        //Find the View that shows the st. petersburg category
//        TextView stPeteView = findViewById(R.id.st_pete_tv);
//
//        //Set the ClickListener on the stPeteView
//        stPeteView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //Create a new intent to open the {@link StPetersburgActivity
//                Intent stPeteIntent = new Intent(MainActivity.this, StPetersburgActivity.class);
//
//                //Start the new activity
//                startActivity(stPeteIntent);
//            }
//        });
//
//        //Find the View that shows the kazan category
//        TextView kazanView = findViewById(R.id.kazan_tv);
//
//        //Set the ClickListener on the kazanView
//        kazanView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //Create a new intent to open the {@link KazanActivity
//                Intent kazanIntent = new Intent(MainActivity.this, KazanActivity.class);
//
//                //Start the new activity
//                startActivity(kazanIntent);
//            }
//        });
//
//        //Find the View that shows the sochi category
//        TextView sochiView = findViewById(R.id.sochi_tv);
//
//        //Set the ClickListener on the sochiView
//        sochiView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //Create a new intent to open the {@link SochiActivity
//                Intent sochiIntent = new Intent(MainActivity.this, SochiActivity.class);
//
//                //Start the new activity
//                startActivity(sochiIntent);
//            }
//        });
//
//        //Find the View that shows the samara category
//        TextView samaraView = findViewById(R.id.sama_tv);
//
//        //Set the ClickListener on the samaraView
//        samaraView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //Create a new intent to open the {@link SamaraActivity
//                Intent samaraIntent = new Intent(MainActivity.this, SamaraActivity.class);
//
//                //Start the new activity
//                startActivity(samaraIntent);
//            }
//        });
    }
}






















