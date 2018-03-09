/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.actuator.samp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
public class ActuatorSampController {

    private static final String template = "Hi %s, this a test actuator app";
    
    @RequestMapping("/actuator-test")
    public String anyMethodName(@RequestParam(value = "name", required = false, defaultValue = "Paolo") String name) {

        return String.format(template, name);
    }
    // Endpoint Override
    @RequestMapping("/health")
    public String anyMethodName2() {

        return "Health endpoint override";
    }
}
