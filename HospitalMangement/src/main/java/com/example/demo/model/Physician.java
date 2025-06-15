package com.example.demo.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Physician {
	
	@Id
    private int EmployeeID;

    @Column(nullable = false, length = 30)
    private String Name;

    @Column(nullable = false, length = 30)
    private String Position;

    @Column(nullable = false)
    private Integer SSN;

    @OneToOne(mappedBy = "head")
    private Department departmentHead;
    
    @OneToMany(mappedBy = "physician")
    private List<Affiliated_Composite> affiliations;
	
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	

}
