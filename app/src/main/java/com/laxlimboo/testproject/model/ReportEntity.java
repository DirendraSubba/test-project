
package com.laxlimboo.testproject.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ReportEntity {

    @SerializedName("ErrorCode")
    private Long mErrorCode;
    @SerializedName("ErrorMessage")
    private String mErrorMessage;
    @SerializedName("Success")
    private Boolean mSuccess;
    @SerializedName("TruckCenterData")
    private List<TruckCenterDatum> mTruckCenterData;

    public Long getErrorCode() {
        return mErrorCode;
    }

    public void setErrorCode(Long ErrorCode) {
        mErrorCode = ErrorCode;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }

    public void setErrorMessage(String ErrorMessage) {
        mErrorMessage = ErrorMessage;
    }

    public Boolean getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Boolean Success) {
        mSuccess = Success;
    }

    public List<TruckCenterDatum> getTruckCenterData() {
        return mTruckCenterData;
    }

    public void setTruckCenterData(List<TruckCenterDatum> TruckCenterData) {
        mTruckCenterData = TruckCenterData;
    }

    @Override
    public String toString() {
        return "ReportEntity{" +
                "mErrorCode=" + mErrorCode +
                ", mErrorMessage='" + mErrorMessage + '\'' +
                ", mSuccess=" + mSuccess +
                ", mTruckCenterData=" + mTruckCenterData +
                '}';
    }
}
