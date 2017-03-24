
package com.laxlimboo.testproject.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TruckCenterDatum implements Serializable{

    @SerializedName("Comment")
    private String mComment;
    @SerializedName("CurrentTrailerInfoID")
    private String mCurrentTrailerInfoID;
    @SerializedName("FacilityName")
    private String mFacilityName;
    @SerializedName("LastAction")
    private String mLastAction;
    @SerializedName("LastActionBy")
    private String mLastActionBy;
    @SerializedName("LastActionOn")
    private String mLastActionOn;
    @SerializedName("Location")
    private String mLocation;
    @SerializedName("ReadyForRack")
    private String mReadyForRack;
    @SerializedName("ReadyForRackSince")
    private String mReadyForRackSince;
    @SerializedName("RequestedRack")
    private String mRequestedRack;
    @SerializedName("RequestedToRack")
    private String mRequestedToRack;
    @SerializedName("TrailerID")
    private String mTrailerID;
    @SerializedName("TrailerStatus")
    private String mTrailerStatus;

    public String getComment() {
        return mComment;
    }

    public void setComment(String Comment) {
        mComment = Comment;
    }

    public String getCurrentTrailerInfoID() {
        return mCurrentTrailerInfoID;
    }

    public void setCurrentTrailerInfoID(String CurrentTrailerInfoID) {
        mCurrentTrailerInfoID = CurrentTrailerInfoID;
    }

    public String getFacilityName() {
        return mFacilityName;
    }

    public void setFacilityName(String FacilityName) {
        mFacilityName = FacilityName;
    }

    public String getLastAction() {
        return mLastAction;
    }

    public void setLastAction(String LastAction) {
        mLastAction = LastAction;
    }

    public String getLastActionBy() {
        return mLastActionBy;
    }

    public void setLastActionBy(String LastActionBy) {
        mLastActionBy = LastActionBy;
    }

    public String getLastActionOn() {
        return mLastActionOn;
    }

    public void setLastActionOn(String LastActionOn) {
        mLastActionOn = LastActionOn;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String Location) {
        mLocation = Location;
    }

    public String getReadyForRack() {
        return mReadyForRack;
    }

    public void setReadyForRack(String ReadyForRack) {
        mReadyForRack = ReadyForRack;
    }

    public String getReadyForRackSince() {
        return mReadyForRackSince;
    }

    public void setReadyForRackSince(String ReadyForRackSince) {
        mReadyForRackSince = ReadyForRackSince;
    }

    public String getRequestedRack() {
        return mRequestedRack;
    }

    public void setRequestedRack(String RequestedRack) {
        mRequestedRack = RequestedRack;
    }

    public String getRequestedToRack() {
        return mRequestedToRack;
    }

    public void setRequestedToRack(String RequestedToRack) {
        mRequestedToRack = RequestedToRack;
    }

    public String getTrailerID() {
        return mTrailerID;
    }

    public void setTrailerID(String TrailerID) {
        mTrailerID = TrailerID;
    }

    public String getTrailerStatus() {
        return mTrailerStatus;
    }

    public void setTrailerStatus(String TrailerStatus) {
        mTrailerStatus = TrailerStatus;
    }

    @Override
    public String toString() {
        return "TruckCenterDatum{" +
                "mComment='" + mComment + '\'' +
                ", mCurrentTrailerInfoID='" + mCurrentTrailerInfoID + '\'' +
                ", mFacilityName='" + mFacilityName + '\'' +
                ", mLastAction='" + mLastAction + '\'' +
                ", mLastActionBy='" + mLastActionBy + '\'' +
                ", mLastActionOn='" + mLastActionOn + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mReadyForRack='" + mReadyForRack + '\'' +
                ", mReadyForRackSince='" + mReadyForRackSince + '\'' +
                ", mRequestedRack='" + mRequestedRack + '\'' +
                ", mRequestedToRack='" + mRequestedToRack + '\'' +
                ", mTrailerID='" + mTrailerID + '\'' +
                ", mTrailerStatus='" + mTrailerStatus + '\'' +
                '}';
    }
}
