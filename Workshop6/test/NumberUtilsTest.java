import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void getEvenNumbers() {
        NumberUtils nu = new NumberUtils();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, nu.getEvenNumbers(input));
    }
}



