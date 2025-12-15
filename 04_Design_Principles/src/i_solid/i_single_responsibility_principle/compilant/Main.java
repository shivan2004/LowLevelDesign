package i_solid.i_single_responsibility_principle.compilant;

class BreadBaker {
    public void breadBaker() {
        System.out.println("Baking bread");
    }
}


//modifying here, leads to modification in this class only
class InventoryManager {
    public void manageInventory() {
//        System.out.println("Managing Inventory");
        System.out.println("Managing Inventory and removing few items");
    }
}

class SupplyOrder {
    public void orderSupplies() {
        System.out.println("Ordering Supplies");
    }
}

class CustomerService {
    public void serveCustomers() {
        System.out.println("Serving Customers");
    }
}

class BakeryCleaner {
    public void cleanBakery() {
        System.out.println("Cleaning Bakery");
    }
}

public class Main {

    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        CustomerService customerService = new CustomerService();
        BakeryCleaner bakeryCleaner = new BakeryCleaner();


        baker.breadBaker();
        inventoryManager.manageInventory();
        supplyOrder.orderSupplies();
        customerService.serveCustomers();
        bakeryCleaner.cleanBakery();


    }
}
