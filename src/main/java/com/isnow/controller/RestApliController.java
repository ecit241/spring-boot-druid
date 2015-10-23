package com.isnow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lxq on 15-10-23.
 */
@RestController
public class RestApliController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
