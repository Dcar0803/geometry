package geometry;

public class Triangle extends Geometry2D {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    
    
    /**
     * Constructs a triangle with the specified dimensions.
     * @param base The base length of the triangle.
     * @param height The height of the triangle.
     * @param sideA The length of side A.
     * @param sideB The length of side B.
     */

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    /**
     * Calculates the area of the triangle.
     * @return The area of the triangle.
     */

    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    /**
     * Calculates the perimeter of the triangle.
     * @return The perimeter of the triangle.
     */

    @Override
    public double perimeter() {
        return base + sideA + sideB;
    }
    

    /**
     * Provides a string representation of the triangle.
     * @return A string describing the triangle.
     */

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", sideA=" + sideA + ", sideB=" + sideB + "]";
    }
}