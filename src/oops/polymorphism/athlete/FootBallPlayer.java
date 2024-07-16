package oops.polymorphism.athlete;

/*
    Here BasketBallPLayer.java inherits the properties and behavior of Athlete.java
 */
public class FootBallPlayer extends Athlete{

    private int completions;
    private int passingYards;
    public FootBallPlayer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed, int completions, int passingYards) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    /*  
        getBio() method is also written in the Athlete.java which only has the Basic info
        not about the Game info
    */
    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions : " + completions);
        System.out.println("Passing Yards : " + passingYards);
    }

    public void increaseCompletions(int completions) {
        this.completions += completions;
    }

    public void increasePassingYards(int passingYards) {
        this.passingYards += passingYards;
    }

    @Override
    public String getBodyType() {
        return "Big muscle and great endurance.";
    }
}
