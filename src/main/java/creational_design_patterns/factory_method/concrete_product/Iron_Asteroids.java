package creational_design_patterns.factory_method.concrete_product;

import creational_design_patterns.factory_method.product.Asteroids;

public class Iron_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Iron_Asteroids popped up");
    }
}
