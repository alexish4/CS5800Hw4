import Macro.Customer;
import Macro.MacroNutrientFactory;

public class MacroDriver {
    public static void main(String[] args) {
        macroDriver();
    }

    public static void macroDriver() {
        Customer john = new Customer("John", "Vegan");
        Customer jane = new Customer("Jane", "No Restrictions");
        Customer jimmy = new Customer("Jimmy", "Paleo");
        Customer joe = new Customer("Joe", "Nut Allergy");
        Customer bob = new Customer("Bob", "Nut Allergy");
        Customer steven = new Customer("Steven", "Vegan");

        MacroNutrientFactory macroFactory = new MacroNutrientFactory();

        john.setDiet(macroFactory.getMacroNutrientMeal(john.getDietType()));
        jane.setDiet(macroFactory.getMacroNutrientMeal(jane.getDietType()));
        jimmy.setDiet(macroFactory.getMacroNutrientMeal(jimmy.getDietType()));
        joe.setDiet(macroFactory.getMacroNutrientMeal(joe.getDietType()));
        bob.setDiet(macroFactory.getMacroNutrientMeal(bob.getDietType()));
        steven.setDiet(macroFactory.getMacroNutrientMeal(steven.getDietType()));

        //System.out.println(john.getDiet().);

        john.getDiet().printDiet();
        jane.getDiet().printDiet();
        jimmy.getDiet().printDiet();
        joe.getDiet().printDiet();
        bob.getDiet().printDiet();
        steven.getDiet().printDiet();
    }
}
