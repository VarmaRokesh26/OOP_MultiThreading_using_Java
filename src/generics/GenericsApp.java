package generics;

import java.util.*;
public class GenericsApp {
    public static void main(String arg[]) {
        
        Box<Integer> myFavoriteNumber =  new Box<>();
        myFavoriteNumber.setTypeData(15);
        Util.displayToString(myFavoriteNumber);
        
        Box<String> myFavoriteAcotr = new Box<>();
        myFavoriteAcotr.setTypeData("Robert Downey Junior");
        Util.displayToString(myFavoriteAcotr);

        ArrayList<Box<String>> pileOfBoxes = new ArrayList<>();
        pileOfBoxes.add(myFavoriteAcotr);
        pileOfBoxes.add(myFavoriteAcotr);
        Util.displayToString(pileOfBoxes);

    }
}
