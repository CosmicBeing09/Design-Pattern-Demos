package creational_design_patterns.builder;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("larger")
                .cheese(true).onions(true).build();

        System.out.println(pizza.isCheese());
        System.out.println(pizza.isOnions());
        System.out.println(pizza.isMushrooms());
    }
}
