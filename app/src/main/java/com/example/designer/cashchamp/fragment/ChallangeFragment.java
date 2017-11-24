package com.example.designer.cashchamp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designer.cashchamp.ActivityTab1;
import com.example.designer.cashchamp.ActivityTab2;
import com.example.designer.cashchamp.ActivityTab3;
import com.example.designer.cashchamp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChallangeFragment extends Fragment {

    private FragmentTabHost mTabHost;



  /*  public ChallangeFragment() {
        // Required empty public constructor
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_challange);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator(" Home ", null),
                ActivityTab1.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("DashBoard", null),
                ActivityTab2.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Upline Info", null),
                ActivityTab3.class, null);


        return  mTabHost;
    }

}
