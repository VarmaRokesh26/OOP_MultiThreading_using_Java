package generics1;

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

        OrderedPair<Integer, String> kobe = new OrderedPair<>(24, "Kobe Bryant");
        Util.displayToString(kobe);

        ArrayList<OrderedPair<String, String>> listOfCountries = new ArrayList<>();
        OrderedPair<String, String> india = new OrderedPair<>("IND", "India");
        OrderedPair<String, String> malta = new OrderedPair<>("MLT", "Malta");
        OrderedPair<String, String> germany = new OrderedPair<>("GER", "Germany");

        listOfCountries.add(india);
        listOfCountries.add(malta);
        listOfCountries.add(germany);

        Util.displayToString(listOfCountries);
    }
}
