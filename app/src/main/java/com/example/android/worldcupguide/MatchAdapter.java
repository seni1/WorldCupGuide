package com.example.android.worldcupguide;

/**
 * {@link MatchAdapter} is a {@link android.widget.ArrayAdapter} that can provide the layout for each
 * list based on a data source, which is a list of {@link com.example.android.worldcupguide.Match} objects.
 * Created by SeniKamara on 12.05.2018.
 */


import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate in the lists.
 */


public class MatchAdapter extends ArrayAdapter<Match> {

    public MatchAdapter (Context context, ArrayList<Match> matches) {
        //Here I initialize the ArrayAdapter's internal storage for the context and the list.
        //The second argument is used when the ArrayAdapter is populating a single TextView.
        //Because, this is a custom adapter for two TextViews, the adapter is not going to
        //use this second argument, so it can be any value. Here I use 0.
        super(context, 0, matches);

        //Need to initialize the mColorResourceId to be whatever input was passed as the
        //colorResourceId
//        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a View of an AdapterView (ListView, GridView, etc.)
     * @param position The position is the list of data that should be displayed
     *                 in the listItemView
     * @param convertView The recycledView to populate
     * @param parent The parent ViewGroup that is used for inflation
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if the existing View is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        //Get the {@link Match} object located at this position in the list
        Match currentMatch = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID match_tv
        TextView matchTextView = listItemView.findViewById(R.id.match_tv);

        //Get the Match from the current Match object and set this text
        //on the matchTextView
        matchTextView.setText(currentMatch.getTeamsPlaying());

        //Find the TextView in the list_item.xml layout with the ID date_time_tv
        TextView dateTextView = listItemView.findViewById(R.id.date_time_tv);

        //Get the Date, Day and Time from the current Match object and set this text
        //on the dateTextView
        dateTextView.setText(currentMatch.getDateDayTime());

        //Find the TextView in the list_item.xml layout with the ID venue_tv
        TextView venueTextView = listItemView.findViewById(R.id.venue_tv);

        //Get the Venue, from the current Match object and set this text
        //on the venueTextView
        venueTextView.setText(currentMatch.getVenuePlaying());

        //Find the ImageView in the list_item.xml layout with the ID match_image
        ImageView matchImageView = listItemView.findViewById(R.id.flag_image);

        matchImageView.setImageResource(currentMatch.getmImageResourceId());

        //Return the whole listItem layout (containing 2 TextViews)
        //so that it can be shown in the ListView
        return listItemView;
    }
}


























