package com.amit.practice.service;

import com.amit.practice.model.Address;
import com.amit.practice.repository.HelloRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class HelloService {

    private String name;
    private Address address;

    @Autowired
    private HelloRepository helloRepository;

    public void sayHello(){
        System.out.println("Hello " + name + " from "+ address.getCity().getName());
        System.out.println("---------------------------" + helloRepository .greet() + "--------------------------");
        System.out.println("---------------------------" + helloRepository.show() + "--------------------------");
    }

}
