package oop.encapsulation.car;

public class CarsApp {
    public static void main(String arg[]) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("Red", (byte)3, (short)392, (short)492, (short)6700, 30000, 10000, false);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(35000);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.startEngine();
        System.out.println("The car has "+redDodgeChallenger.getMileage() + "miles");
        redDodgeChallenger.setMileage(100);
        System.out.println("After driving the car, it has " + redDodgeChallenger.getMileage() + "miles");

        System.out.println("---------------------------------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("Black", (byte)1, (short)392, (short)492, (short)6700, 30000, 10000, false);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $" + blackToyotaSupra.getPrice());
        redDodgeChallenger.setPrice(32000);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $" + blackToyotaSupra.getPrice());
        redDodgeChallenger.startEngine();
        System.out.println("The car has "+blackToyotaSupra.getMileage() + "miles");
        redDodgeChallenger.setMileage(200);
        System.out.println("After driving the car, it has " + blackToyotaSupra.getMileage() + "miles");

    } 
}