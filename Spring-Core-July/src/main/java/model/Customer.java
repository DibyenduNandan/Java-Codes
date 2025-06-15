package model;

import java.util.*;

public class Customer {
	private long customerId;
	private String customername;
	private long customerPhone;
	private String emailId;
	private Address address;
	private List<Order> orders;
	
	
	public long getCustomerId() {
		return customerId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customername=" + customername + ", customerPhone="
				+ customerPhone + ", emailId=" + emailId + "]";
	}
	
	

}
