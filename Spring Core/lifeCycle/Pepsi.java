package com.demo.demo.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("Inside Intialization");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside Destroy");
    }
}
