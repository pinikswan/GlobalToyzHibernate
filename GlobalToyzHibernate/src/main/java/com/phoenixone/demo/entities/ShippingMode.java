package com.phoenixone.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "shippingMode")
@Table(name = "ShippingMode")
public class ShippingMode {

	private String id;
	private String mode;
	private Integer maximumDaysDelay;

	public ShippingMode() {

	}

	public ShippingMode(String id, String mode, Integer maximumDaysDelay) {
		
		this.id = id;
		this.mode = mode;
		this.maximumDaysDelay = maximumDaysDelay;
	}

	@Id
	@Column(name = "cModeId")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "cMode")
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "iMaxDelayDays")
	public Integer getMaximumDaysDelay() {
		return maximumDaysDelay;
	}

	public void setMaximumDaysDelay(Integer maximumDaysDelay) {
		this.maximumDaysDelay = maximumDaysDelay;
	}

}
