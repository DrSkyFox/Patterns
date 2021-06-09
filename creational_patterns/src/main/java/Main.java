import builder.Builder;
import builder.Pizza;
import builder.PizzaBuilder;
import builder.parts.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza  = new PizzaBuilder().setCheese(new CheeseType("Gauda", 1, 500.0))
                .setDough(new DoughType("small", 1, 2))
                .setTomato(new TomatoType("BigTomatos", 3, true))
                .setMeat(new MeatType("FireInTheHall", 1 , 1,MeatType.Meat.BEEF))
                .getResult();


        System.out.println(pizza);

    }
}
