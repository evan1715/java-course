package wk4;

//Exercise 76: Menu
import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();

    }

    //Exercise 76.1 Adding a meal to the menu
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    //Exercise 76.2 Printing the menu
    public void printMeals() {
        System.out.println(this.meals);
    }

    //Exercise 76.3: Clearing a menu
    public void clearMenu() {
        meals.clear();
    }
    
}