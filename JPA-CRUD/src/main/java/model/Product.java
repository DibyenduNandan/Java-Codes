package model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue 
	private long productId;
	private String productName;
	private double productPrice;
	private LocalDate productMFD;
	private String productCatagory;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public LocalDate getProductMFD() {
		return productMFD;
	}
	public void setProductMFD(LocalDate productMFD) {
		this.productMFD = productMFD;
	}
	public String getProductCatagory() {
		return productCatagory;
	}
	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}
	
	public Product(){
		
	}
	
	public Product(String productName, double productPrice, LocalDate productMFD, String productCatagory) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMFD = productMFD;
		this.productCatagory = productCatagory;
	}
	
	

}
