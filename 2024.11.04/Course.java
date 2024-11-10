abstract class Course {
    private String courseName;
    private String courseCode;
    

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
     
    }
	
	// Course Name
    public String getCourseName() {
        return this.courseName;
    }
	
	public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
	
	// Course Code
    public String getCourseCode() {
        return this.courseCode;
    }
	
	public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
	
    public abstract String getCourseType();
	
	public String toString(){
		return ("Course Name : "+this.courseName+"\nCourse Code : "+this.courseCode);
	}
}