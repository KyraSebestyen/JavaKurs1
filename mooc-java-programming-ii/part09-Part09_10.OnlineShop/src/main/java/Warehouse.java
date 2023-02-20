import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products = new HashMap<>();
    private Map<String, Integer> inStock = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
            products.put(product, price);
            inStock.put(product, stock);
    }

    public int price(String product) {
        return products.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return inStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (inStock.containsKey(product) && inStock.get(product) > 0) {
            int currentAmount = inStock.get(product);
            inStock.put(product, currentAmount - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return products.keySet();
    }
}
