package iii_kiss.compliant;

class Item {
    double price;
    int quantity;

    public Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
}

class OrderProcessor {
    public static double calculateSubTotal(Item[] order) {
        double subTotal = 0;
        for(Item item : order) {
            subTotal += (item.price * item.quantity);
        }
        return subTotal;
    }

    public static double calculateTotal(double subTotal, double taxRate) {
        return subTotal + (subTotal * taxRate);
    }
}

public class Main {

    public static void main(String[] args) {
        Item[] order = {
                new Item(100, 3),
                new Item(50, 3)
        };
        double taxRate = 0.1;
        double subTotal = OrderProcessor.calculateSubTotal(order);
        double total = OrderProcessor.calculateTotal(subTotal, taxRate);
        System.out.println("Total : " + total);
    }

}
