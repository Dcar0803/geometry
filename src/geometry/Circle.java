package geometry;

public class Circle extends Geometry2D {
    private double radius;
    
    /**
     * Constructs a circle with the specified radius.
     * @param radius The radius of the circle.
     */

    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates the area of the circle.
     * @return The area of the circle.
     */

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calculates the perimeter (circumference) of the circle.
     * @return The perimeter of the circle.
     */

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Provides a string representation of the circle.
     * @return A string describing the circle.
     */

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
}//end of class 
