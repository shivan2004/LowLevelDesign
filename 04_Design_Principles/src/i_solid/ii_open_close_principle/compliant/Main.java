package i_solid.ii_open_close_principle.compliant;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    double calculateArea() {
        return length * width;
    }
}

//adding triangle does not require any changes, it only requires to extend and implement
class Triangle extends Shape {
    private double height;
    private double base;

    @Override
    double calculateArea() {
        return 0.5 * height * base;
    }
}

public class Main {

}
