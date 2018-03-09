/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.jpa.samp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Dell
 */
public class RemittanceRepositoryImpl implements RemittanceRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void sampStoredProcCall(String p_name) {
        // JPA Native Stored Proc Call
        // Query query = em.createNativeQuery("call SP_REMITTANCE_BY_NAME(:p_name)").setParameter("p_name", p_name);
        
        // JPA Native Stored Proc Call w/ Parameter
        //Query query = em.createNativeQuery("call SP_REMITTANCE()");
        
        // JPA Named Stored Proc Call w/ Parameter 
        Query query = em.createNamedStoredProcedureQuery("in_only_test").setParameter("p_name", p_name);
        List<Remittance> result = query.getResultList();
        System.out.println("List size:  " + result.size());
    }
}
