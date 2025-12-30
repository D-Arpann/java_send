import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculator10Test {

    private Calculator10 calculator;

    @BeforeAll
    static void setUpGlobal() {
        System.out.println("Global Setup: Starting Calculator Tests...");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator10();
    }

    @Test
    void Add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void Subtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void Multiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void Divide() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Completed.");
    }

    @AfterAll
    static void cleanUpGlobal() {
        System.out.println("Global Cleanup: All tests finished.");
    }
}


