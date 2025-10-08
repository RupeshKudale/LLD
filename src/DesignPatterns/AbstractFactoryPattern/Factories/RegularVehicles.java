package DesignPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.AbstractFactoryPattern.Vehicles.Swift;
import DesignPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public class RegularVehicles implements VehicleFactory {

    public Vehicle getCar(String carName) {
        return switch (carName) {
            case "Swift" -> new Swift();
            default -> null;
        };
    }

}
