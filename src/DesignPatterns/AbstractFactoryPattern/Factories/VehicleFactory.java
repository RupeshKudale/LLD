package DesignPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle getCar(String carName);
}
