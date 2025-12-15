package iv_yagni;

class PaymentProcessor {
    private String paymentMethod;

    public PaymentProcessor(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //processes payments, but
    //includes logic for unsupported future payment methods
    public void processPayment(double amount) {
        if(paymentMethod.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing payment of $" + amount + " via Credit Card.");
        }
        else if(paymentMethod.equalsIgnoreCase("DebitCard")) {
            System.out.println("Processing payment of $" + amount + " via Debit Card.");
        }

        //not required
        else if(paymentMethod.equalsIgnoreCase("PayPal")) {
            System.out.println("Processing payment of $" + amount + " via PayPal.");
        }
        else if(paymentMethod.equalsIgnoreCase("CryptoCurrency")) {
            System.out.println("Processing payment of $" + amount + " via Crypto Currency.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor("CreditCard");
        processor.processPayment(100); // correct output

        PaymentProcessor invalidProcessor = new PaymentProcessor("PayPal");
        invalidProcessor.processPayment(50); // not required
    }
}
