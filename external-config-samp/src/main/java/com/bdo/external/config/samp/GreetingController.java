/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.external.config.samp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
public class GreetingController {

    @Value("${message}")
    private String greeting;

    @RequestMapping("/")
    public String anyMethodName(String name) {
//         return "Hi, this is a simple Spring Boot App.";
        return greeting;
    }

}
