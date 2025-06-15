package controller;

import java.security.cert.LDAPCertStoreParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.mysql.cj.Session;

import model.Course;
import model.Student;
import utility.DBUtil;

public class TestStudent {
	public static void main(String[] args) {
		EntityManager em=DBUtil.connectWithDB();
		EntityTransaction et=em.getTransaction();
		Course c1;
		Student s;
		while(true) {
			et.begin();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student details:");
			System.out.println("Enter student name");
			String name=sc.nextLine();
			System.out.println("Enter student phone");
			long ph=sc.nextLong();
			s=new Student();
			s.setStudentName(name);
			s.setPhone(ph);
			System.out.println("Enter how many courses");
			int n=sc.nextInt();
			List<Course> listOfCourse =new ArrayList<>();
			sc.nextLine();
			while(n!=0) {
				System.out.println("Enter course name");
				String c=sc.nextLine();
				c1=new Course();
				c1.setCourseName(c);
				listOfCourse.add(c1);
				n-=1;
				/*
				 * Query is an interface which resides inside java.persistence package
				 * which provides methods like
				 * getResluList()
				 * getSingleResult()
				 * 
				 * 
				 * 
				 */
				Query query=em.createQuery("select c.courseId from Course c where c.courseName=:p1");
				query.setParameter("p1", c);
				List<Long> id=(List<Long>)query.getResultList();
				System.out.println(id);
				
				if(id.isEmpty()) {
					em.persist(c1);
				}
				else {
//					em.persist(c1);
					c1.setCourseId(id.get(0));
					System.out.println(c1.getCourseId());
				}
			}
			s.setCourses(listOfCourse);
			em.persist(s);
			et.commit();
			System.out.println("Do you want to continue(y/n)");
			if(sc.next().equalsIgnoreCase("n")) {
				break;
			}
		}
	}
}
