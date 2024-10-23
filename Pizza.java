import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private static final List<String> ALL_TOPPINGS = List.of(
            "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
            "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach",
            "Tomato and Basil", "Beef", "Ham", "Pesto",
            "Spicy Pork", "Ham and Pineapple"
    );
    //Have both constructors?

    private List<String> selectedToppings = new ArrayList<>();
    private String size;
    private String pizzaChain;

    public List<String> getSelectedToppings() {
        return selectedToppings;
    }

    public void setSelectedToppings(List<String> selectedToppings) {
        this.selectedToppings = selectedToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPizzaChain() {
        return pizzaChain;
    }

    public void setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
    }

    public Pizza(List<String> selectedToppings, String size, String pizzaChain) {
        this.selectedToppings = selectedToppings;
        this.size = size;
        this.pizzaChain = pizzaChain;
    }

    public void addTopping(String topping) {
        if (ALL_TOPPINGS.contains(topping) && !selectedToppings.contains(topping)) {
            selectedToppings.add(topping);
        }
    }

    public void eat() {
        System.out.println("Pizza is from:" + pizzaChain);
        System.out.println("Size is " + size);
        System.out.print("Selected toppings: ");
        for (String topping : selectedToppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
    }

}
