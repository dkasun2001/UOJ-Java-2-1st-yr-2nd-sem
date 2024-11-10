class Student {
    private String name;
    private String studentId;
	private Course course;

    public Student(String name, String studentId, Course course) {
        this.name = name;
        this.studentId = studentId;
		this.course = course;
    }

    public String getName() {
        return name;
    }
	
	public void setName(String name){
		this.name = name;
	}

    public String getStudentId() {
        return studentId;
    }
	
	public void setStudentId(String studentId){
		this.studentId = studentId;
	}
	
	public Course getStudentCourse() {
        return course;
    }
	
	public void setStudentCourse(Course course){
		this.course = course;
	}

    @Override
    public String toString() {
        return ("Student Name : " + this.name + "\nStudent Id : " + this.studentId +"\n"+this.course.toString());
    }
}