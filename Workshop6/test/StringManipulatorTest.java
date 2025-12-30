import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void stringOperations() {
        StringManipulator sm = new StringManipulator();

        assertAll(
                () -> assertEquals("olleh", sm.reverse("hello")),
                () -> assertEquals("HELLO", sm.toUpperCase("hello")),
                () -> assertTrue(sm.isPalindrome("Racecar")),
                () -> assertEquals(5, sm.countVowels("hello"))
        );
    }
}



