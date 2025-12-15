package i_solid.iv_interface_segregation_principle.non_compliant;

interface Machine {
    void print();
    void scan();
    void fax();
}

class AllInOnePrinter implements Machine {
    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }

    @Override
    public void fax() {

    }
}

class BasicPrinter implements Machine {
    @Override
    public void print() {

    }


    //basic printer does not have these functions
    //these exceptions should be handled for every call
    @Override
    public void scan() {
        throw new UnsupportedOperationException("Cannot scan");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Cannot Fax");
    }
}

public class Main {
}
