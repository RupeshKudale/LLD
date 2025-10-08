package DesignPatterns.ObserverPattern.NotifyMe.Observer;

import DesignPatterns.ObserverPattern.NotifyMe.Observable.ProductObservable;

public class MobilePhoneNotifier implements NotifierObservable {
    private final ProductObservable product;
    private final String phoneNo;

    public MobilePhoneNotifier(ProductObservable product, String phoneNo) {
        this.product = product;
        this.phoneNo = phoneNo;
    }
    @Override
    public void update() {
        SendMail();
    }

    private void SendMail() {
        System.out.println("Msg sent on " + this.phoneNo);
    }
}
