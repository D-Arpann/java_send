import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testRectangle() {
        Rectangle rect = new Rectangle(5.0, 3.0);
        assertEquals(15.0, rect.area());
        assertEquals(16.0, rect.perimeter());
    }
}