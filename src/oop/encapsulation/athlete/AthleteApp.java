package oop.encapsulation.athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketBallPlayer kobe = new BasketBallPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(25.5);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[3];
        basketBallPlayers[0] = kobe;
        basketBallPlayers[1] = jordan;
        basketBallPlayers[2] = magic;

        System.out.println("BasketBall Players List");
        for(BasketBallPlayer basketBallPlayer : basketBallPlayers) {
            System.out.println("--------------------------------------------------------");
            basketBallPlayer.playGame();
            System.out.println("--------------------------------------------------------");
            basketBallPlayer.getBio();
        }
        
        FootBallPlayer tom = new FootBallPlayer("Tom BRady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootBallPlayer ed = new FootBallPlayer("Ed BRady", "Ed Terrific", 1980, "New England Patriots", 255, 8000, 6300);
        ed.setTeam("Tampa Bay");
        FootBallPlayer[] footBallPlayers = new FootBallPlayer[2];
        footBallPlayers[0] = tom;
        footBallPlayers[1] = ed;
        
        System.out.println("--------------------------------------------------------");
        System.out.println("FootBall Players List");
        for(FootBallPlayer footBallPlayer : footBallPlayers) {
            System.out.println("--------------------------------------------------------");
            footBallPlayer.playGame();
            System.out.println("--------------------------------------------------------");
            footBallPlayer.getBio();
        }

    }
}
 