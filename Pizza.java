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

//    private String pepperoni = "";
//    private String sausage = "";
//    private String bacon = "";
//    private String onions = "";
//    private String extraCheese = "";
//    private String peppers = "";
//    private String chicken = "";
//    private String olives = "";
//    private String spinach = "";
//    private String tomatoAndBasil = "";
//    private String beef = "";
//    private String ham = "";
//    private String pesto = "";
//    private String spicyPork = "";
//    private String hamAndPineapple = "";

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


//    public Pizza(String pepperoni, String sausage, String bacon, String onions, String extraCheese,
//                 String peppers, String chicken, String olives, String spinach, String tomatoAndBasil,
//                 String beef, String ham, String pesto, String spicyPork, String hamAndPineapple) {
//        if(checkToAddTopping(pepperoni))
//            this.pepperoni = pepperoni;
//        if(checkToAddTopping(sausage))
//            this.sausage = sausage;
//        if(checkToAddTopping(bacon))
//            this.bacon = bacon;
//        if(checkToAddTopping(onions))
//            this.onions = onions;
//        if(checkToAddTopping(extraCheese))
//            this.extraCheese = extraCheese;
//        if(checkToAddTopping(peppers))
//            this.peppers = peppers;
//        if(checkToAddTopping(chicken))
//            this.chicken = chicken;
//        if(checkToAddTopping(olives))
//            this.olives = olives;
//        if(checkToAddTopping(spinach))
//            this.spinach = spinach;
//        if(checkToAddTopping(tomatoAndBasil))
//            this.tomatoAndBasil = tomatoAndBasil;
//    }
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


    public static class PizzaBuilder {
        private static final List<String> ALL_TOPPINGS = List.of(
                "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
                "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach",
                "Tomato and Basil", "Beef", "Ham", "Pesto",
                "Spicy Pork", "Ham and Pineapple"
        );

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

        public void addTopping(String topping) {
            if (ALL_TOPPINGS.contains(topping) && !selectedToppings.contains(topping)) {
                selectedToppings.add(topping);
            }
        }



        public Pizza createPizza() {
            return new Pizza(selectedToppings);
        }

    }
}
