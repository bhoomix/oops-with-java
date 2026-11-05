class Product {

    String name;
    double price;
    int quantity;

    // No Argument Constructor
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // One Parameter Constructor
    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

    // Two Parameter Constructor
    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 1;
    }

    // Three Parameter Constructor
    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println();
    }
}

public class Practical8 {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Book", 50);
        Product p4 = new Product("Bag", 800, 2);

        System.out.println("No Argument Constructor:");
        p1.display();

        System.out.println("One Parameter Constructor:");
        p2.display();

        System.out.println("Two Parameter Constructor:");
        p3.display();

        System.out.println("Three Parameter Constructor:");
        p4.display();
    }
}
