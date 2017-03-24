package com.laxlimboo.testproject.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.laxlimboo.testproject.R;
import com.laxlimboo.testproject.model.ValidDatum;
import com.laxlimboo.testproject.ui.custom.SpinnerEntryView;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.laxlimboo.testproject.utils.MyContants.LOCATION_URL;
import static com.laxlimboo.testproject.utils.MyContants.REPORT_URL;

public class EntryActivity extends BaseActivity {

    private static final String TAG = "ReportActivity";

    @BindView(R.id.spinner_entry_location)
    SpinnerEntryView sevLocation;
    @BindView(R.id.spinner_entry_carrier)
    SpinnerEntryView sevCarrier;
    @BindView(R.id.spinner_entry_trailer_status)
    SpinnerEntryView sevTrailerStatus;


    @Override
    int getLayout() {
        return R.layout.activity_entry;
    }

    @Override
    void setupPresenter() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SpinnerEntryView.OnSpinnerEntryDataSelectedListener listener = new SpinnerEntryView.OnSpinnerEntryDataSelectedListener() {
            @Override
            public void onDataSelected(ValidDatum validDatum) {
                showToast(validDatum.toString());
            }
        };

        sevLocation.setOnSpinnerEntryDataSelectedListener(listener);
        sevCarrier.setOnSpinnerEntryDataSelectedListener(listener);
        sevTrailerStatus.setOnSpinnerEntryDataSelectedListener(listener);
    }

    @OnClick(R.id.btn_submit)
    void onClickSubmit() {
        showToast("Submit");
    }
}
