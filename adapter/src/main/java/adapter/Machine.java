package adapter;

public class Machine implements  Movable{

    private SystemMeasure systemMeasure = SystemMeasure.SI_KM_PER_HOUR;

    @Override
    public SystemMeasure getSystem() {
        return systemMeasure;
    }

    @Override
    public double getSpeed() {
        return 200;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "systemMeasure=" + systemMeasure + " speed: " + getSpeed() +
                '}';
    }
}
