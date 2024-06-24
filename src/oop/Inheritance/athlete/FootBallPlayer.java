package oop.Inheritance.athlete;

public class FootBallPlayer extends Athlete{

    private int completions;
    private int passingYards;
    public FootBallPlayer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed, int completions, int passingYards) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions : " + completions);
        System.out.println("Passing Yards : " + passingYards);
    }
}
