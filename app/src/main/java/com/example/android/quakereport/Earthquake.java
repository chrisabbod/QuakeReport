package com.example.android.quakereport;

public class Earthquake {

    /**Magnitude of the earthquake */
    private String mMagnitude;

    /**Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /**
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happened
     */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }
}
