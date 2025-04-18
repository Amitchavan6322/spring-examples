package com.amit.practice.service;

import com.amit.practice.model.Booking;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingService {
    private Booking booking;

    //we will ask this to spring
    public void createBooking(){

    }

    public void printBooking(){
        System.out.println("Booking details are: " +booking);
    }
}
