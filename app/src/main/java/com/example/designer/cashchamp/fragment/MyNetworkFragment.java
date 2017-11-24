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
public class MyNetworkFragment extends Fragment {
    private FragmentTabHost mTabHost;

  /*  public MyNetworkFragment() {
        // Required empty public constructor
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_my_network);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator(" Active ", null),
                MynetworkactiveFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Pending", null),
                MynetworkPendingFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("IJ", null),
                MynetworkIjFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab4").setIndicator("Web User", null),
                MynetworkWebFragment.class, null);


        return  mTabHost;
    }

}
