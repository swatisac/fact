package com.facts.interview.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration   //xml
public class Configurator {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    };


    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }


}


