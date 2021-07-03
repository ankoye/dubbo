package com.hary;

import org.apache.dubbo.common.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedCar implements Car {

    @Autowired
    private UserService userService;

    @Override
    public String getCarName(URL url) {
        return "red";
    }

    @Override
    public String sayHello() {
        return null;
    }
}
