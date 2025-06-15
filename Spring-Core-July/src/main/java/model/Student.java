package model;

import java.util.*;

public class Student {
	private String name;
	private Map<Integer,Course> details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, Course> getDetails() {
		return details;
	}
	public void setDetails(Map<Integer, Course> details) {
		this.details = details;
	}
	
	

}
