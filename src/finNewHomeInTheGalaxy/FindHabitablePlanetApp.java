package finNewHomeInTheGalaxy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHabitablePlanetApp {
    private static char degree = '\u00B0';

    public static void main(String[] args) {

        List<Planet> planets = PlanetsData.getPlanets();
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Total Number of Planets in the Galaxy : " + planets.stream().distinct().count());
        System.out.println("------------------------------------------------------------------------");
        
        
        Optional<Planet> theBiggestPlanet = planets.stream()
        .max(Comparator.comparing(Planet::getSize));
        
        System.out.println("The Biggest Planet in the Galaxy is \"" + theBiggestPlanet.get().getName()
                        + "\" with \"" + theBiggestPlanet.get().getSize() + "kms\".");
        System.out.println("------------------------------------------------------------------------");

        Optional<Planet> theSmallestPlanet = planets.stream()
                .min(Comparator.comparing(Planet::getSize));

        System.out.println("The Smallest Planet in the Galaxy is \"" + theSmallestPlanet.get().getName()
                        + "\" with \"" + theSmallestPlanet.get().getSize() + "kms\".");
        System.out.println("------------------------------------------------------------------------");

        Optional<Planet> theColdestPlanet = planets.stream()
                .min(Comparator.comparing(Planet::getTemperature));

        System.out.println("THe Coldest Planet on the Galaxy is \"" + theColdestPlanet.get().getName()
                        + "\" at \"" + theColdestPlanet.get().getTemperature() + degree + "C\"");
        System.out.println("------------------------------------------------------------------------");             
    }
}
