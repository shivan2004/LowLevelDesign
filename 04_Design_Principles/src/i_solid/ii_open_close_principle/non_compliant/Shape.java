package i_solid.ii_open_close_principle.non_compliant;

public class Shape {
    private String type;

    public double calculateArea() {
        if(type.equals("circle")) {

        }
        else if(type.equals("rectangle")) {

        }
        //adding triangle requires modifying existing code
        return -1;
    }
}
