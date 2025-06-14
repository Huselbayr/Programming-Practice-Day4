import java.util.ArrayList;
import java.util.List;

public class Location {
    String name;
    List<Product> products;

    public Location(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}