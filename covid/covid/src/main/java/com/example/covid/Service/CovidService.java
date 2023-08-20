package com.example.covid.Service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CovidService {

    private static final String url = "https://corona-virus-world-and-india-data.p.rapidapi.com/api_india_timeline";
    private static final String rapidApiKey = "5a1e22b631msh07a418f60a8fba4p1795dbjsne0025a1071fb";
    private static final String rapidApiHost = "corona-virus-world-and-india-data.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

    public Object getAllCountryCovidData() {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", rapidApiKey);
            headers.set("X-RapidAPI-Host", rapidApiHost);

            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),
                    String.class);

            log.info("Output from RapidAPI: ", response.getBody());

            return response.getBody();

        } catch (Exception e) {
            log.error("Something went wrong while getting value from RapidAPI", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception while calling endpoint of RapidAPI for corona", e);
        }

    }

}
