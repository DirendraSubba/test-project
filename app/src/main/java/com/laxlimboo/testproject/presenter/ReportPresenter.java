package com.laxlimboo.testproject.presenter;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.laxlimboo.testproject.MyApplication;
import com.laxlimboo.testproject.api.ApiController;
import com.laxlimboo.testproject.model.ReportEntity;
import com.laxlimboo.testproject.model.TruckCenterDatum;
import com.laxlimboo.testproject.ui.view.MvpView;

import java.util.List;

import static com.laxlimboo.testproject.utils.MyContants.REPORT_REQUEST_CODE;
import static com.laxlimboo.testproject.utils.MyContants.REPORT_URL;

public class ReportPresenter implements Persenter<MvpView<List<TruckCenterDatum>>> {

    private static final String TAG = "ReportPresenter";

    MvpView<List<TruckCenterDatum>> view;
    Context mContext;

    @Override
    public void initialize(String url) {
        ApiController apiController = new ApiController();
        apiController.requestTruckCenterDatum(view, url);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        MyApplication.getInstance().cancelPendingRequests(REPORT_URL);
    }

    @Override
    public void attachView(MvpView<List<TruckCenterDatum>> view) {
        this.view = view;
    }

}
