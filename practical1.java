// Practical 1: Classes and Objects

class Student {

    int rollNumber;
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(int roll, String n, int m1, int m2, int m3) {
        rollNumber = roll;
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Method to calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);

        System.out.println("Total Marks: " + calculateTotal());

        System.out.println("Percentage: " + calculatePercentage() + "%");

        System.out.println("-------------------------");
    }
}

public class Practical1 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Bhoomi", 85, 90, 88);

        Student s2 = new Student(102, "Riya", 80, 75, 85);

        Student s3 = new Student(103, "Aman", 90, 88, 92);

        System.out.println("STUDENT DETAILS");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
