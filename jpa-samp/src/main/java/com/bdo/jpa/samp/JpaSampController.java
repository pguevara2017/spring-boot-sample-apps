/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.jpa.samp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
public class JpaSampController {

    @Autowired
    RemittanceRepository repo;

    @RequestMapping("/show-details")
    public Remittance showDetails(@RequestParam(value = "name", required = false, defaultValue = "Dan Paolo Guevara") String name) {
        repo.sampStoredProcCall(name);
        return new Remittance();
    }

}
