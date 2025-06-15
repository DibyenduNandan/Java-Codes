package config;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import model.annotation.Course;


@Configuration
@ComponentScan(basePackages= {"model.annotation.Student"})

public class StudentConfig {
	
	@Bean("addr")
	public List<String> getAddress(){
		List<String> listOfNames=new ArrayList();
		listOfNames.add("kolkata");
		listOfNames.add("durgapur");
		return listOfNames;
	}
	
	@Bean("phones")
	public List<Long> getPhones(){
		List<Long> listOfPhones=new ArrayList();
		listOfPhones.add(12324L);
		listOfPhones.add(4255555L);
		return listOfPhones;
	}
	
	@Bean("courses")
	public List<Course> getCourses(){
		List<Course> list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of courses");
		int cno=sc.nextInt();
		for(int i=0;i<cno;i++) {
			System.out.println("Enter course Id");
			long id=sc.nextLong();
			System.out.println("Enter course Name");
			String name=sc.next();
			System.out.println("Enter course Price");
			double price =sc.nextDouble();
			Course ob=new Course(id, name,price);
			list.add(ob);
		}
		return list;
	}
	
	
}
