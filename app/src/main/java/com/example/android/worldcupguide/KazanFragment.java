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
public class KazanFragment extends Fragment {


    public KazanFragment() {
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
        matches.add(new Match(getString(R.string.fra_austr), getString(R.string.t_fra_austr), getString(R.string.kazan), R.drawable.fra_austr));
        matches.add(new Match(getString(R.string.iran_spain), getString(R.string.t_iran_spain), getString(R.string.kazan), R.drawable.iran_spain));
        matches.add(new Match(getString(R.string.pol_columb), getString(R.string.t_pol_columb), getString(R.string.kazan), R.drawable.pol_columb));
        matches.add(new Match(getString(R.string.kor_germ), getString(R.string.t_kor_germ), getString(R.string.kazan), R.drawable.kor_germ));


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