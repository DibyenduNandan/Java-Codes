package controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("customerApp.xml");
		BeanFactory beans= new XmlBeanFactory(res);
		
		// Object getBean(String name_of_bean)
		// Bean is singleton it will always create same object
		Customer customer=(Customer)beans.getBean("custObj");
		System.out.println(customer.hashCode());
		customer.setCustomerId(2323);
		customer.setCustomername("abc");
		customer.setCustomerPhone(34343);
		customer.setEmailId("xyz@gmail,com");
		System.out.println(customer);
		
		Customer customer1=beans.getBean("custObj",Customer.class);
		System.out.println(customer1.hashCode());
		
	}
}
