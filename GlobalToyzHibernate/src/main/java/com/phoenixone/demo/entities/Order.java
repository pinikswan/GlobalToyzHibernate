package com.phoenixone.demo.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "order")
@Table(name = "Orders")
public class Order {

	private String orderNo;
	private Date orderDate;
	private Shopper shopper;
	private ShippingMode shippingMode;
	private BigDecimal shippingCharges;
	private BigDecimal giftWrapCharges;
	private Character orderProcessed;
	private BigDecimal totalCost;
	private Date expirationDate;

	public Order() {

	}

	public Order(String orderNo, Date orderDate, Shopper shopper,
			ShippingMode shippingMode, BigDecimal shippingCharges,
			BigDecimal giftWrapCharges, Character orderProcessed,
			BigDecimal totalCost, Date expirationDate) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.shopper = shopper;
		this.shippingMode = shippingMode;
		this.shippingCharges = shippingCharges;
		this.giftWrapCharges = giftWrapCharges;
		this.orderProcessed = orderProcessed;
		this.totalCost = totalCost;
		this.expirationDate = expirationDate;
	}

	@Id
	@Column(name = "cOrderNo")
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "dOrderDate")
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@OneToOne
	@JoinColumn(name = "cShopperId", referencedColumnName = "cShopperId", insertable = false, updatable = false)
	public Shopper getShopper() {
		return shopper;
	}

	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}

	@OneToOne
	@JoinColumn(name = "cShippingModeId", referencedColumnName = "cModeId", insertable = false, updatable = false)
	public ShippingMode getShippingMode() {
		return shippingMode;
	}

	public void setShippingMode(ShippingMode shippingMode) {
		this.shippingMode = shippingMode;
	}

	@Column(name = "mShippingCharges")
	public BigDecimal getShippingCharges() {
		return shippingCharges.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public void setShippingCharges(BigDecimal shippingCharges) {
		this.shippingCharges = shippingCharges;
	}

	@Column(name = "mGiftWrapCharges")
	public BigDecimal getGiftWrapCharges() {
		return giftWrapCharges.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public void setGiftWrapCharges(BigDecimal giftWrapCharges) {
		this.giftWrapCharges = giftWrapCharges;
	}

	@Column(name = "cOrderProcessed")
	public Character getOrderProcessed() {
		return orderProcessed;
	}

	public void setOrderProcessed(Character orderProcessed) {
		this.orderProcessed = orderProcessed;
	}

	@Column(name = "mTotalCost")
	public BigDecimal getTotalCost() {
		return totalCost.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	@Column(name = "dExpDelDate")
	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
