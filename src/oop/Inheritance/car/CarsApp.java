package oop.inheritance.car;

public class CarsApp {
    public static void main(String arg[]) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("Red", (byte)3, (short)392, (short)492, (short)6700, 30000, 10000, false);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startEngine();

        System.out.println("---------------------------------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("Black", (byte)1, (short)392, (short)492, (short)6700, 30000, 10000, false);
        blackToyotaSupra.getDescription();
        blackToyotaSupra.startEngine();
    } 
}