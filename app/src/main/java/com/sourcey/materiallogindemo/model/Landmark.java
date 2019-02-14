package com.sourcey.materiallogindemo.model;

public class Landmark {
    private String mName;
    private String mDescription;
    private int photoId;
    private float mRating;

    public Landmark(String mName, String mDescription, int photoId, float mRating) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.photoId = photoId;
        this.mRating = mRating;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public float getmRating() {
        return mRating;
    }

    public void setmRating(float mRating) {
        this.mRating = mRating;
    }
}
