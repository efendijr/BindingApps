package com.example.ahmad.bindingapps.API;

import android.util.Log;

import com.example.ahmad.bindingapps.model.cuaca.Semua;
import com.example.ahmad.bindingapps.model.vm.MainViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ahmad on 9/25/16.
 */

public class OpenWeatherModel {
    private static final String TAG = "OpenWeatherModel";

    private MainViewModel mViewModel;

    public static final String API_KEY = "8cb863afbf2d876893d3d8d2db08c902";
    public static final String KATEGORI = "weather";
    public static final String UNITS = "metric";
    public static final String QUERY = "Malang";

    public OpenWeatherModel(MainViewModel mViewModel) {
        this.mViewModel = mViewModel;
    }

    public void getWeather() {
            ApiInterface apiService = ApiClients.getClient().create(ApiInterface.class);
            Call<Semua> call = apiService.getCuacas(KATEGORI, QUERY, UNITS, API_KEY);
            call.enqueue(new Callback<Semua>() {
                @Override
                public void onResponse(Call<Semua> call, Response<Semua> response) {
//                    String kota = response.body().getName();
//                    String negara = response.body().getSys().getCountry();
//                    String deskripsi = response.body().getWeathers().get(0).getDescription();
//                    String suhu = response.body().getMain().getTemp() + "";

                    mViewModel.setNamakota(response.body().getName());
                    mViewModel.setNamanegara(response.body().getSys().getCountry());
                    mViewModel.setNamacuaca(response.body().getWeathers().get(0).getDescription());
                    mViewModel.setSuhucuaca("" + response.body().getMain().getTemp());

                }

                @Override
                public void onFailure(Call<Semua> call, Throwable t) {
                    Log.e("Error : " , t.toString());
                }
            });
        }

    }
