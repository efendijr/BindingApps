package com.example.ahmad.bindingapps.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ahmad on 9/25/16.
 */

//http://api.openweathermap.org/data/2.5/weather?q=Malang&units=metric&appid=8cb863afbf2d876893d3d8d2db08c902

public class ApiClients {

    public static final String BASE_URL = "http://api.openweathermap.org/";

    public static Retrofit retrofit = null;

    public static Retrofit getClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
