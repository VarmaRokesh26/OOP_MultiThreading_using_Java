package oop.abstraction.athlete;

/*
    Athlete.java file is used to encapsulate the data members and methods which are required
 */
public class Athlete {

    // Data members for the thlete Class
    private String name;
    private String nickName;
    private int yearOfBorn;
    private String team;
    private int gamesPlayed;

    // Constructor - Parametrized Constructor
    public Athlete(String name, String nickName, int yearOfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    // Getters used for read only - for displaying the athlete name
    public String getName() {
        return name;
    }

    // getBio() method used to display the athlete's basic info
    public void getBio() {
        System.out.println("Name : " + name + "(" + nickName + ")");
        System.out.println("Born in the year : " + yearOfBorn);
        System.out.println("Last Team Played : " + team + " and played " + gamesPlayed + " games");
    }

    // method to increment games played by the player
    public void playGame() {
        System.out.println(name + " started playing a game");
        gamesPlayed++;
    }

    // Getters for Displaying the Team Name
    public String getTeam() {
        return team;
    }

    //The team is not permamant so a setters to update the Team name
    public void setTeam(String team) {
        this.team = team;
    }


}
