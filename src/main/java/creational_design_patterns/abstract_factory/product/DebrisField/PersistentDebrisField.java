package creational_design_patterns.abstract_factory.product.DebrisField;

public class PersistentDebrisField implements DebrisField{
    @Override
    public void show() {
        System.out.println("Persistent Debris Field Appeared");
    }
}
