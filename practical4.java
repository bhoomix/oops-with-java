class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child class method");
    }
}

public class Practical4 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " + c.add(10, 20));
        System.out.println("Sum of three numbers: " + c.add(10, 20, 30));
        System.out.println("Sum of decimal numbers: " + c.add(2.5, 3.5));

        Parent obj = new Child();
        obj.display();
    }
}
