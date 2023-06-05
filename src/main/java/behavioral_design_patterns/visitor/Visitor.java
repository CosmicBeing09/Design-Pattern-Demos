package behavioral_design_patterns.visitor;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
