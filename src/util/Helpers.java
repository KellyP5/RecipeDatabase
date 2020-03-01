package util;

import entities.Ingredient;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Helpers {
    public static int displayMenu(Scanner scanner, HashMap<Integer, String> menuOptions) {
        int choice;
        do {
            System.out.println("***Menu Items***");
            for (Map.Entry<Integer, String> entry : menuOptions.entrySet()) {
                System.out.println(entry.getKey() + ") " + entry.getValue());
            }
            choice = scanner.nextInt();

            if (!menuOptions.containsKey(choice)) {
                System.out.println("ERROR: Please select a valid option!");
            }
        } while (!menuOptions.containsKey(choice));
        return choice;
    }

    public static void printIngredientList(Iterable<Ingredient> ingredients) {
        System.out.println("Ingredients");
        System.out.println("--------------");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName());
        }
    }
}