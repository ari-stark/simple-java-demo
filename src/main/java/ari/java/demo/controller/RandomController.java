package ari.java.demo.controller;

import ari.java.demo.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

    @Autowired
    private RandomService randomService;

    @GetMapping(name = "str", path = "/str")
    public String randomString() {
        return randomService.randomString();
    }

    @GetMapping(name = "int", path = "/int")
    public int randomNumber() {
        return randomService.randomInt();
    }
}
