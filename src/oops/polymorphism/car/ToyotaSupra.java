package oops.polymorphism.car;

public class ToyotaSupra extends Car {

    public ToyotaSupra(String color, byte numberOfVehicleOwners, short power, short horsePower,
            short cubicCapacity, int price, int mileage, boolean isDamaged) {
        super("ToyotaSupra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startEngine() {
        // super.startEngine();
        System.out.println("A ToyotaSupra's Engine is Started running");
    }
    
}
