import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialUtilsTest {

    @Test
    void factorial() {
        assertEquals(120, FactorialUtils.factorial(5));
        assertEquals(1, FactorialUtils.factorial(0));
    }
}


