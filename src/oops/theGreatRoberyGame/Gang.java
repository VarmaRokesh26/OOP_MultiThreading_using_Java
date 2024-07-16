package oops.theGreatRoberyGame;

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
    
    private boolean isSuccessfulRobbery() {
        int randomNumber = randomNumberGenerator.nextInt(101);
        int summarizedSuccessChange = criminals.length * Criminal.SUCCESS_PERCENTAGE;
        if(randomNumber >= summarizedSuccessChange) 
            return false;
        return true;
    }
    
    public void letsRob(Building[] buildings) {
        int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length);
        System.out.println("--------------------------------");
        if(isSuccessfulRobbery()) {
            System.out.println("The gang managed o rob the following otems from the " + buildings[randomBuildingIndex].getName() + ": ");
            for(Items item : buildings[randomBuildingIndex].getItem()) {
                sumRobbedValue += item.getValue();
                System.out.println("-" + item.getName());
            }
        } else {
            System.out.println("The gang tired to rob the " + buildings[randomBuildingIndex].getName() + " but the failed");
        }
    }
}
