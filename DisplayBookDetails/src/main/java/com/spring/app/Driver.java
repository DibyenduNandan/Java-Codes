package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static Order loadBookDetails() {
		//fill the code
		//ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		
		Order obj=ctx.getBean("Orderobj",Order.class);
		return obj;
	}

	public static void main(String[] args) {
	
	  Order obj=loadBookDetails();
	  obj.displayOrderDetails();
	  System.out.println("Total Bill Amount:"+obj.calculateTotalPrice());
	
	
	}

}
