package com.example.covid.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.covid.Service.CovidService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/covid")
@RequiredArgsConstructor
public class CovidController {
    private final CovidService covidService;

    @GetMapping("/get_allcountry_covidData")
    public ResponseEntity<?> callRapidApiToGetCovidData() {

        return ResponseEntity.ok(covidService.getAllCountryCovidData());

    }

}
