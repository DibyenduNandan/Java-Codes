package controller;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import model.Course;
import model.Student;

public class TestMApInjectionDemo {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new FileSystemXmlApplicationContext("./src/main/java/model/app.xml");
		Student stud = ctx.getBean("studObj",Student.class);
		String name=stud.getName();
		Map<Integer,Course> details=stud.getDetails();
		for(Map.Entry<Integer, Course> e: details.entrySet()) {
			int roll=e.getKey();
			Course c=e.getValue();
			System.out.println(roll +"--->" + c.getCourseId() +" "+c.getCourseName());
		}
	}

}
