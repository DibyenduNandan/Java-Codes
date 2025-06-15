package model;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String cityName;
	private String stateName;
	private long pinCode;
	
	
	public Address(String cityName, String stateName, long pinCode) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}
	
	
	

}
