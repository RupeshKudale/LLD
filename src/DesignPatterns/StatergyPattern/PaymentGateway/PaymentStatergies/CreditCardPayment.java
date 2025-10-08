package DesignPatterns.StatergyPattern.PaymentGateway.PaymentStatergies;

public class CreditCardPayment implements PaymentStratergy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid with credit card");
    }
}
