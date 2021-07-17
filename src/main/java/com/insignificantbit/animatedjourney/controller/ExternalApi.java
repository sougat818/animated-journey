package com.insignificantbit.animatedjourney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalApi {

    @GetMapping("/external")
    public String callExternalAPI() {
        return "Success is";
    }

}
