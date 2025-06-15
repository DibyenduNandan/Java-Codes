package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class Affiliated_Composite implements Serializable {
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "physician", referencedColumnName = "employeeID", nullable = false)
	private Physician physician;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department", referencedColumnName = "departmentID", nullable = false)
	private Department department;

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
