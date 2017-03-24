package com.laxlimboo.testproject.presenter;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.laxlimboo.testproject.MyApplication;
import com.laxlimboo.testproject.api.ApiController;
import com.laxlimboo.testproject.model.EntryEntity;
import com.laxlimboo.testproject.model.TruckCenterDatum;
import com.laxlimboo.testproject.model.ValidDatum;
import com.laxlimboo.testproject.ui.view.MvpView;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;

import static com.laxlimboo.testproject.utils.MyContants.REPORT_REQUEST_CODE;
import static com.laxlimboo.testproject.utils.MyContants.REPORT_URL;

public class EntryPresenter implements Persenter<MvpView<List<ValidDatum>>> {

    private static final String TAG = "ReportPresenter";

    MvpView<List<ValidDatum>> view;
    String mUrl;
    Context mContext;

    @Override
    public void initialize(String url) {

        mUrl = url;
        ApiController apiController = new ApiController();

        apiController.requestValidDatum(view, url);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        MyApplication.getInstance().cancelPendingRequests(mUrl);
    }

    @Override
    public void attachView(MvpView<List<ValidDatum>> view) {
        this.view = view;
    }

}
