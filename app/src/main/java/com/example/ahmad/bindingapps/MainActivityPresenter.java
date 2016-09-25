package com.example.ahmad.bindingapps;

/**
 * Created by ahmad on 9/25/16.
 */

public class MainActivityPresenter {

    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

}
