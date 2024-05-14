package com.arcos.ernesto.discbookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discbook/v1/discs")
public class DiscController {
    @GetMapping(value = "/test")
    public String test() {
        return "Greetings from DiscController!";
    }
}
