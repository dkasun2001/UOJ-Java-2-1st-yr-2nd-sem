/*
NOTE, we did not design radius and colour here. But they are avalable from circle class
 becauses of the extends keyword
*/
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
      
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String colour) {
        super(radius, colour);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return findArea() * height;
    }
	
	public String toString (){
		return "This is a cylinder";
	}
}
