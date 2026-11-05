interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

class Machine {
    void start() {
        System.out.println("Machine started");
    }
}

class SmartPrinter extends Machine implements Printable, Scannable {

    public void print() {
        System.out.println("Smart Printer is printing");
    }

    public void scan() {
        System.out.println("Smart Printer is scanning");
    }
}

public class Practical3 {
    public static void main(String[] args) {

        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        SmartPrinter s = new SmartPrinter();
        s.start();
        s.print();
        s.scan();
    }
}
