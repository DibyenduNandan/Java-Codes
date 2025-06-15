package model;

import javax.persistence.*;
@Entity
@Table(name = "Course_Table")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	@Column(unique = true)
	private String courseName;
	
//	@ManyToOne
//	@JoinColumn(name="student_id")
//	private Student student;
//
//public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	//	public Course(String courseName) {
//		this.courseName = courseName;
//	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}


}