package oop.theGreatRoberyGame;

public abstract class Person {

    private String name;
    private String nickName;
    private int yearOfBorn;
    private String expertIn;
    private Items[] items;

    public Person(String name, String nickName, int yearOfBorn, String expertIn, Items[] items) {
        this.name =name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertIn  = expertIn;
        this.items = items;
    }

    public void printBioData() {
        System.out.println("Name : " + name + " (" + nickName + ")");
        System.out.println("Year of born : " + yearOfBorn);
        System.out.println("Expert in : " + expertIn);
        System.out.println("The person has the following items: ");
        for(Items item : items) {
            System.out.println("-" + item.getName());
        }
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}
