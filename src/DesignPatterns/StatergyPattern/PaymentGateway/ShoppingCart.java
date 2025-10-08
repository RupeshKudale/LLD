package DesignPatterns.StatergyPattern.PaymentGateway;

import DesignPatterns.StatergyPattern.PaymentGateway.PaymentStatergies.PaymentStratergy;

public class ShoppingCart {
    private PaymentStratergy paymentStratergy;

    public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    public void checkout(int amount) {
        this.paymentStratergy.pay(amount);
    }
}
