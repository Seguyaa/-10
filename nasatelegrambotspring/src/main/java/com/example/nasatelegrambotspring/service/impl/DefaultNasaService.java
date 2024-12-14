package com.example.nasatelegrambotspring.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.nasatelegrambotspring.model.NasaObject;
import com.example.nasatelegrambotspring.service.NasaService;



@Service
public class DefaultNasaService implements NasaService {

    private final static RestTemplate restTemplate = new RestTemplate();
    private final static String URL = "https://api.nasa.gov/planetary/apod?api_key=";
    private static final String TOKEN = "D2yWoaVSmIS17TBpn4AihKPZ7lYrk7LaUa6E6K4N";


    @Override
    public NasaObject getPhoto() {
        String requestURL = URL + TOKEN;
        return restTemplate.getForEntity(requestURL, NasaObject.class).getBody();
    }

}

