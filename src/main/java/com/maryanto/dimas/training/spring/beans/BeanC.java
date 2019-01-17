package com.maryanto.dimas.training.spring.beans;

import lombok.Data;

@Data
public class BeanC {

    public BeanC() {
    }

    public BeanC(Integer no){
        this.nomor = no;
    }


    private String namaLengkap;
    private Integer nomor;

}
