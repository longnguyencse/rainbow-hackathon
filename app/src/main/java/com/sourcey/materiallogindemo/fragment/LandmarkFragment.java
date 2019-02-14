package com.sourcey.materiallogindemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.adapter.LandmarkAdapter;
import com.sourcey.materiallogindemo.model.Landmark;

import java.util.ArrayList;
import java.util.List;

// In this case, the fragment displays simple text based on the page
public class LandmarkFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static LandmarkFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        LandmarkFragment fragment = new LandmarkFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_landmark, container, false);
        RecyclerView rvLandmarks = (RecyclerView) view.findViewById(R.id.rvLandmarks);

        // Initialize contacts
        createDummyData();
        // Create adapter passing in the sample user data
        LandmarkAdapter adapter = new LandmarkAdapter(landmarks);
        // Attach the adapter to the recyclerview to populate items
        rvLandmarks.setAdapter(adapter);
        // Set layout manager to position the items
        rvLandmarks.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    List<Landmark> landmarks = new ArrayList();

    private void createDummyData() {
        landmarks.add(new Landmark(getString(R.string.place_1_name),getString(R.string.place_1_description),R.drawable.place1,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_2_name),getString(R.string.place_2_description),R.drawable.place2,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_3_name),getString(R.string.place_3_description),R.drawable.place3,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_4_name),getString(R.string.place_4_description),R.drawable.place4,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_5_name),getString(R.string.place_5_description),R.drawable.place5,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_6_name),getString(R.string.place_6_description),R.drawable.place6,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_7_name),getString(R.string.place_7_description),R.drawable.place7,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_8_name),getString(R.string.place_8_description),R.drawable.place8,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_9_name),getString(R.string.place_9_description),R.drawable.place9,4.5f));
        landmarks.add(new Landmark(getString(R.string.place_10_name),getString(R.string.place_10_description),R.drawable.place10,4.5f));

    }
}