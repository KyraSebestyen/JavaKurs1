
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeReader {
    private Scanner fileReader;
    private Scanner inputReader;
    private List<String> lines = new ArrayList<>();
    private List<Recipe> recipes = new ArrayList<>();

    public RecipeReader() {
        this.inputReader = new Scanner(System.in);
    }

    public void read() {
        while (fileReader.hasNext()) {
            this.lines.add(fileReader.nextLine());
        }
    }

    public void splitLinesIntoRecipes() {
        List<String> oneRecipe;
        while (!(this.lines.isEmpty())) {
            int indexOfEmptyLine = lines.indexOf("");
            if (indexOfEmptyLine == -1) { // keine Leerzeile gefunden
                oneRecipe = lines;
            } else {
                oneRecipe = new ArrayList<>(lines.subList(0, indexOfEmptyLine));
            }
            Recipe recipe = new Recipe(oneRecipe);
            this.recipes.add(recipe);
            if (indexOfEmptyLine == -1) { //Ende der Datei -> Abbruchbedingung schaffen
                this.lines.clear();
            } else {
                this.lines = new ArrayList<>(lines.subList(indexOfEmptyLine + 1, this.lines.size()));
            }
        }
    }

    public void printRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }

    public void findRecipes(String name) {
        List<Recipe> foundRecipes = new ArrayList<>();
        Recipe foundRecipe;
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                foundRecipe = recipe;
                foundRecipes.add(foundRecipe);
            }
        }
        System.out.println("Recipes: ");
        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe);
        }
    }

    public void findRecipesWithIngredient(String ingredient) {
        List<Recipe> foundRecipes = new ArrayList<>();
        Recipe foundRecipe;
        for (Recipe recipe : this.recipes) {
            if (recipe.containsIngredient(ingredient)) {
                foundRecipe = recipe;
                foundRecipes.add(foundRecipe);
            }
        }
        System.out.println("Recipes: ");
        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe);
        }
    }

    public void findRecipesWithMaxTime(int maxTime) {
        List<Recipe> foundRecipes = new ArrayList<>();
        Recipe foundRecipe;
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                foundRecipe = recipe;
                foundRecipes.add(foundRecipe);
            }
        }
        System.out.println("Recipes: ");
        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe);
        }
    }

    public Scanner getInputReader() {
        return inputReader;
    }

    public void setFileReader(Scanner fileReader) {
        this.fileReader = fileReader;
    }
}

