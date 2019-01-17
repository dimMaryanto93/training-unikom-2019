package com.maryanto.dimas.training.spring.beans;

public class BeanA {

    private BeanB b;

    public BeanA() {
    }

    public BeanA(BeanB b) {
        this.b = b;
    }

    public BeanB getB() {
        return b;
    }

    public void setB(BeanB b) {
        this.b = b;
    }


}
