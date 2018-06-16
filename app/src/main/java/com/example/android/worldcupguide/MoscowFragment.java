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
public class MoscowFragment extends Fragment {


    public MoscowFragment() {
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
        matches.add(new Match(getString(R.string.saud_rus), getString(R.string.t_saud_rus), getString(R.string.luzhniki), R.drawable.saud_rus));
        matches.add(new Match(getString(R.string.argen_iceland), getString(R.string.t_argen_iceland), getString(R.string.spartak), R.drawable.argen_iceland));
        matches.add(new Match(getString(R.string.germ_mex), getString(R.string.t_germ_mex), getString(R.string.luzhniki), R.drawable.germ_mex));
        matches.add(new Match(getString(R.string.pol_seneg), getString(R.string.t_pol_seneg), getString(R.string.spartak), R.drawable.pol_seneg));
        matches.add(new Match(getString(R.string.port_moro), getString(R.string.t_port_moro), getString(R.string.luzhniki), R.drawable.port_moro));
        matches.add(new Match(getString(R.string.belg_tunis), getString(R.string.t_belg_tunis), getString(R.string.spartak), R.drawable.belg_tunis));
        matches.add(new Match(getString(R.string.den_france), getString(R.string.t_den_france), getString(R.string.luzhniki), R.drawable.den_france));
        matches.add(new Match(getString(R.string.serb_braz), getString(R.string.t_serb_braz), getString(R.string.spartak), R.drawable.serb_braz));

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
