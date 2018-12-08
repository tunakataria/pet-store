package com.springpractice.springpetclinic;

import com.springpractice.springpetclinic.services.PrimaryEnglishService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SpringPetClinicApplication.class, args);

        context.getBean(PrimaryEnglishService.class).sayGreeting();
    }
}
