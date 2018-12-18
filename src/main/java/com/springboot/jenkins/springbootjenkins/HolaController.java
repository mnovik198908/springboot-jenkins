package com.springboot.jenkins.springbootjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping(path = "holaMundo")
    public String holaMundo(){
        return "Hola mundo";
    }
}
