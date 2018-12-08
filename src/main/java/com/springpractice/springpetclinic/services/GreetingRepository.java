package com.springpractice.springpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public interface GreetingRepository {

    void sayGreetingInEnglish();

    void sayGreetingInSpanish();
}
