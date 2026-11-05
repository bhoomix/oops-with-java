class Demo {

    Demo() {
        System.out.println("Object Created");
    }

    void display() {
        System.out.println("Object is in use");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

public class Practical7 {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();

        obj = null;

        System.out.println("Object reference removed");

        System.gc();

        System.out.println("End of Program");
    }
}
