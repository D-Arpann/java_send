import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {

    @Test
    void isProductAvailable() {
        InventoryManagement im = new InventoryManagement();
        assertTrue(im.isProductAvailable("Apple", 50));
        assertFalse(im.isProductAvailable("Banana", 200));
    }
}



