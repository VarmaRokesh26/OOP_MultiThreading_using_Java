package hangMan;

import java.io.FileNotFoundException;

public class HangManApp {

    public static void main(String[] args) throws FileNotFoundException{
        GameServices gameServices = new GameServices();
        gameServices.start();
    }
}
