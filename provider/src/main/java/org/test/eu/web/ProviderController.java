package org.test.eu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProviderController {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping(name="/provider")
    public String con(List<String> list){
       System.out.println(list);
       return "provider";
    }
}
