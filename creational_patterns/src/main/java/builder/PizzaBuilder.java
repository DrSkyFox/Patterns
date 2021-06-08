package builder;

import builder.parts.*;

public class PizzaBuilder implements  Builder<PizzaBuilder>{

    private DoughType doughType;

    private CheeseType cheeseType;

    private MeatType meatType;

    private TomatoType tomatoType;

    private OtherType otherType;


    @Override
    public PizzaBuilder setDough(DoughType doughType) {
        this.doughType =doughType;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(CheeseType cheeseType) {
        this.cheeseType =cheeseType;
        return this;
    }

    @Override
    public PizzaBuilder setMeat(MeatType meatType) {
        this.meatType = meatType;
        return this;
    }

    @Override
    public PizzaBuilder setTomato(TomatoType tomatoType) {
        this.tomatoType = tomatoType;
        return this;
    }

    @Override
    public PizzaBuilder setOtherType(OtherType otherType) {
        this.otherType= otherType;
        return this;
    }

    public Pizza getResult(){
        return new Pizza(doughType, cheeseType, meatType, tomatoType, otherType);
    }
}
