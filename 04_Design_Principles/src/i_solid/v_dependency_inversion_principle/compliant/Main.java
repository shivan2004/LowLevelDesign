package i_solid.v_dependency_inversion_principle.compliant;

class Order {

}

interface NotificationService {
    void sendNotification(String msg);
}

class EmailNotifier implements NotificationService {

    @Override
    public void sendNotification(String msg) {
        //email specific implementations
    }
}
class SMSNotifier implements NotificationService {

    @Override
    public void sendNotification(String msg) {
        //sms specific implementations
    }
}
class PushNotifier implements NotificationService {

    @Override
    public void sendNotification(String msg) {
        //push notification specific implementations
    }
}

interface LoggingService {
    void logMessage(String message);
    void logError(String error);
}

class DatabaseLogger implements LoggingService {
    @Override
    public void logMessage(String message) {

    }

    @Override
    public void logError(String error) {

    }
}

interface InventoryService {
    void updateStock(Order order);
}

class WarehouseInventoryService implements InventoryService{
    @Override
    public void updateStock(Order order) {

    }
}
class OrderService {

    private final NotificationService notificationService;
    private final LoggingService loggingService;
    private final InventoryService inventoryService;

    public OrderService(
            NotificationService notificationService,
            LoggingService loggingService,
            InventoryService inventoryService
    ) {
        this.notificationService = notificationService;
        this.loggingService = loggingService;
        this.inventoryService = inventoryService;
    }

    public void placeOrder (Order order) {
        try {
            // if inventory.checkAvailability()
                //inventory.updateStock()
                //notificationService.sendNotification("Order placed Successfully");
                //log success
            // else
                //log error
        } catch (Exception e) {
            //log exception caught
        }
    }
}



public class Main {
    public static void main(String[] args) {
        NotificationService emailNotifier = new EmailNotifier();
        NotificationService smsNotifier = new SMSNotifier();
        NotificationService pushNotifier = new PushNotifier();

        LoggingService logger = new DatabaseLogger();

        InventoryService inventory = new WarehouseInventoryService();

        //email notifier order service
        OrderService orderService = new OrderService(emailNotifier, logger, inventory);
    }
}
