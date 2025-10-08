package DesignPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.AbstractFactoryPattern.Vehicles.Bmw;
import DesignPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public class LuxuryVehicles implements VehicleFactory {

    public Vehicle getCar(String carName) {
        return switch (carName) {
            case "BMW" -> new Bmw();
            default -> null;
        };
    }
}
