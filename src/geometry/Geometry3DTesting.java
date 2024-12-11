package geometry;

//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class Geometry3DTesting {

    @Test
    public void testSphere() {
        Sphere sphere = new Sphere(3);
        assert((4.0 / 3) * Math.PI * Math.pow(3, 3) - sphere.volume() <= 0.001 && (4.0 / 3) * Math.PI * Math.pow(3, 3) - sphere.volume() >= -0.001) : "Sphere volume should be approximately 113.1";
        assert(4 * Math.PI * Math.pow(3, 2) - sphere.surfaceArea() <= 0.001 && 4 * Math.PI * Math.pow(3, 2) - sphere.surfaceArea() >= -0.001) : "Sphere surface area should be approximately 113.1";
    }

    @Test
    public void testTriangularPrism() {
        TriangularPrism prism = new TriangularPrism(4, 3, 5);
        assert(prism.volume() == 30) : "Triangular Prism volume should be 30";
        assert(Math.abs(4 * 5 + 2 * (Math.sqrt(4 * 4 + 3 * 3) * 5) + 4 * 3 - prism.surfaceArea()) <= 0.001) : "Triangular Prism surface area should match calculation";
    }
}
