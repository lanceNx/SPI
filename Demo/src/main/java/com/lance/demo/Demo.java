package com.lance.demo;

import com.lance.database.spi.DataBaseDriver;

import java.util.ServiceLoader;

public class Demo {
    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader =
                ServiceLoader.load(DataBaseDriver.class);
        for (DataBaseDriver driver : serviceLoader) {
            System.out.println(driver.connection("WWH大傻逼"));
        }
    }
}
