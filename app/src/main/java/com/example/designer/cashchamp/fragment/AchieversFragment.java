package com.example.designer.cashchamp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.designer.cashchamp.R;
import com.example.designer.cashchamp.adaptors.AchiversAdaptor;
import com.example.designer.cashchamp.adaptors.HomeAdaptor;
import com.example.designer.cashchamp.model.AchiversModel;
import com.example.designer.cashchamp.model.Homemodel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AchieversFragment extends Fragment {

    public static final String[] heading = new String[] { "A",
            "B", "C", "D" };

    public static final String[] earning = new String[] { "ABC",
            "DEF", "GHI", "JKL" };

    public static final String[] value = new String[] { "565",
            "755", "785", "785" };

    ListView listView;
    List<AchiversModel> rowItems;
   /* public AchieversFragment() {
        // Required empty public constructor
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_achievers, container, false);

        rowItems = new ArrayList<AchiversModel>();
        for (int i = 0; i < heading.length; i++) {
            AchiversModel item = new AchiversModel(heading[i], earning[i], value[i]);
            rowItems.add(item);
        }
        listView=(ListView)v.findViewById(R.id.listachivers);
        AchiversAdaptor adapter = new AchiversAdaptor(getActivity(), R.layout.fragment_achievers, rowItems);
        listView.setAdapter(adapter);

    return v;
    }

}
