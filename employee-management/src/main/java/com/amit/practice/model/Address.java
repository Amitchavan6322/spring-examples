package com.amit.practice.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String addressline1;
    private String addressline2;
    private String city;
}
