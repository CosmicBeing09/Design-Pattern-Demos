package creational_design_patterns.factory_method.concrete_creator;

import creational_design_patterns.factory_method.concrete_product.Rocky_Asteroids;
import creational_design_patterns.factory_method.concrete_product.Silicon_Asteroids;
import creational_design_patterns.factory_method.creator.AsteroidsFactory;
import creational_design_patterns.factory_method.product.Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
