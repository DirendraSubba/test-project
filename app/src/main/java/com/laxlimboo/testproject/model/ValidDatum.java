
package com.laxlimboo.testproject.model;

import com.google.gson.annotations.SerializedName;

public class ValidDatum {

    @SerializedName("Code")
    private String mCode;
    @SerializedName("Name")
    private String mName;

    public String getCode() {
        return mCode;
    }

    public void setCode(String Code) {
        mCode = Code;
    }

    public String getName() {
        return mName;
    }

    public void setName(String Name) {
        mName = Name;
    }

    @Override
    public String toString() {
        return "ValidDatum{" +
                "mCode='" + mCode + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
