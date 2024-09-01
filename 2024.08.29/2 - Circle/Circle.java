//In this java program we are going to write the Circle class
//In this java program we are going to write the Circle class
public class Circle{
    private double radius;
   
    

    //we now write the constrictors for the Circle
    // Method Overloading

    public Circle(double radius){
        this.radius = radius;
       
    }

    
    // the void keyword indicates that the method doesn't return any value.
    public void setRadius(double radius){
        this.radius=radius;
    }

    

    public double getRadius(){
        return radius;
    }

   
	
	
    public double findArea(){
        return radius*radius*3.14;
    }

    public double findCircumference() {
        return 2 * 3.14 * radius;
    }
    
    public String toString() {
        return ("This circle has [ radius = " + this.radius + "]");
    }

}
