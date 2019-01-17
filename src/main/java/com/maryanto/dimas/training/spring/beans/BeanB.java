package com.maryanto.dimas.training.spring.beans;

public class BeanB {

    public BeanB(BeanC c, BeanD d) {
        this.c = c;
        this.d = d;
    }

    public BeanB() {
    }

    private BeanC c;
    private BeanD d;

    public BeanC getC() {
        return c;
    }

    public void setC(BeanC c) {
        this.c = c;
    }

    public BeanD getD() {
        return d;
    }

    public void setD(BeanD d) {
        this.d = d;
    }
}
