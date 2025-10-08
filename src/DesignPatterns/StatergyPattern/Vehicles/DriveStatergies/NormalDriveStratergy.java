package DesignPatterns.StatergyPattern.Vehicles.DriveStatergies;

public class NormalDriveStratergy implements DriveStratergy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
