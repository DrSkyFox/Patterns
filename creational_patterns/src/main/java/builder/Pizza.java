package builder;

import builder.parts.*;

public class Pizza {
    private DoughType doughType;

    private CheeseType cheeseType;

    private MeatType meatType;

    private TomatoType tomatoType;

    private OtherType otherType;

    public Pizza(DoughType doughType, CheeseType cheeseType, MeatType meatType, TomatoType tomatoType, OtherType otherType) {
        this.doughType = doughType;
        this.cheeseType = cheeseType;
        this.meatType = meatType;
        this.tomatoType = tomatoType;
        this.otherType = otherType;
    }

    public DoughType getDoughType() {
        return doughType;
    }

    public void setDoughType(DoughType doughType) {
        this.doughType = doughType;
    }

    public CheeseType getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public TomatoType getTomatoType() {
        return tomatoType;
    }

    public void setTomatoType(TomatoType tomatoType) {
        this.tomatoType = tomatoType;
    }

    public OtherType getOtherType() {
        return otherType;
    }

    public void setOtherType(OtherType otherType) {
        this.otherType = otherType;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "doughType=" + doughType +
                ", cheeseType=" + cheeseType +
                ", meatType=" + meatType +
                ", tomatoType=" + tomatoType +
                ", otherType=" + otherType +
                '}';
    }
}
