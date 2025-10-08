package DesignPatterns.StatergyPattern.PaymentGateway.PaymentStatergies;

public class UpiPayment implements PaymentStratergy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid with UPI");
    }
}
