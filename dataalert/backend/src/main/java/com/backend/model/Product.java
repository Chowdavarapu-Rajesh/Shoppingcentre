package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
@Id@GeneratedValue 
private int ProductId;
private String ProductName;
private float Price;

public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}

public float getPrice() {
	return Price;
}
public void setPrice(float price) {
	Price = price;
}


}
