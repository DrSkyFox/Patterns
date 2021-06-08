package builder.parts;

public class MeatType extends Ingredients {

    private Integer portion;
    private Meat meat;

    public MeatType(String name, Integer count, Integer portion, Meat meat) {
        super(name, count);
        this.portion = portion;
        this.meat = meat;
    }

    public enum Meat {
        CHICKEN, FISH, PIG, BEEF
    }

    public Integer getPortion() {
        return portion;
    }

    public void setPortion(Integer portion) {
        this.portion = portion;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "portion=" + portion +
                ", meat=" + meat;
    }
}
