/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.profiles.samp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Dell
 */
@SpringBootApplication
public class ProfileSampApplication implements CommandLineRunner {
   
    @Autowired
    DatabaseProperties dbProp;
    
    public static void main(String[] args) {
        SpringApplication.run(ProfileSampApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        System.out.println(dbProp);
    }
}
