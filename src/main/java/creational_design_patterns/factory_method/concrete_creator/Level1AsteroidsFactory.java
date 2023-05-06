package creational_design_patterns.factory_method.concrete_creator;

import creational_design_patterns.factory_method.concrete_product.Ice_Asteroids;
import creational_design_patterns.factory_method.concrete_product.Iron_Asteroids;
import creational_design_patterns.factory_method.creator.AsteroidsFactory;
import creational_design_patterns.factory_method.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
