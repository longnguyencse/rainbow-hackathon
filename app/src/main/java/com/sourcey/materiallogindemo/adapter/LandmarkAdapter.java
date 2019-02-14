package com.sourcey.materiallogindemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.model.Landmark;

import org.w3c.dom.Text;

import java.util.List;

import static android.content.ContentValues.TAG;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView landmarkName;
        public TextView landmarkDescription;
        public ImageView landmarkPhoto;
        public RatingBar landmarkRating;

        public ViewHolder(View itemView){
            super(itemView);

            landmarkName = (TextView) itemView.findViewById(R.id.landmark_name);
            landmarkDescription = (TextView) itemView.findViewById(R.id.landmark_description);
            landmarkPhoto = (ImageView) itemView.findViewById(R.id.landmark_image);
            landmarkRating = (RatingBar) itemView.findViewById(R.id.landmark_rating);
        }
    }

    private List<Landmark> mLandmarks;

    // Pass in the contact array into the constructor
    public LandmarkAdapter(List<Landmark> landmarks) {
        mLandmarks = landmarks;
    }

    @Override
    public LandmarkAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View landmarkView = inflater.inflate(R.layout.item_landmark, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(landmarkView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(LandmarkAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Landmark landmark = mLandmarks.get(position);

        // Set item views based on your views and data model
        viewHolder.landmarkName.setText(landmark.getmName());
        viewHolder.landmarkDescription.setText(landmark.getmDescription());
        viewHolder.landmarkPhoto.setImageResource(landmark.getPhotoId());
        viewHolder.landmarkRating.setRating(landmark.getmRating());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mLandmarks.size();
    }
}
