package controller;

import javax.persistence.EntityManager;

import model.Address;
import model.Employee;

import java.util.*;

import javax.persistence.*;

import utility.DBUtil;

public class TestEmp {
	
	public static void main(String[] args) {
		
		EntityManager em= DBUtil.connectWithDB();
		
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter Employee name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter Employee phone");
		long ph=sc.nextLong();
		System.out.println("Enter Employee salary");
		double sal=sc.nextDouble();
		System.out.println("Enter Employee mail Id");
		sc.nextLine();
		String mail=sc.nextLine();
		
		System.out.println("Enter city name");
		String cityName=sc.nextLine();
		System.out.println("Enter state name");
		String state=sc.nextLine();
		System.out.println("Enter code");
		long code=sc.nextLong();
		Address obj=new Address(cityName,state,code);
		
		
		Employee e1=new Employee();
		e1.setEmpId(id);
		e1.setEmpName(name);
		e1.setPhone(ph);
		e1.setSalary(sal);
		e1.setEmailId(mail);
		e1.setAddress(obj);
		
		// persisting entity object 
		//em.persist(obj);
		em.persist(e1);
		et.commit();
	}

}
