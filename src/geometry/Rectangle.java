package geometry;

public class Rectangle extends Geometry2D {
	
    private double length;
    private double width;
    
    /**
     * Constructs a rectangle with the specified dimensions.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle.
     */

    @Override
    public double area() {
        return length * width;
    }
    
    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    
    /**
     * Provides a string representation of the rectangle.
     * @return A string describing the rectangle.
     */

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

}//end of class 
