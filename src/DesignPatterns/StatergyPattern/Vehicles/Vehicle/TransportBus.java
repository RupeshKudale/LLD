package DesignPatterns.StatergyPattern.Vehicles.Vehicle;

import DesignPatterns.StatergyPattern.Vehicles.DriveStatergies.NormalDriveStratergy;

public class TransportBus extends Vehicle{

    public TransportBus() {
        super(new NormalDriveStratergy());
    }
}
