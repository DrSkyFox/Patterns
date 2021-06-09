package builder;

import builder.parts.*;

public interface Builder<T> {
    T setDough(DoughType doughType);
    T setCheese(CheeseType cheeseType);
    T setMeat(MeatType meatType);
    T setTomato(TomatoType tomatoType);
    T setOtherType(OtherType otherType);
}
