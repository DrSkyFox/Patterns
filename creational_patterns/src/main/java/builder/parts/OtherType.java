package builder.parts;

import java.util.List;

public class OtherType {
    private List<Ingredients> ingredientsAdditional;

    public OtherType(List<Ingredients> ingredientsAdditional) {
        this.ingredientsAdditional = ingredientsAdditional;
    }

    private String listAdditional() {
        StringBuilder builder = new StringBuilder();
        for (Ingredients ingredients: ingredientsAdditional) {
            builder.append(ingredients.toString());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return ingredientsAdditional == null ? "None" : listAdditional();
    }
}
