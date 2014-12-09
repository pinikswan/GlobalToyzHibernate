package com.phoenixone.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "country")
@Table(name = "country")
public class Country {

	private String id;
	private String name;

	public Country() {

	}

	public Country(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name = "cCountryId")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "cCountry")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
