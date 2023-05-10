package creational_design_patterns.prototype;

public class Client {
    public static void main(String[] args) {
       Circle c1 = new Circle(10,20, 5);
       c1.colour = "Red";

//      Trying to copy c2 into c1
//       Circle c2 = new Circle();
//       c2.x = c1.x;  --> Private member can't be copied
//       c2.y = c2.y;  --> Private member can't be copied
//       c2.colour = c1.colour; --> Allowed to copy
//       c2.radius = c1.radius; --> Private member can't be copied

        Circle c2 = c1.CLONE();
        c2.draw();
    }
}
