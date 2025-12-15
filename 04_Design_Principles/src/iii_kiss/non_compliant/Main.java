package iii_kiss.non_compliant;

class Item {
    int id;
    double price;
    int quantity;
}

class OrderProcessor {
    public static double processOrder(Item[] order, double taxRate) {
        double total = 0;
        for(Item item : order) {
            total += item.price * item.quantity;
        }
        total += total * taxRate;
        return total;
    }

}

public class Main {

}
