package model.annotation;


public class Course {
	private long courseId;
	private String courseName;
	private double coursePrice;
	
	public Course(long courseId, String courseName, double coursePrice) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}
	
	
	
	
}
