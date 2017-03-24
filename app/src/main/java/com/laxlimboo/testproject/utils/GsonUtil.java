package com.laxlimboo.testproject.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.laxlimboo.testproject.model.EntryEntity;
import com.laxlimboo.testproject.model.ReportEntity;
import com.laxlimboo.testproject.model.TruckCenterDatum;
import com.laxlimboo.testproject.model.ValidDatum;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;


public class GsonUtil {

    public static List<TruckCenterDatum> getTruckCenterDatumList(ReportEntity reportEntity) {
        return reportEntity.getTruckCenterData();
    }

    public static ReportEntity getReportEntity(JSONObject jsonObject) {

        Type type = new TypeToken<ReportEntity>() {
        }.getType();
        return new Gson().fromJson(jsonObject.toString(), ReportEntity.class);
    }

    public static List<ValidDatum> getTruckCenterDatumList(EntryEntity reportEntity) {
        return reportEntity.getValidData();
    }

    public static EntryEntity getEntryEntity(JSONObject jsonObject) {

        Type type = new TypeToken<EntryEntity>() {
        }.getType();
        return new Gson().fromJson(jsonObject.toString(), EntryEntity.class);
    }

}
