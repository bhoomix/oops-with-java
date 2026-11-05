class Employee {

    String name;
    int id;

    static int count = 0;

    // Default Constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized Constructor
    Employee(String name, int id) {

        this.name = name;
        this.id = id;

        count++;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Practical9 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Aman", 101);
        Employee e3 = new Employee("Riya", 102);

        e1.display();

        e2.display();

        e3.display();

        Employee.displayCount();
    }
}
