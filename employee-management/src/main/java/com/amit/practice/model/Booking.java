package com.amit.practice.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private int id;
    private double price;
    private Address address;
}
