package com.hary;

import org.apache.dubbo.common.URL;

public class CarWrapper implements Car {

    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public String getCarName(URL url) {
        System.out.println("wrapper...");
        return car.getCarName(url);
    }

    @Override
    public String sayHello() {
        return null;
    }
}
