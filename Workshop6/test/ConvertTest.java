import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @Test
    void cf() {
        Convert c = new Convert();
        assertEquals(32, c.cf(0));
    }
}


