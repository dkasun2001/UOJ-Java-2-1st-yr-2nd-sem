public class Cylinder extends Circle {
    private double height;
  

    public Cylinder(double height, double radius) {
        super(radius);
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
	
	@Override
	public String toString (){
		return ("height: "+this.height+" radius"+super.getRadius());
	}
	
	@Override
	public double findArea(){
		return ((2*3.14*super.getRadius()*super.getRadius()) + (2*3.14*super.getRadius()*this.height));
	}
}
