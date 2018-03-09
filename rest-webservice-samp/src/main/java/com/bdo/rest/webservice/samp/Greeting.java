/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.rest.webservice.samp;

/**
 *
 * @author Dell
 */
public class Greeting {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private long id;
    private String message;

    public Greeting(long id, String message) {

        this.id = id;
        this.message = message;
    }
}
