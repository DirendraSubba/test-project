package com.laxlimboo.testproject.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.laxlimboo.testproject.R;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    void setupPresenter() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.btn_entry)
    void onClickEntry() {
        Log.d(TAG, "onClickEntry: ");
        Intent intent = new Intent(this, EntryActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_report)
    void onClickReport() {
        Intent intent = new Intent(this, ReportActivity.class);

        startActivity(intent);
    }
}
