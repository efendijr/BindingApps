package com.example.ahmad.bindingapps;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.ahmad.bindingapps.API.OpenWeatherModel;
import com.example.ahmad.bindingapps.databinding.ActivityMainBinding;
import com.example.ahmad.bindingapps.model.vm.MainViewModel;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    private MainViewModel viewModel;
    private OpenWeatherModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this);
        TemperatureData temperatureData = new TemperatureData("10", "20");
        binding.setTemp(temperatureData);
        binding.setPresenter(mainActivityPresenter);

        viewModel = new MainViewModel();
        binding.setCuaca(viewModel);
        model = new OpenWeatherModel(viewModel);
        model.getWeather();



    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celcius = temperatureData.getCelcius();
        String farenhait = temperatureData.getFarenhait();
        Toast.makeText(this, celcius + " " + farenhait, Toast.LENGTH_SHORT).show();

//        model.getWeather();
    }


}
