package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Department {
	
	 @Id
	 private int DepartmentID;

	 @Column(nullable = false, length = 30)
	 private String Name;

	 @OneToOne
	 @JoinColumn(name = "head", referencedColumnName = "employeeID", nullable = false)
	 private Physician head;

	 @OneToMany(mappedBy = "department")
	 private List<Affiliated_Composite> affiliations;
	
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
