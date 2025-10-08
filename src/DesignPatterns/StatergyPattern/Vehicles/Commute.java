package DesignPatterns.StatergyPattern.Vehicles;

import DesignPatterns.StatergyPattern.Vehicles.Vehicle.RacingCar;
import DesignPatterns.StatergyPattern.Vehicles.Vehicle.TransportBus;

public class Commute {

    public static void main(String[] args) {
        RacingCar car = new RacingCar();
        car.drive();
        TransportBus bus = new TransportBus();
        bus.drive();
    }
}
