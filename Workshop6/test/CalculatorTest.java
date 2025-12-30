import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2,3));
    }
}



