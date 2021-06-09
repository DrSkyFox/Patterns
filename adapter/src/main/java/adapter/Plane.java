package adapter;

public class Plane  implements Movable{


    private SystemMeasure systemMeasure = SystemMeasure.IMPERIAL_MILES_PER_HOUR;

    @Override
    public SystemMeasure getSystem() {
        return systemMeasure;
    }

    @Override
    public double getSpeed() {
        return 900;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "systemMeasure=" + systemMeasure + " speed: " + getSpeed() +
                '}';
    }
}
