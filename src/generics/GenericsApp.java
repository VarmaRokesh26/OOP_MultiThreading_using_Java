package generics;

public class GenericsApp {
    public static void main(String arg[]) {
        
        Box<Integer> myFavoriteNumber =  new Box<>();
        myFavoriteNumber.setTypeData(15);

        Box<String> myFavoriteAcotr = new Box<>();
        myFavoriteAcotr.setTypeData("Robert Downey Junior");
    }
}
