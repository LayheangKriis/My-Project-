package com.layheang.appfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find the button by its ID and set up the click listener
        Button viewMoreButton1 = view.findViewById(R.id.view_more_button1);
        viewMoreButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the button click
                // For example, you can load a new fragment or start a new activity
                loadDetailsFragment();
            }
        });Button viewMoreButton2 = view.findViewById(R.id.view_more_button1);
        viewMoreButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the button click for button 2
            }
        });

        // Add more buttons and click listeners as needed

        return view;
    }

    private void loadDetailsFragment() {
        // Load the details fragment
        Fragment detailsFragment = new DetailFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, detailsFragment)
                .addToBackStack(null)
                .commit();
    }
}
