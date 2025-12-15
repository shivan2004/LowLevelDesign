package i_solid.iv_interface_segregation_principle.compliant;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}

class BasicPrinter implements Printer {
    @Override
    public void print() {
        //printing functionality
    }
}

class AllInOnePrinter implements Printer, Scanner, FaxMachine {
    @Override
    public void fax() {
        //fax functionality
    }

    @Override
    public void print() {
        //print functionality
    }

    @Override
    public void scan() {
        //scan functionality
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
