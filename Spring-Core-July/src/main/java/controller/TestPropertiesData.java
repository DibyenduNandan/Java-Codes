package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;

public class TestPropertiesData {
	public static void main(String[] args) throws IOException {
//		Properties p=new Properties();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Id of Employee");
//		int id=sc.nextInt();
//		System.out.println("Enter the name of the employee");
//		String name=sc.next();
//		System.out.println("Enter salary of employee");
//		double sal=sc.nextDouble();
//		
//		p.put("emp.id", id+"");
//		p.put("emp.name", name);
//		p.put("emp.salary", sal+"");
//		
//		FileOutputStream fout= new FileOutputStream("./src/main/resources/empData.properties");
//		
//		// void store(FileOutputStream,String coment) throws IOException
//		
//		// void store(FileWriter,String comment)
//		
//		p.store(fout, "Properties file created");
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("empConfig.xml");
		Employee e= (Employee)ctx.getBean("empObj");
		System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSalary());
		
		
	}
}
