package DesignPatterns.ObserverPattern.NotifyMe.Observer;

import DesignPatterns.ObserverPattern.NotifyMe.Observable.ProductObservable;

public class EmailNotifier implements NotifierObservable {
    private final ProductObservable product;
    private final String email;

    public EmailNotifier(ProductObservable product, String email) {
        this.product = product;
        this.email = email;
    }
    @Override
    public void update() {
        SendMail();
    }

    private void SendMail() {
        System.out.println("Email sent on " + this.email);
    }
}
