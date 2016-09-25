package com.example.ahmad.bindingapps.model.cuaca;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmad on 9/17/16.
 */
public class Main {
    @SerializedName("temp")
    @Expose
    private Double temp;

    @SerializedName("pressure")
    @Expose
    private Double pressure;

    @SerializedName("humidity")
    @Expose
    private Integer humudity;

    @SerializedName("temp_min")
    @Expose
    private Double temp_min;

    @SerializedName("temp_max")
    @Expose
    private Double temp_max;



    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }


    public Integer getHumudity() {
        return humudity;
    }

    public void setHumudity(Integer humudity) {
        this.humudity = humudity;
    }


    public Double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Double temp_min) {
        this.temp_min = temp_min;
    }


    public Double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Double temp_max) {
        this.temp_max = temp_max;
    }
}
