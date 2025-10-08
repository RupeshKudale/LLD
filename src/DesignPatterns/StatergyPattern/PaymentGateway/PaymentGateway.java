package DesignPatterns.StatergyPattern.PaymentGateway;

import DesignPatterns.StatergyPattern.PaymentGateway.PaymentStatergies.CreditCardPayment;

public class PaymentGateway {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStratergy(new CreditCardPayment());
        cart.checkout(2000);
    }
}
