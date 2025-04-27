package com.amit.practice;

import com.amit.practice.Config.ConfigApp;
import com.amit.practice.model.Address;
import com.amit.practice.model.Booking;
import com.amit.practice.service.BookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static ApplicationContext context;

    public static void main(String[] args) {
        Address address = Address.builder()
                .addressline1("ABC")
                .addressline2("XYZ")
                .city("pune")
                .build();

        Booking booking = Booking.builder()
                .id(1)
                .price(200)
                .address(address)
                .build();

        context = new AnnotationConfigApplicationContext(ConfigApp.class);
        BookingService bookingService = context.getBean("bookingService", BookingService.class);
        bookingService.printBooking(booking);
    }
}

