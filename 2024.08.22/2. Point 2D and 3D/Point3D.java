public class Point3D extends Point2D {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int z) {
        super();
        this.z = z;
    }

    public Point3D(int z, int y) {
        super(0, y); // Initialize x to 0
        this.z = z;
    }

    public Point3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String toString() {
        return "[ x = " + getX() + " y = " + getY() + " z = " + this.z + "]";
    }
}