package com.amit.practice;

import com.amit.practice.Config.ConfigApp;
import com.amit.practice.model.Address;
import com.amit.practice.model.City;
import com.amit.practice.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static ApplicationContext context;
    public static void main( String[] args ) {

        City city = City.builder().name("pune").build();

        Address address = Address.builder().city(city).build();

        context = new AnnotationConfigApplicationContext(ConfigApp.class);
        HelloService helloService = context.getBean("helloService" , HelloService.class);
        helloService.setName("Amit");
        helloService.setAddress(address);

        helloService.sayHello();
    }
}

