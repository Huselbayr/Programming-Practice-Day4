public class Product {
    String name;
    double price;
    int quantity;
    String category;
    String barcode;  
    public Product(String name, double price, int quantity, String category, String barcode) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.barcode = barcode;  
    }

    public String toString() {
        return name + " (" + price + "₮) - Qty: " + quantity + " [" + category + "] - Barcode: " + barcode;
    }
}
