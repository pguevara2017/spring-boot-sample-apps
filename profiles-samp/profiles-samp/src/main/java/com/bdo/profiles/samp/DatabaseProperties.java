/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.profiles.samp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dell
 */
@Component
@ConfigurationProperties("database")
public class DatabaseProperties {

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String hostname;
    String dbname;
    String username;
    
    @Override
    public String toString() {
        return "DatabaseProperties{" +
                "hostname='" + hostname + '\'' +
                ", dbname=" + dbname +
                ", username=" + username +
                '}';
    }
}
