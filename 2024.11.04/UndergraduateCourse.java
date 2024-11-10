class UndergraduateCourse extends Course {
    public UndergraduateCourse(String courseName, String courseCode) {
        super(courseName, courseCode);
    }
	
	@Override
	public String getCourseName() {
        return super.getCourseName();
    }
	
	@Override
	public void setCourseName(String name){
		super.setCourseName(name);
	}
	
	@Override
	public String getCourseCode() {
        return super.getCourseCode();
    }
	
	@Override
	public void setCourseCode(String code){
		super.setCourseCode(code);
	}

    
    public String getCourseType() {
        return "Undergraduate";
    }
	
	@Override
	public String toString(){
		return (super.toString()+" Course Type : "+this.getCourseType());
	}
}