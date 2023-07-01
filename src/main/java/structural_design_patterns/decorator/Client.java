package structural_design_patterns.decorator;

import structural_design_patterns.decorator.component.Pizza;
import structural_design_patterns.decorator.component.PlainPizza;
import structural_design_patterns.decorator.decorator.concrete_decorator.CheeseDecorator;
import structural_design_patterns.decorator.decorator.concrete_decorator.PepperoniDecorator;

public class Client {
    public static void main(String[] args) {
        // Create a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese to the pizza using a decorator
        Pizza pizzaWithCheese = new CheeseDecorator(pizza);
        System.out.println(pizzaWithCheese.getDescription() + " Cost: $" + pizzaWithCheese.getCost());

        // Add pepperoni to the pizza using a decorator
        Pizza pizzaWithCheeseAndPepperoni = new PepperoniDecorator(pizzaWithCheese);
        System.out.println(pizzaWithCheeseAndPepperoni.getDescription() + " Cost: $" + pizzaWithCheeseAndPepperoni.getCost());

    }
}
