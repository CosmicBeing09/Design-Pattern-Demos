package creational_design_patterns.abstract_factory.product.DebrisField;

public class StaticDebrisField implements DebrisField{
    @Override
    public void show() {
        System.out.println("Static Debris Appeared");
    }
}
