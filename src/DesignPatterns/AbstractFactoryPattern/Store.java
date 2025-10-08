package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.Factories.VehicleFactory;
import DesignPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public class Store {
    public static void main(String[] args) {
        AbstractVehicleFactory factory = new AbstractVehicleFactory();
        VehicleFactory factory1 = factory.getFactory("Luxury");
        Vehicle car = factory1.getCar("BMW");
        car.drive();
    }
}
