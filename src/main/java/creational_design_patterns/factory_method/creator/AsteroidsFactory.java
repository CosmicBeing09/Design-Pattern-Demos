package creational_design_patterns.factory_method.creator;

import creational_design_patterns.factory_method.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
