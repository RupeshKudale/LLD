package DesignPatterns.ObserverPattern.NotifyMe.Observable;

import DesignPatterns.ObserverPattern.NotifyMe.Observer.NotifierObservable;

public interface ProductObservable {
    void register(NotifierObservable userObservable);
    void unRegister(NotifierObservable userObservable);
    void notifyUsers();
    void setNewStock(int newStock);
    int getRemainingStock();
}
