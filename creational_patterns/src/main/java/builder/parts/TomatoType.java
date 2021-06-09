package builder.parts;

public class TomatoType extends Ingredients {
    private boolean isPaste;

    public TomatoType(String name, Integer count, boolean isPaste) {
        super(name, count);
        this.isPaste = isPaste;
    }

    public boolean isPaste() {
        return isPaste;
    }

    public void setPaste(boolean paste) {
        isPaste = paste;
    }

    @Override
    public String toString() {
        return super.toString() + ", isPaste " + isPaste;
    }
}
