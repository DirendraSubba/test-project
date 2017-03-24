package com.laxlimboo.testproject.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.laxlimboo.testproject.R;
import com.laxlimboo.testproject.model.ValidDatum;
import com.laxlimboo.testproject.presenter.EntryPresenter;
import com.laxlimboo.testproject.ui.view.MvpView;

import java.util.ArrayList;
import java.util.List;

public class SpinnerEntryView extends FrameLayout implements MvpView<List<ValidDatum>>, AdapterView.OnItemSelectedListener {

    public interface OnSpinnerEntryDataSelectedListener {
        void onDataSelected(ValidDatum validDatum);
    }

    OnSpinnerEntryDataSelectedListener mOnSpinnerEntryDataSelectedListener;
    //    @BindView(R.id.title)
    TextView mTitle;
    //    @BindView(R.id.spinner)
    Spinner mSpinner;

    List<ValidDatum> mValidDatumList;
    ValidDatum mSelectedItem;
    EntryPresenter mPresenter;

    public SpinnerEntryView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

//        ButterKnife.bind(this);

        TypedArray array = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.SpinnerEntryView,
                0, 0);

        String titleText = (String) array.getText(R.styleable.SpinnerEntryView_title);
        String urlText = (String) array.getText(R.styleable.SpinnerEntryView_url);
        int titleColor = array.getColor(R.styleable.SpinnerEntryView_titleTextColor,
                ContextCompat.getColor(getContext(), R.color.colorAccent));
        array.recycle();

//        setOrientation(LinearLayout.HORIZONTAL);
//        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_spinner_entry, this, true);

        mTitle = (TextView) getChildAt(0);
        mTitle.setTextColor(titleColor);
        mSpinner = (Spinner) getChildAt(1);
        mSpinner.setGravity(Gravity.RIGHT);

//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                0, ViewGroup.LayoutParams.WRAP_CONTENT
//        );
//        params.weight = 1;
//
//        mTitle.setLayoutParams(params);
//        mSpinner.setLayoutParams(params);
        mSpinner.setOnItemSelectedListener(this);
        mTitle.setText(titleText);

        mPresenter = new EntryPresenter();
        mPresenter.attachView(this);
        mPresenter.initialize(urlText);
    }

    public void setTitle(String title) {
        mTitle.setText(title);
    }

    public void setUrl(String url) {
        mPresenter.initialize(url);
    }

    public void setOnSpinnerEntryDataSelectedListener(
            OnSpinnerEntryDataSelectedListener mOnSpinnerEntryDataSelectedListener) {
        this.mOnSpinnerEntryDataSelectedListener = mOnSpinnerEntryDataSelectedListener;
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

    }

    @Override
    public Context context() {
        return getContext();
    }

    @Override
    public void render(List<ValidDatum> validDatumList) {

        mValidDatumList = new ArrayList<>();
        mValidDatumList.addAll(validDatumList);
        mSelectedItem = validDatumList.get(0);
        List<String> listOfString = new ArrayList<>();

        for (ValidDatum validDatum : validDatumList) {
            listOfString.add(validDatum.getName());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(),
                R.layout.item_spinner,
                listOfString);

        mSpinner.setAdapter(arrayAdapter);
    }

    public String getSelectedItemName() {
        return mSelectedItem != null ? mSelectedItem.getName() : "";
    }

    public String getSelectedItemCode() {
        return mSelectedItem != null ? mSelectedItem.getCode() : "";
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSelectedItem = mValidDatumList != null && mValidDatumList.size() > 0 ?
                mValidDatumList.get(position) : null;

        if (mValidDatumList != null && mOnSpinnerEntryDataSelectedListener != null) {
            mOnSpinnerEntryDataSelectedListener.onDataSelected(mSelectedItem);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
