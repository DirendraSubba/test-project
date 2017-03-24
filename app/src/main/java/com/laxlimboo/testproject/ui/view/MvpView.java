package com.laxlimboo.testproject.ui.view;

import android.content.Context;

public interface MvpView<DATA extends Object> {

    void showLoading();

    void hideLoading();

    void showRetry();

    void hideRetry();

    void showError(String message);

    Context context();

    void render(DATA data);
}
