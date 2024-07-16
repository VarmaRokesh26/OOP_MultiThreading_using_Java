package oops.theGreatRoberyGame;

import java.util.Random;

public class Police {
    private Detective kevinPaul;

    Police() {
        Items[] kevinItems = new Items[2];
        kevinItems[0] = new Items("Revolver", 500.0);
        kevinItems[1] = new Items("Magnifying glass", 10.0);
        kevinPaul = new Detective("Kevin Paul", "Coyote", 1970, "Chess", kevinItems);
    }

    private boolean areCriminalsCaught() {
        Random randomNumberGenerator = new Random();
        if(randomNumberGenerator.nextInt(101) >= Detective.SUCCESS_PERCENTAGE) 
            return false;
        return true;
    }

    public boolean catchCriminals(Gang gang) {
        if(areCriminalsCaught()) {
            System.out.println(kevinPaul.getName() + " managed to catch the gang");
            if(gang.getSumRobbedValue() > 0) {
                System.out.println("THe stolen items are recovered");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            } else {
                System.out.println("The gang couldn't steal anything");
            }
            return true;
        } else {
            System.out.println(kevinPaul.getName() + " couldn't catch the criminal");
            System.out.println("THey managed to steal items valued $" + gang.getSumRobbedValue());
            return false;
        }
    }
}
