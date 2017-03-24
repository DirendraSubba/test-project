package com.laxlimboo.testproject.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

import com.laxlimboo.testproject.R;
import com.laxlimboo.testproject.model.TruckCenterDatum;
import com.laxlimboo.testproject.presenter.ReportPresenter;
import com.laxlimboo.testproject.ui.adapter.TruckCenterDatumAdapter;
import com.laxlimboo.testproject.ui.view.MvpView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.laxlimboo.testproject.utils.MyContants.REPORT_URL;

public class ReportActivity extends BaseActivity implements MvpView<List<TruckCenterDatum>>, SearchView.OnQueryTextListener {

    private static final String TAG = "ReportActivity";

    ReportPresenter mPresenter;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.tool_bar)
    Toolbar mToolbar;
    @BindView(R.id.search_view)
    SearchView mSearchView;

    TruckCenterDatumAdapter mAdapter;

    @Override
    int getLayout() {
        return R.layout.activity_report;
    }

    @Override
    void setupPresenter() {
        mPresenter = new ReportPresenter();
        mPresenter.attachView(this);
        mPresenter.initialize(REPORT_URL);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setSupportActionBar(mToolbar);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(
                ContextCompat.getDrawable(this, R.drawable.list_item_divider));
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context()));

        mAdapter = new TruckCenterDatumAdapter(new ArrayList<TruckCenterDatum>());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }

    @Override
    public void showError(String message) {
        showToast(message);
    }

    @Override
    public Context context() {
        return this;
    }

    @Override
    public void render(List<TruckCenterDatum> truckCenterDataList) {
        mAdapter.setTruckCenterDatumList(truckCenterDataList);
//        Toast.makeText(this, truckCenterDataList.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.destroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.report_menu, menu);

//        final MenuItem searchItem = menu.findItem(R.id.action_search);
//        mSearchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        mSearchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        // Here is where we are going to implement the filter logic
        mAdapter.filter(query);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }
}
