package oops.abstraction.athlete;

/*
    AthleteApp.java file is acting as an medium between the 
    BasketBallPlayer.java,FootBallPlayer.java and Athlete.java

    Here the data is given and at Athlete.java file it is encapsulated 
    and accessed with the getter and setters.
 */
public class AthleteApp {
    public static void main(String[] args) {

        /*
        Basket Ball Players name is written as objects for 
        the sake of simplicity
        */
        BasketBallPlayer kobe = new BasketBallPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(25.5);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        // Arranging them into a single Array for easy access in loop
        BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[3];
        basketBallPlayers[0] = kobe;
        basketBallPlayers[1] = jordan;
        basketBallPlayers[2] = magic;

        System.out.println("BasketBall Players List");
        for(BasketBallPlayer basketBallPlayer : basketBallPlayers) {
            System.out.println("--------------------------------------------------------");
            basketBallPlayer.compete();
            System.out.println("--------------------------------------------------------");
            basketBallPlayer.getBio();
            System.out.println(basketBallPlayer.getBodyType());
        }
        
        /*
        FootBall Ball Players name is written as objects for 
        the sake of simplicity
        */
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
            footBallPlayer.compete();
            System.out.println("--------------------------------------------------------");
            footBallPlayer.getBio();
            System.out.println(footBallPlayer.getBodyType());
        }

        Swimmer katinka = new Swimmer("Katinka", "Iron lady", 1989, "Team Iron", 542, 845);
        System.out.println("--------------------------------------------------------");
            katinka.compete();
            System.out.println("--------------------------------------------------------");
            katinka.getBio();
            System.out.println(katinka.getBodyType());

    }
}
 