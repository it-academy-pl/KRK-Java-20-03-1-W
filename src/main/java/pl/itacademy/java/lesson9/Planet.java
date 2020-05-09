package pl.itacademy.java.lesson9;

public enum Planet implements Rotatable {
    EARTH(6371, 1.0, "Ziemia"),
    VENUS(6051.8, 0.7, "Wenus"),
    MARS(3389.5, 1.524, "Mars");

    private double radius;
    private double distanceFromSun;
    private String polishName;

    Planet(double radius, double distanceFromSun, String polishName) {
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
        this.polishName = polishName;
    }

    public static Planet fromPolishName(String polishName) {
        for (Planet planet : values()) {
            if (planet.polishName.equals(polishName)) {
                return planet;
            }
        }
        throw new IllegalArgumentException("There is no planet with \"" + polishName + "\" Polish name");
    }

    public double getRadius() {
        return radius;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double equatorLength() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getRotateSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return polishName;
    }
}
