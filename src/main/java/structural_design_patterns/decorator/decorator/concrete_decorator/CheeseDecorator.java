package structural_design_patterns.decorator.decorator.concrete_decorator;

import structural_design_patterns.decorator.component.Pizza;
import structural_design_patterns.decorator.decorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
