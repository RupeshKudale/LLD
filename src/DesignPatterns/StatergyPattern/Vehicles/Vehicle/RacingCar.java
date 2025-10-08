package DesignPatterns.StatergyPattern.Vehicles.Vehicle;

import DesignPatterns.StatergyPattern.Vehicles.DriveStatergies.SportyDriveStrategy;

public class RacingCar extends Vehicle{

    public RacingCar() {
        super(new SportyDriveStrategy());
    }
}
