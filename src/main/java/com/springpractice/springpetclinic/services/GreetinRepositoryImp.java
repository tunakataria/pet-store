package com.springpractice.springpetclinic.services;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class GreetinRepositoryImp implements  GreetingRepository{

    @Override
    public void sayGreetingInEnglish() {
        System.out.println("Hello, this is in english");
    }

    @Override
    public void sayGreetingInSpanish() {
        System.out.println("Hello, this is in Spanish" +
                "");
    }
}
