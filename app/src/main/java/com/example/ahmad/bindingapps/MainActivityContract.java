package com.example.ahmad.bindingapps;

/**
 * Created by ahmad on 9/25/16.
 */

public interface MainActivityContract {

    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }

}
