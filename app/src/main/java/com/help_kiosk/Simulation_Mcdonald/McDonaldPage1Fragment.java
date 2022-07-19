package com.help_kiosk.Simulation_Mcdonald;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.help_kiosk.R;

public class McDonaldPage1Fragment extends Fragment {
    private Button bt_start;

    public McDonaldPage1Fragment() {

    }

    public static McDonaldPage1Fragment newInstance(String param1, String param2) {
        McDonaldPage1Fragment fragment = new McDonaldPage1Fragment();
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
        return inflater.inflate(R.layout.fragment_mcdonald_page1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bt_start = view.findViewById(R.id.simulation_bt_start);

        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(McDonaldPage1Fragment.this).navigate(R.id.action_mcDonaldPage1Fragment_to_mcDonaldStartFragment);
            }
        });

    }
}