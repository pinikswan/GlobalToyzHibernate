package com.phoenixone.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="brand")
@Table(name="ToyBrand")
public class Brand {
	private String id;
	private String name;
	
	public Brand() {	
	}

	public Brand(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name="cBrandId", nullable=false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="cBrandName", nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
