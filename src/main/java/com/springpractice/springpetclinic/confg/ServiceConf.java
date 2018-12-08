package com.springpractice.springpetclinic.confg;

import com.springpractice.springpetclinic.services.GreetingRepository;
import com.springpractice.springpetclinic.services.GreetingService;
import com.springpractice.springpetclinic.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServiceConf {


    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return  new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    GreetingService primaryEnglishService(GreetingServiceFactory greetingServiceFactory){

        return greetingServiceFactory.createService("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){

        return greetingServiceFactory.createService("es");
    }
}

