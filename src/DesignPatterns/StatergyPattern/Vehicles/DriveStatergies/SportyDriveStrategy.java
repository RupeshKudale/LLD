package DesignPatterns.StatergyPattern.Vehicles.DriveStatergies;

public class SportyDriveStrategy implements DriveStratergy{
    @Override
    public void drive() {
        System.out.println("Sporty drive strategy");
    }
}
