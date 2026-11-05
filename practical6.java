class Book {

    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Practical6 {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("\nParameterized Constructor:");
        b2.display();

        System.out.println("\nCopy Constructor:");
        b3.display();

        b2.title = "Advanced Java";

        System.out.println("\nAfter Modifying Original Object:");
        b2.display();

        System.out.println("\nCopied Object:");
        b3.display();
    }
}
