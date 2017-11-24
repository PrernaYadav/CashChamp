package com.example.designer.cashchamp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designer.cashchamp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MynetworkPendingFragment extends Fragment {


    public MynetworkPendingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mynetwork_pending, container, false);
    }

}
