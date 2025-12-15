package i_solid.v_dependency_inversion_principle.non_compliant;

class Order {
    private int id;

    public int getId() {
        return id;
    }
}

class EmailNotifier {
    public void sendEmail(String message) {
        //configure SMTP
        //setup email templates
        //send email implementation
    }
}

class DatabaseLogger{
    void logTransaction(String str) {

    }
}
class InventorySystem{
    void updateStock(Order order) {

    }
}

class OrderService {
    private EmailNotifier emailNotifier;
    private DatabaseLogger logger;
    private InventorySystem inventorySystem;

    public OrderService() {

        //changing email notifier to sms notifier, requires to change entire class
        this.emailNotifier = new EmailNotifier();
        this.logger = new DatabaseLogger();
        this.inventorySystem = new InventorySystem();
    }

    public void placeOrder (Order order) {
        inventorySystem.updateStock(order);
        emailNotifier.sendEmail("Order #" + order.getId() + " placed Successfully");
        logger.logTransaction("Order placed : " + order.getId());
    }
}

public class Main {

}
