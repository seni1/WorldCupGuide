package com.example.android.worldcupguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StPetersburgFragment extends Fragment {


    public StPetersburgFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.match_list, container, false);

        /** TODO: Insert all the code from the NumberActivity's onCreate() method after the setContentView method call*/

        //Create an ArrayList of matches
        ArrayList<Match> matches = new ArrayList<>();

        //Add the match information to the ArrayList
        matches.add(new Match("MOROCCO vs IRAN", "15.06.2018, Friday, 18:00", "St. Petersburg", R.drawable.moroc_iran));
        matches.add(new Match("RUSSIA vs EGYPT", "19.06.2018, Tuesday, 21:00", "St. Petersburg", R.drawable.rus_egypt));
        matches.add(new Match("BRAZIL vs COSTA-RICAL", "22.06.2018, Friday, 18:00", "St. Petersburg", R.drawable.braz_costa));
        matches.add(new Match("NIGERIA vs ARGENTINA", "20.06.2018, Wednesday, 15:00", "St. Petersburg", R.drawable.niger_argen));


        //Create a {@link ArrayAdapter}, whose data source is a list of Strings. The
        //adapter knows how to create layouts for each item in the list, using the
        //simple_list_item1.xml resource defined in the Android framework.
        //This listItem layout contains a single {@link TextView}, which the adapter will set
        //to display a single match
        MatchAdapter adapter = new MatchAdapter(getActivity(), matches);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view ID called "match_list", which is
        //declared in the match_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.match_list);

        //Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        //{@link ListView} will display list items for each match in the list of matches.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        //1 argument, which is the {@link ArrayAdapter} with the variable name: "adapter"
        listView.setAdapter(adapter);

        return rootView;
    }



}