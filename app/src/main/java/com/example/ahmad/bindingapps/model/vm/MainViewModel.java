package com.example.ahmad.bindingapps.model.vm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.ahmad.bindingapps.BR;

/**
 * Created by ahmad on 9/25/16.
 */

public class MainViewModel extends BaseObservable {

    private String namakota;
    private String namanegara;
    private String namacuaca;
    private String suhucuaca;

    @Bindable
    public String getNamakota() {
        return namakota;
    }

    public void setNamakota(String namakota) {
        this.namakota = namakota;
        notifyPropertyChanged(BR.namakota);
    }

    @Bindable
    public String getNamanegara() {
        return namanegara;
    }

    public void setNamanegara(String namanegara) {
        this.namanegara = namanegara;
        notifyPropertyChanged(BR.namanegara);
    }

    @Bindable
    public String getNamacuaca() {
        return namacuaca;
    }

    public void setNamacuaca(String namacuaca) {
        this.namacuaca = namacuaca;
        notifyPropertyChanged(BR.namacuaca);
    }

    @Bindable
    public String getSuhucuaca() {
        return suhucuaca;
    }

    public void setSuhucuaca(String suhucuaca) {
        this.suhucuaca = suhucuaca;
        notifyPropertyChanged(BR.suhucuaca);
    }
}
