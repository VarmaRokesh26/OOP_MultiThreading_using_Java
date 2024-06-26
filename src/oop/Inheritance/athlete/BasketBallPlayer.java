package oop.inheritance.athlete;

import java.util.Random;

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

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free Throw Percentage : " + freeThrowPercentage);
        System.out.println("Points Scored Per Game : " + pointsPerGame);
    }
}
