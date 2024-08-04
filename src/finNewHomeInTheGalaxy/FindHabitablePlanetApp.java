package finNewHomeInTheGalaxy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHabitablePlanetApp {
    private static char degree = '\u00B0';
    private static final String SOLID = "solid";
    private static final int AVERAGE_EARTH_TEMPERATURE = 15;
    private static final double EARTH_SUN_DISTANCE_IN_LIGHT_YEARS = 0.00001581;

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

        Optional<Planet> theHottestPlanet = planets.stream()
                .max(Comparator.comparing(Planet::getTemperature));
        System.out.println("THe Coldest Planet on the Galaxy is \"" + theHottestPlanet.get().getName()
                        + "\" at \"" + theHottestPlanet.get().getTemperature() + degree + "C\"");
        System.out.println("------------------------------------------------------------------------");
        
        List<Planet> top10Planets = planets.stream()
                .filter(planet -> SOLID.equals(planet.getType()))
                .sorted(Comparator.comparing((Planet planet) -> Math.abs(planet.getTemperature() - AVERAGE_EARTH_TEMPERATURE))
                    .thenComparing(Planet::getDistanceFromEarth))
                .limit(10)
                .collect(Collectors.toList());
        
        top10Planets.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------");

        
        System.out.println("The Planet closest to the distance between sun and earth : ");
        top10Planets.stream()
                .sorted(Comparator.comparing((Planet planet) -> Math.abs(planet.getClosestStarDistance() - EARTH_SUN_DISTANCE_IN_LIGHT_YEARS)))
                .limit(1)
                .forEach(System.out::println);
    }
}
