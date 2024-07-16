package oops.abstraction.car;

public class DodgeChallenger extends Car implements ElectricMode {

    public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
            int price, int mileage, boolean isDamaged) {
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startEngine() {
        // super.startEngine();
        System.out.println("A Dodge Challenger's Engine is Started running");
    }

    @Override
    public void startElectricEngine() {
        System.out.println("Dodge Challenger's electric engine is started");
    }
}