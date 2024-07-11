package oop.theGreatRoberyGame;

import java.util.Random;

public class Gang {

    private Criminal[] criminals = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    public Gang() {
        Items[] robItems = new Items[2];
        robItems[0] = new Items("blunt Swiss knife", 15.0);
        robItems[1] = new Items("half Rotten Apple", 0.0);

        Criminal rob = new Criminal("Rob", "The Head", 1976, "Breaking In", robItems);
        criminals[0] = rob;

        Items[] bobbyItems = new Items[2];
        bobbyItems[0] = new Items("Baseball bat", 20.0);
        bobbyItems[1] = new Items("Toothpick", 0.5);

        Criminal bobby = new Criminal("Bobby", "The Mountain", 1978, "Knocking Out", bobbyItems);
        criminals[1] = bobby;
    }

    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void printGangInfo() {
        for(Criminal criminal :criminals) {
            System.out.println("--------------------------------");
            criminal.printBioData();
        }
    }
    
    
}
