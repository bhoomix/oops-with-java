class Student {
  int rollNo;
  String name;
  int m1, m2, m3;

Student(int r, String n, int a, int b, int c) {
  rollNo = r;
  name = n;
  m1 = a;
  m2 = b;
  m3 = c;
}
  int total() {
    return m1 + m2 + m3;
  }
  double percentage() {
    return total() / 3.0;
  }
  void display() {
    System.out.println("Roll No: " + rollNo);
    System.out.println("Name: " + name);
    System.out.println("Total: " + total());
    System.out.println("Percentage: " + percentage());
  }
public static void main(String[] args) {
  Student s1 = new Student(1, "Aman", 80, 85, 90);
  Student s2 = new Student(2, "Priya", 78, 89,82);
  Student s3 = new Student(3, "Shalini", 80, 58, 67);
  s1.display();
  s2.display();
  s3.display();
}
}
