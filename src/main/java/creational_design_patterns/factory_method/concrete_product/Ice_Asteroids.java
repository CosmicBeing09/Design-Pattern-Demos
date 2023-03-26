package creational_design_patterns.factory_method.concrete_product;

import creational_design_patterns.factory_method.product.Asteroids;

public class Ice_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Ice_Asteroids popped up");
    }
}
