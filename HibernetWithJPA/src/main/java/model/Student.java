package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Student_Table")
public class Student {
	@Id
	@SequenceGenerator(name = "stud_gen", initialValue = 1000, allocationSize =1)
	@GeneratedValue(generator = "stud_gen", strategy = GenerationType.SEQUENCE)
	private long studentId;
	private String studentName;
	private long phone;
//	@OneToMany
	@ManyToMany
	@JoinTable(name = "student_ref", joinColumns = {@JoinColumn(name="student_id")}, 
	inverseJoinColumns = {@JoinColumn(name="course_id",unique = false)})
	
	
	
	
//	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "student")
//	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> courses;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

}
