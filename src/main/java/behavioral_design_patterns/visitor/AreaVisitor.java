package behavioral_design_patterns.visitor;

public class AreaVisitor implements Visitor{

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Area of Triangle: " + area);
    }
}
