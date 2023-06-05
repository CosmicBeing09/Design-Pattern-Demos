package behavioral_design_patterns.visitor;

public interface Shape {
    void accept(Visitor visitor);
}
