import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<String> ingredients;

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public Recipe() {
    }

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }

    public Recipe(List<String> nameCookingTimeIngredients) {
        this.name = nameCookingTimeIngredients.get(0);
        this.cookingTime = Integer.parseInt(nameCookingTimeIngredients.get(1));
        this.ingredients = new ArrayList<>(nameCookingTimeIngredients.subList(2, nameCookingTimeIngredients.size()));
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public boolean containsIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}
