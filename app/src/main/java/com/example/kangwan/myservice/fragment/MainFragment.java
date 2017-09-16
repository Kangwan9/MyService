package com.example.kangwan.myservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kangwan.myservice.R;

/**
 * Created by kangwan on 9/16/2017 AD.
 */

public class MainFragment extends Fragment {

//    Generate overide >> onCreateView

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    } // Create Fragment View

}  //MainFragment Class
