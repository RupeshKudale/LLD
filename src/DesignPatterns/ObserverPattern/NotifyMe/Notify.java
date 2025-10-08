package DesignPatterns.ObserverPattern.NotifyMe;

import DesignPatterns.ObserverPattern.NotifyMe.Observable.PhoneObservable;
import DesignPatterns.ObserverPattern.NotifyMe.Observer.EmailNotifier;
import DesignPatterns.ObserverPattern.NotifyMe.Observer.MobilePhoneNotifier;

public class Notify {

    public static void main(String[] args) {
        PhoneObservable iphone = new PhoneObservable();
        EmailNotifier user1 = new EmailNotifier(iphone, "xys@gmail.com");
        MobilePhoneNotifier user2 = new MobilePhoneNotifier(iphone, "9099909999");

        iphone.register(user1);
        iphone.register(user2);

        iphone.setNewStock(10);
        iphone.setNewStock(-10);
        iphone.setNewStock(22);

    }
}
