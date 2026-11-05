class Vehicle {
    void showVehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void showCar() {
        System.out.println("This is a Car");
    }
}

class Person {
    void showPerson() {
        System.out.println("This is a Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("This is an Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("This is a Manager");
    }
}

class Shape {
    void showShape() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void showCircle() {
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape {
    void showRectangle() {
        System.out.println("This is a Rectangle");
    }
}

public class Practical2 {
    public static void main(String[] args) {

        Car c = new Car();
        c.showVehicle();
        c.showCar();

        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        Circle ci = new Circle();
        ci.showShape();
        ci.showCircle();

        Rectangle r = new Rectangle();
        r.showShape();
        r.showRectangle();
    }
}


