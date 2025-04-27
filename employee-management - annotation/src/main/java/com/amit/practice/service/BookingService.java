package com.amit.practice.service;

import com.amit.practice.model.Booking;
import lombok.*;
import org.springframework.stereotype.Service;

@Data
@Service
public class BookingService {
    public void printBooking(Booking booking){
        System.out.println("Booking details are: " +booking);
    }
}
