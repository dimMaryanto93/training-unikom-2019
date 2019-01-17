package com.maryanto.dimas.training.spring.beans;

public class BeanC {

    public BeanC(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public BeanC() {
    }

    private String namaLengkap;

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
}
