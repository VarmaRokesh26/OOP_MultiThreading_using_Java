package oop.Inheritance.athlete;

public class Athlete {

    private String name;
    private String nickName;
    private int yearOfBorn;
    private String team;
    private int gamesPlayed;

    public Athlete(String name, String nickName, int yearOfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio() {
        System.out.println("Name : " + name + "(" + nickName + ")");
        System.out.println("Born in the year : " + yearOfBorn);
        System.out.println("Last Team Played : " + team + "and played " + gamesPlayed + "games");
    }
}
