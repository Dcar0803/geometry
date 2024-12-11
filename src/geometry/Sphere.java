package geometry;

/**
 * Represents a sphere with a specified radius.
 */

public class Sphere extends Geometry3D {
    private double radius;
    
    /**
     * Constructs a sphere with the specified radius.
     * @param radius The radius of the sphere.
     */

    public Sphere(double radius) {
        this.radius = radius;
    }
    
    
    /**
     * Calculates the volume of the sphere.
     * @return The volume of the sphere.
     */

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the surface area of the sphere.
     * @return The surface area of the sphere.
     */

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    

    /**
     * Provides a string representation of the sphere.
     * @return A string describing the sphere.
     */

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }
}

