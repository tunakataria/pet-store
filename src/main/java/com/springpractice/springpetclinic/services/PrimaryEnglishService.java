package com.springpractice.springpetclinic.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryEnglishService implements GreetingService {

    GreetingRepository greetingRepository;
    @Autowired
    public PrimaryEnglishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public void sayGreeting() {
        greetingRepository.sayGreetingInEnglish();

    }
}
