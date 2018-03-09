/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.rest.webservice.samp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
public class RestWebserviceController {

    private static final String template = "Hi, %s! This is response is triggered by a %s request.";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(path = "/greeting")
    public Greeting anyMethodName(@RequestParam(value = "name", defaultValue = "Paolo") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name, RequestMethod.GET));
    }
    
    @RequestMapping(path = "/greet-list")
    public List<Greeting> anyMethodName2(@RequestParam(value = "name", defaultValue = "Paolo") String name) {

        List<Greeting> list = new ArrayList();
        list.add(new Greeting(counter.incrementAndGet(),
                String.format(template, "Paolo", RequestMethod.GET)));
        list.add(new Greeting(counter.incrementAndGet(),
                String.format(template, "Lorraine", RequestMethod.GET)));
        list.add(new Greeting(counter.incrementAndGet(),
                String.format(template, "Paolo Jr.", RequestMethod.GET)));

        return list;
    }

    @RequestMapping(path = "/greeting", method = RequestMethod.POST)
    public Greeting anyMethodAgain(@RequestParam(value = "name", defaultValue = "Paolo") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name, RequestMethod.POST));
    }

    @RequestMapping(path = "/greet-post", method = {RequestMethod.POST})
    public Greeting anyMethodAgain2(@RequestParam(value = "name", defaultValue = "Paolo") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hi, %s!", name));
    }

    @RequestMapping(path = "/greet-get-post", method = {RequestMethod.POST, RequestMethod.GET})
    public Greeting anyMethodAgain3(@RequestParam(value = "name", defaultValue = "Paolo") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hi, %s!", name));
    }
}
