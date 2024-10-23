//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pizzaDriver();
    }

    public static void pizzaDriver() {
        Pizza pizzaHut1 = new PizzaBuilder().addTopping("Pepperoni").addTopping("Mushrooms").addTopping("Sausage").setPizzaChain("Pizza Hut").createPizza();
        Pizza pizzaHut2 = new PizzaBuilder().addTopping("Chicken").addTopping("Bacon").addTopping("Sausage").addTopping("Extra Cheese").addTopping("Pesto").addTopping("Onions").setPizzaChain("Pizza Hut").createPizza();
        Pizza pizzaHut3 = new PizzaBuilder().addTopping("Extra Cheese").addTopping("Peppers").addTopping("Pesto").addTopping("Spicy Pork").addTopping("Tomato and Basil").addTopping("Ham and Pineapple").addTopping("Pepperoni").addTopping("Mushrooms").addTopping("Sausage").setPizzaChain("Pizza Hut").createPizza();
    }
}