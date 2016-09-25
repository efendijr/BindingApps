package com.example.ahmad.bindingapps.model.cuaca;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmad on 9/17/16.
 */
public class Clouds {

    @SerializedName("all")
    @Expose
    private Integer all;

    public Clouds(Integer all) {
        this.all = all;
    }


    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }
}
