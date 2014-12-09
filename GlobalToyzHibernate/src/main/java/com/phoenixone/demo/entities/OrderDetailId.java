package com.phoenixone.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailId implements Serializable {

	
    private String order;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

 
    private String toy;

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }   
}
