import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void isPrime() {
        assertTrue(MathUtils.isPrime(7));
        assertFalse(MathUtils.isPrime(4));
        assertFalse(MathUtils.isPrime(1));
    }
}


