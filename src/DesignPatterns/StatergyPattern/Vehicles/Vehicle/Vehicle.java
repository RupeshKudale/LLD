package DesignPatterns.StatergyPattern.Vehicles.Vehicle;

import DesignPatterns.StatergyPattern.Vehicles.DriveStatergies.DriveStratergy;

public class Vehicle {

    private DriveStratergy driveStratergy;

    public Vehicle(DriveStratergy driveStratergy) {
        this.driveStratergy = driveStratergy;
    }

    public void drive() {
        this.driveStratergy.drive();
    }

}
