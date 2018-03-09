/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdo.jpa.samp;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "remittance")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "in_only_test",
            procedureName = "SP_REMITTANCE_BY_NAME",
            parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_name", type = String.class)
            })
})
public class Remittance implements Serializable {

    public Remittance() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    private long id;
    private String name;

}
