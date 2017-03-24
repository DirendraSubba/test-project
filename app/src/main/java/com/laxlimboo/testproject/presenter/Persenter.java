package com.laxlimboo.testproject.presenter;

import android.support.annotation.Nullable;

import com.laxlimboo.testproject.utils.UseCaseData;
import com.laxlimboo.testproject.ui.view.MvpView;

public interface Persenter<T extends MvpView> {

    void initialize(@Nullable String url);

    /**
     * Method that control the lifecycle of the view. It should be called in the view's
     * (Activity or Fragment) onResume() method.
     */
    void resume();

    /**
     * Method that control the lifecycle of the view. It should be called in the view's
     * (Activity or Fragment) onPause() method.
     */
    void pause();

    /**
     * Method that control the lifecycle of the view. It should be called in the view's
     * (Activity or Fragment) onDestroy() method.
     */
    void destroy();

    void attachView(T view);

}
