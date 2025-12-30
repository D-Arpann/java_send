import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductPropertiesAndAffordability() {
        Product product = new Product("Laptop", 1200.00,  10);

        assertAll(
                () -> assertNotNull(product.name,"Product name should not be null"),
                () -> assertTrue(product.price > 0, "Product price should be greater than zero"),
                () -> assertTrue(product.isAffordable(1500.00), "Product should be affordable within budget"),
                () -> assertFalse(product.isAffordable(1000.00), "Product should not be affordable below price")
        );
    }
}



