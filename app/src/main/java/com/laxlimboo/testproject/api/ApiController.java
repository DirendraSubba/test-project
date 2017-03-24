package com.laxlimboo.testproject.api;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.laxlimboo.testproject.MyApplication;
import com.laxlimboo.testproject.model.EntryEntity;
import com.laxlimboo.testproject.model.ReportEntity;
import com.laxlimboo.testproject.model.TruckCenterDatum;
import com.laxlimboo.testproject.model.ValidDatum;
import com.laxlimboo.testproject.ui.view.MvpView;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;

public class ApiController {

    public void requestTruckCenterDatum(final MvpView<List<TruckCenterDatum>> view, String url) {

        JsonObjectRequest request;

        request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        Type type = new TypeToken<ReportEntity>() {
                        }.getType();
                        ReportEntity reportEntity = new Gson().fromJson(response.toString(), type);
                        view.render(reportEntity.getTruckCenterData());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        view.showError(error.getMessage());
                    }
                });
        MyApplication.getInstance().addToRequestQueue(request, url);

    }
    public void requestValidDatum(final MvpView<List<ValidDatum>> view, String url) {

        JsonObjectRequest request;

        request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        Type type = new TypeToken<EntryEntity>() {
                        }.getType();
                        EntryEntity reportEntity = new Gson().fromJson(response.toString(), type);
                        view.render(reportEntity.getValidData());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        view.showError(error.getMessage());
                    }
                });
        MyApplication.getInstance().addToRequestQueue(request, url);

    }

}
