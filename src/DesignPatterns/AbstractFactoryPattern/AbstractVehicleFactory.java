package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.Factories.LuxuryVehicles;
import DesignPatterns.AbstractFactoryPattern.Factories.RegularVehicles;
import DesignPatterns.AbstractFactoryPattern.Factories.VehicleFactory;

public class AbstractVehicleFactory {

    public VehicleFactory getFactory(String type) {
        return switch (type) {
            case "Luxury" -> new LuxuryVehicles();
            case "Regular" -> new RegularVehicles();
            default -> null;
        };
    }
}
