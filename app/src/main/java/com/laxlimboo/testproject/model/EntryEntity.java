
package com.laxlimboo.testproject.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class EntryEntity {

    @SerializedName("ErrorCode")
    private Long mErrorCode;
    @SerializedName("ErrorMessage")
    private String mErrorMessage;
    @SerializedName("Success")
    private Boolean mSuccess;
    @SerializedName("ValidData")
    private List<ValidDatum> mValidData;

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

    public List<ValidDatum> getValidData() {
        return mValidData;
    }

    public void setValidData(List<ValidDatum> ValidData) {
        mValidData = ValidData;
    }
}
