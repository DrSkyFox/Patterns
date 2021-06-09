package builder.parts;

public class CheeseType extends Ingredients {
    private Double mass;

    public CheeseType(String name, Integer count, Double mass) {
        super(name, count);
        this.mass = mass;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return super.toString() + " " + mass;
    }
}
