/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.jpa.samp;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Dell
 */
public interface RemittanceRepositoryCustom {
   
    void sampStoredProcCall(@Param("p_name") String p_name);
}
