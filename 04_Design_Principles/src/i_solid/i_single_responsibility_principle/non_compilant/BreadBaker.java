package i_solid.i_single_responsibility_principle.non_compilant;


//bad code
public class BreadBaker {
    public void bakeBread(){
        System.out.println("Baking Bread");
    }


    //changing this leads to modification in entire class
    public void manageInventory() {
//        System.out.println("Managing Inventory");
        System.out.println("Managing Inventory and remove few items");
    }

    public void orderSupplies() {
        System.out.println("Ordering supplies");
    }

    public void serveCustomer() {
        System.out.println("Serving Customer");
    }

    public void cleanBakery() {
        System.out.println("Cleaning Bakery");
    }


    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        baker.bakeBread();
        baker.manageInventory();
        baker.orderSupplies();
        baker.serveCustomer();
        baker.cleanBakery();
    }

}
