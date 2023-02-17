import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    private RecipeReader recipeReader = new RecipeReader();

    public void start() {
        System.out.println("File to read: ");
        String fileName = this.recipeReader.getInputReader().nextLine();
        try {
            this.recipeReader.setFileReader(new Scanner(Paths.get(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.recipeReader.read();
        this.recipeReader.splitLinesIntoRecipes();

        System.out.println("Commands:\n" +
                           "list - lists the recipes\n" +
                           "stop - stops the program\n" +
                           "find name - searches recipes by name?\n" +
                           "find cooking time - searches recipes by cooking time\n" +
                           "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String command = this.recipeReader.getInputReader().nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                this.recipeReader.printRecipes();
            }
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = this.recipeReader.getInputReader().nextLine();
                this.recipeReader.findRecipes(name);
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.parseInt(this.recipeReader.getInputReader().nextLine());
                this.recipeReader.findRecipesWithMaxTime(maxTime);
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = this.recipeReader.getInputReader().nextLine();
                this.recipeReader.findRecipesWithIngredient(ingredient);
            }
        }
    }
}
