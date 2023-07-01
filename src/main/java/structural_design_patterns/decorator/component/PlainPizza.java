package structural_design_patterns.decorator.component;

// Concrete Component
public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
