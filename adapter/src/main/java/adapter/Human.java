package adapter;

public class Human implements Movable{

    private SystemMeasure systemMeasure = SystemMeasure.SI_KM_PER_HOUR;

    @Override
    public SystemMeasure getSystem() {
        return systemMeasure;
    }

    @Override
    public double getSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return "Human{" +
                "systemMeasure=" + systemMeasure + " speed: " + getSpeed() +
                '}';
    }
}
