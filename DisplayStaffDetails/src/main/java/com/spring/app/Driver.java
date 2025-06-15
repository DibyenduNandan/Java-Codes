package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static Department loadStaffDetails()
	{
		//fill the code
		ApplicationContext cxt= new ClassPathXmlApplicationContext("beans.xml");
		Department dep=(Department)cxt.getBean("departmentObj");
		return dep;
	}

	public static void main(String[] args) {
		//fill the code
		loadStaffDetails().displayStaffDetails();
		
		
	}

}
