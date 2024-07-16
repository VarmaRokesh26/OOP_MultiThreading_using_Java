package oops.encapsulation.athlete;

import java.util.Random;

/*
    Here BasketBallPLayer.java inherits the properties and behavior of AthleteApp.java
 */
public class BasketBallPlayer extends Athlete {

    private double freeThrowPercentage;
    private double pointsPerGame;

    public BasketBallPlayer(String name, String nickName, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {

        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void freeThrow() {
        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage) {
            System.out.println(super.getName() + " failed to score free throw");
        } else {
            System.out.println(super.getName() + " scored free throw");
        }
    }

    /*  
        getBio() method is also written in the Athlete.java which only has the Basic info
        not about the Game info
    */
    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free Throw Percentage : " + freeThrowPercentage);
        System.out.println("Points Scored Per Game : " + pointsPerGame);
    }

    @Override
    public void playGame() {
        super.playGame();
        freeThrow();
    }

    public double getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    
}
