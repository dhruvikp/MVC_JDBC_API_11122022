package com.simplilearn.model;

import java.util.Date;

public class EProduct {
	private int productId;
	private String productName;
	private Double productPrice;
	private Date productDateAdded;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Date getProductDateAdded() {
		return productDateAdded;
	}
	public void setProductDateAdded(Date productDateAdded) {
		this.productDateAdded = productDateAdded;
	}
}