package geometry;

import org.junit.jupiter.api.Test;

public class Geometry2DTesting {

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(5, 3);
        assert(rectangle.area() == 15) : "Rectangle area should be 15";
        assert(rectangle.perimeter() == 16) : "Rectangle perimeter should be 16";
    }

    @Test
    public void testCircle() {
        Circle circle = new Circle(4);
        assert(Math.abs(Math.PI * 16 - circle.area()) <= 0.001) : "Circle area should be approximately 50.27";
        assert(Math.abs(2 * Math.PI * 4 - circle.perimeter()) <= 0.001) : "Circle perimeter should be approximately 25.13";
    }

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle(3, 4, 3, 4);
        assert(triangle.area() == 6) : "Triangle area should be 6";
        assert(triangle.perimeter() == 10) : "Triangle perimeter should be 10";
    }
}
