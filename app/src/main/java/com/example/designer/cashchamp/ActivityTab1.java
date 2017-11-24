package com.example.designer.cashchamp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.designer.cashchamp.adaptors.HomeAdaptor;
import com.example.designer.cashchamp.model.Homemodel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityTab1 extends Fragment {

    public static final String[] category = new String[] { "A",
            "B", "C", "D" };

    public static final String[] todayvalue = new String[] { "121",
            "524", "552", "787" };

    public static final String[] totalvalue = new String[] { "565",
            "755", "785", "785" };

    ListView listView;
    List<Homemodel> rowItems;






   /* public ActivityTab1() {
        // Required empty public constructor
    }*/


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.activity_tab1, container, false);

        rowItems = new ArrayList<Homemodel>();
        for (int i = 0; i < category.length; i++) {
            Homemodel item = new Homemodel(category[i], todayvalue[i], totalvalue[i]);
            rowItems.add(item);
        }
        listView = (ListView)v.findViewById(R.id.listhome);
        HomeAdaptor adapter = new HomeAdaptor(getActivity(), R.layout.activity_tab1, rowItems);
        listView.setAdapter(adapter);






        return v;
    }


}
