package com.springpractice.springpetclinic.services;

import org.springframework.beans.factory.annotation.Autowired;


public class PrimarySpanishService implements GreetingService {


    GreetingRepository greetingRepository;
    @Autowired
    public PrimarySpanishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public void sayGreeting() {
        greetingRepository.sayGreetingInSpanish();
    }
}
