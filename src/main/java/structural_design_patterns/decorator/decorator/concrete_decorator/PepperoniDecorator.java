package structural_design_patterns.decorator.decorator.concrete_decorator;

import structural_design_patterns.decorator.component.Pizza;
import structural_design_patterns.decorator.decorator.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
