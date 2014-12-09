package com.phoenixone.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "category")
@Table(name = "category")
public class Category {
	private String id;
	private String name;
	private String description;

	public Category() {
	}

	public Category(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Id
	@Column(name="cCategoryId", nullable=false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="cCategory", nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="vDescription", nullable=false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
