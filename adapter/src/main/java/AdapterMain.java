import adapter.*;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {


        List<Movable> movables = new ArrayList<>();
        movables.add(new Human());
        movables.add(new Plane());
        movables.add(new Machine());
        MovableAdapter movableAdapter;

        for (Movable movable: movables
             ) {
            movableAdapter = new MovableAdapterImpl(movable);
            System.out.println(movable.toString());
            System.out.println("Converted speed :" + movableAdapter.getSpeed(SystemMeasure.SI_M_PER_SECOND));

        }



    }
}
