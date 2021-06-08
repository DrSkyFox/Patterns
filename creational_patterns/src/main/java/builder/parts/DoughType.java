package builder.parts;

public class DoughType extends Ingredients {

    private Integer roastDegree;

    public DoughType(String name, Integer count, Integer roastDegree) {
        super(name, count);
        this.roastDegree = roastDegree;
    }

    public Integer getRoastDegree() {
        return roastDegree;
    }

    public void setRoastDegree(Integer roastDegree) {
        this.roastDegree = roastDegree;
    }

    @Override
    public String toString() {
        return super.toString() + "Roast degree: " + roastDegree;
    }
}
