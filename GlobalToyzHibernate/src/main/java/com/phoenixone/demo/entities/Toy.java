package com.phoenixone.demo.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "toy")
@Table(name = "Toys")
public class Toy {
	private String id;
	private String name;
	private String description;
	private Category category;
	private BigDecimal price;
	private Brand brand;
	private Integer quantity;
	private Integer lowerAge;
	private Integer upperAge;
	private Integer weight;
	private String imagePath;

	public Toy() {
	}

	public Toy(String id, String name, String description, Category category,
			BigDecimal price, Brand brand, int quantity,
			int lowerAge, int upperAge, int weight, String imagePath) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
		this.lowerAge = lowerAge;
		this.upperAge = upperAge;
		this.weight = weight;
		this.imagePath = imagePath;
	}

	@Id
	@Column(name = "cToyId", nullable = false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "vToyName", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "vToyDescription", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToOne
	@JoinColumn(name = "cCategoryId", referencedColumnName = "cCategoryId", insertable = false, updatable = false)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "mToyRate", nullable = false)
	public BigDecimal getPrice() {
		return price.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@OneToOne
	@JoinColumn(name = "cBrandId", referencedColumnName = "cBrandId", insertable = false, updatable = false)
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Column(name = "siToyQoh", nullable = false)
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "siLowerAge", nullable = true)
	public Integer getLowerAge() {
		return lowerAge;
	}

	public void setLowerAge(Integer lowerAge) {
		this.lowerAge = lowerAge;
	}

	@Column(name = "siUpperAge", nullable = true)
	public Integer getUpperAge() {
		return upperAge;
	}

	public void setUpperAge(Integer upperAge) {
		this.upperAge = upperAge;
	}

	@Column(name = "siToyWeight", nullable = true)
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Column(name = "vToyImgPath", nullable = true)
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
