package DesignPatterns.ObserverPattern.NotifyMe.Observable;

import DesignPatterns.ObserverPattern.NotifyMe.Observer.NotifierObservable;

import java.util.ArrayList;
import java.util.List;

public class PhoneObservable implements ProductObservable{
    private int currentStock = 0;
    private final List<NotifierObservable> observers = new ArrayList<>();
    @Override
    public void register(NotifierObservable userObservable) {
        observers.add(userObservable);
    }

    @Override
    public void unRegister(NotifierObservable userObservable) {
        observers.remove(userObservable);
    }

    @Override
    public void notifyUsers() {
        for (NotifierObservable user: observers) {
            user.update();
        }
    }

    @Override
    public void setNewStock(int newStock) {
        if(this.currentStock == 0)
            notifyUsers();
        this.currentStock = this.currentStock + newStock;
    }

    @Override
    public int getRemainingStock() {
        return this.currentStock;
    }
}
