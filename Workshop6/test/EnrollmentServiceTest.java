import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnrollmentServiceTest {

    @Test
    void enrollStudent() {
        EnrollmentService enrollmentService = new EnrollmentService();

        // Test enrolling a new student
        boolean result1 = enrollmentService.enrollStudent("john_doe", "Math101");
        assertTrue(result1, "Expected enrollment to succeed for a new student.");

        // Test enrolling the same student again
        boolean result2 = enrollmentService.enrollStudent("john_doe", "Math101");
        assertFalse(result2, "Expected enrollment to fail for an already enrolled student.");
    }
}


