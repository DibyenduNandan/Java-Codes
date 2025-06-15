package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table") // Used to rename the table as  by default it will be same as class name
public class Employee {
	@Id
	@Column(name="emp_id") // This is optional to rename we are using column and to provide constraint
	private long empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_phone",unique = true)
	private long phone;
	@Column(name="emp_salary",nullable = true) // Null value allowed when true
	private double salary;
	@Column(name="emp_email", unique = true)
	private String emailId;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	
}
