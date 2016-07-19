/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.universityfinder.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author federico.calarco
 */
@Entity
public class Career {
    @Id
    private Long id;
    private String name;

    public Career() {
    }

    public Career(String name) {
        this.name = name;
    }

    public Career(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
