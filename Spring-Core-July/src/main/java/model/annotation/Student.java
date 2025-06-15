package model.annotation;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("102")
	private int studentRoll;
	
	@Autowired
	@Qualifier("addr")
	private List<String> address;
	
	@Autowired
	@Qualifier("phones")
	private List<String> phones;
	
	@Autowired
	@Qualifier("courses")
	private List<Course> courses;

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", address=" + address + ", phones=" + phones + ", courses="
				+ courses + "]";
	}
	
	

}
