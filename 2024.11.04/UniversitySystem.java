public class UniversitySystem {
    public static void main(String[] args) {
        // Create courses
        Course U1 = new UndergraduateCourse("Computer Science", "CS101");
		Course U2 = new UndergraduateCourse("Software Engneering", "CS103");
        Course P1 = new PostgraduateCourse("Data Science", "DS501");

        // Create students
        Student S1 = new Student("Alice", "S001",U1);
        Student S2 = new Student("Bob", "S002",P1);
		
		
		System.out.println(S1);

        
    }
}