package com.amit.practice.service;

import com.amit.practice.model.Address;
import com.amit.practice.model.Booking;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
       /* BookingService bookingService = new BookingService();
        Booking booking = Booking.builder()
                .id(1)
                .price(200.00)
                .address(
        Address.builder()
                        .addressline1("flat no. 104, abc apt")
                        .addressline2("Wakad")
                        .city("Pune").build()
                ).build();
bookingService.setBooking(booking);
bookingService.printBooking();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BookingService bookingService = context.getBean("bookingService", BookingService.class); //it give bean of mentioned specific class
        bookingService.printBooking();
    }
}

