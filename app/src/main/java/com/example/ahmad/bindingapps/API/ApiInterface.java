package com.example.ahmad.bindingapps.API;

import com.example.ahmad.bindingapps.model.cuaca.Semua;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by ahmad on 9/25/16.
 */

//http://api.openweathermap.org/data/2.5/weather?q=Malang&units=metric&appid=8cb863afbf2d876893d3d8d2db08c902

public interface ApiInterface {
    @GET("data/2.5/{kategori}")
    Call<Semua> getCuacas(@Path("kategori") String kategori, @Query("q") String kota, @Query("units") String units, @Query("appid") String apikey);
}