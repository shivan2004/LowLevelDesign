package i_solid.iii_liskov_s_substitution_principle.compliant;

abstract class Vehicle {
    public void move() {
        //logic to move
    }
}

abstract class EngineVehicle extends Vehicle {
    public void startEngine() {
        //logic for starting engine
    }
}

abstract class NonEngineVehicle extends Vehicle {
    //no engine related methods
}

//------------------------------------------------------------------------------------------------

class Car extends EngineVehicle {
    @Override
    public void startEngine() {
        //car specific logic for starting engine
    }

    @Override
    public void move() {
        //car specific logic for moving
    }
}


class Bicycle extends NonEngineVehicle {
    //no engine related methods required
    @Override
    public void move() {
        //bicycle specific logic
    }
}

public class Main {
    public static void main(String[] args) {
        EngineVehicle car = new Car();
        car.startEngine();
        car.move();

        NonEngineVehicle bicycle = new Bicycle();
        bicycle.move();

    }

}
