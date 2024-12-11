package geometry;

/**
 * Represents a triangular prism with a base, height, and length.
 */

public class TriangularPrism extends Geometry3D {
    private double base;
    private double height;
    private double length;
    
    /**
     * Constructs a triangular prism with the specified dimensions.
     * @param base The base length of the prism.
     * @param height The height of the prism.
     * @param length The length of the prism.
     */

    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }
    
    /**
     * Calculates the volume of the triangular prism.
     * @return The volume of the prism.
     */

    @Override
    public double volume() {
        return 0.5 * base * height * length;
    }
    
    /**
     * Calculates the surface area of the triangular prism.
     * @return The surface area of the prism.
     */

    @Override
    public double surfaceArea() {
        double sideLength = Math.sqrt((base / 2) * (base / 2) + height * height);
        return base * length + 2 * (sideLength * length) + base * height;
    }
    
    /**
     * Provides a string representation of the triangular prism.
     * @return A string describing the prism.
     */

    @Override
    public String toString() {
        return "TriangularPrism [base=" + base + ", height=" + height + ", length=" + length + "]";
    }
}