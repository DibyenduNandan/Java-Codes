package controller.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.StudentConfig;
import model.Student;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student studObj=ctx.getBean("Student",Student.class);
		System.out.println(studObj);
	}
}
