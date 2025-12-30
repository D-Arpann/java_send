import java.util.Map;

public class InventoryManagement {
    Map <String, Integer> products = Map.of(
        "Apple", 50,
        "Banana", 30,
        "Orange", 20
    );
    public boolean isProductAvailable(String productName, int quantity) {
        return products.containsKey(productName) && products.get(productName) >= quantity;
    }
}



