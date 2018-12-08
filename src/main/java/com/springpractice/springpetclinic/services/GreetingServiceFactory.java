package com.springpractice.springpetclinic.services;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {

    GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createService(String profile) {

        switch (profile) {
            case "en":
                return new PrimaryEnglishService(greetingRepository);
            case "es":
                return new PrimarySpanishService(greetingRepository);
            default:
                return new PrimaryEnglishService(greetingRepository);


        }
    }
}
