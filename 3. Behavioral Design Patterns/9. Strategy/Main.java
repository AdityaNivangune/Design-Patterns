public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkOut(5000);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("aditya@gmail.com"));
        cart.checkOut(3000);
    }
}
