import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void sendEmail() {
        NotificationService ns = new NotificationService();
        assertTrue(ns.sendEmail("test@email.com", "Hello"));
        assertFalse(ns.sendEmail("invalid","Hello"));
    }
}



