package oop.theGreatRoberyGame;

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
}
