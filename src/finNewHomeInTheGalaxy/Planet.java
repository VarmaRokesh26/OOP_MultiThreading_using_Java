package finNewHomeInTheGalaxy;

import java.util.Objects;

public class Planet {

    private String name;
    private int size;
    private double closestStarDistance;
    private int temperature;
    private String type;
    private double distanceFromEarth;

    public Planet(String name, int size, double closestStarDistance, int temperature, String type,
            double distanceFromEarth) {
        this.name = name;
        this.size = size;
        this.closestStarDistance = closestStarDistance;
        this.temperature = temperature;
        this.type = type;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getClosestStarDistance() {
        return closestStarDistance;
    }

    public void setClosestStarDistance(double closestStarDistance) {
        this.closestStarDistance = closestStarDistance;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public String toString() {
        return "Planet [name=" + name + ", size=" + size + ", closestStarDistance="
                + closestStarDistance + ", temperature=" + temperature + ", type=" + type
                + ", distanceFromEarth=" + distanceFromEarth + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, closestStarDistance, temperature, type, distanceFromEarth);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Planet))
            return false;

        Planet planet = (Planet) obj;

        return planet.getName().equals(name) && size == planet.getSize()
                && closestStarDistance == planet.getClosestStarDistance()
                && temperature == planet.temperature && type.equals(planet.getType())
                && distanceFromEarth == planet.getDistanceFromEarth();
    }
}
