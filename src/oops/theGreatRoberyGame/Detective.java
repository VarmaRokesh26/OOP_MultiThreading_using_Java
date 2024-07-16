package oops.theGreatRoberyGame;

public class Detective extends Person{

    public static final int SUCCESS_PERCENTAGE = 20;

    public Detective(String name, String nickName, int yearOfBorn, String expertIn, Items[] items) {
        super(name, nickName, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Detective");
        super.printBioData();
    }
}
