class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double applyDiscount() {
        System.out.println("No specific discount.");
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + applyDiscount());
        System.out.println("-----------------------------");
    }
}
class ElectronicProduct extends Product {

    public ElectronicProduct(String name, double price) {
        super(name, price);
    }
    @Override
    public double applyDiscount() {
        return price * 0.90;
    }
}
class ClothingProduct extends Product {

    public ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        return price * 0.80;
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product laptop = new ElectronicProduct("Gaming Laptop", 1200.00);
        Product tshirt = new ClothingProduct("Cotton T-Shirt", 800.00);

        laptop.displayInfo();
        tshirt.displayInfo();

        System.out.println("Changing price directly...");
        laptop.price = 1500.00;
        laptop.displayInfo();

    }
}
