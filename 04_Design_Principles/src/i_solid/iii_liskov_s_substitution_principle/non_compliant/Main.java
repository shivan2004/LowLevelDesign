package i_solid.iii_liskov_s_substitution_principle.non_compliant;

class Vehicle {
    public void startEngine() {
        //start engine logic
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        //car-specific engine start logic
    }
}

class Bicycle extends Vehicle {
    @Override
    public void startEngine() {
        //bicycles do not have engines, throw exception
        throw new UnsupportedOperationException("Bicycles do not have engines");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        System.out.println("Car : ");
        car.startEngine();

        System.out.println("\nBicycle");
        try {
            bicycle.startEngine();
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
