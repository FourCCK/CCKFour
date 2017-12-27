package com.cck.FourTeam_Kotlin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cck.FourTeam_Kotlin.R;


/**
 * Created by C-PC on 2017/12/21.
 */

public class Fragment01 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment01,null);




        return view;
    }
}
