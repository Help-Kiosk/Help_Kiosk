package com.help_kiosk.Simulation_Mcdonald;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.help_kiosk.R;

public class McDonaldStartFragment extends Fragment {


    public McDonaldStartFragment() {

    }


    public static McDonaldStartFragment newInstance(String param1, String param2) {
        McDonaldStartFragment fragment = new McDonaldStartFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mcdonald_start, container, false);
    }
}