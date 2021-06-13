package adapter;

public class MovableAdapterImpl implements  MovableAdapter{

    private Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    public MovableAdapterImpl() {
    }

    public Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeed(SystemMeasure systemMeasure) {
        switch (systemMeasure) {
            case SI_KM_PER_HOUR -> {
                if(movable.getSystem() == SystemMeasure.IMPERIAL_MILES_PER_HOUR) {
                    return convertMPHtoKMPH(movable.getSpeed());
                }
                if(movable.getSystem() == SystemMeasure.SI_KM_PER_HOUR) {
                    return movable.getSpeed();
                }
                if (movable.getSystem() == SystemMeasure.SI_M_PER_SECOND) {
                    return convertMPStoKPH(movable.getSpeed());
                }
            }
            case SI_M_PER_SECOND -> {
                if(movable.getSystem() == SystemMeasure.IMPERIAL_MILES_PER_HOUR) {
                    return convertMPHtoMPS(movable.getSpeed());
                }
                if(movable.getSystem() == SystemMeasure.SI_KM_PER_HOUR) {
                    return convertMPStoKPH(movable.getSpeed());
                }
                if(movable.getSystem() == SystemMeasure.SI_M_PER_SECOND) {
                    return movable.getSpeed();
                }
            }
            case IMPERIAL_MILES_PER_HOUR -> {
                if(movable.getSystem() == SystemMeasure.IMPERIAL_MILES_PER_HOUR) {
                    return movable.getSpeed();
                }
                if(movable.getSystem() == SystemMeasure.SI_KM_PER_HOUR) {
                    return convertKPHtoMPH(movable.getSpeed());
                }
                if(movable.getSystem() == SystemMeasure.SI_M_PER_SECOND) {
                    return convertMPStoMPH(movable.getSpeed());
                }
            }
        }
        return 0;
    }



    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

    private double convertKPHtoMPH(double kph) {
        return kph / 1.60934;
    }

    private double convertMPHtoMPS(double mph) {
        return convertKPHtoMPS(convertMPHtoKMPH(mph)) ;
    }
    private double convertKPHtoMPS(double kph) {
        return kph / 3.6;
    }

    private double convertMPStoKPH(double mps) {
        return mps * 3.6;
    }

    private double convertMPStoMPH(double mps) {
        return convertKPHtoMPH(convertMPStoKPH(mps));
    }


}
