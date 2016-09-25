package com.example.ahmad.bindingapps;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ahmad on 9/25/16.
 */

public class TemperatureData extends BaseObservable {

    private String celcius;
    private String farenhait;

    public TemperatureData(String celcius, String farenhait) {
        this.celcius = celcius;
        this.farenhait = farenhait;
    }

    @Bindable
    public String getCelcius() {
        return celcius;
    }

    public void setCelcius(String celcius) {
        this.celcius = celcius;
        notifyPropertyChanged(BR.celcius);
    }

    @Bindable
    public String getFarenhait() {
        return farenhait;
    }

    public void setFarenhait(String farenhait) {
        this.farenhait = farenhait;
        notifyPropertyChanged(BR.farenhait);
    }
}
