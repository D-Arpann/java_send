import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testShapes() {
        Shape circle = new Circle(2.0);
        assertEquals(Math.PI * 4, circle.area(), 0.001);

        Shape rect = new RectangleShape(4.0, 5.0);
        assertEquals(20.0, rect.area(), 0.001);

        Shape base = new Shape();
        assertEquals(0.0, base.area());
    }
}


