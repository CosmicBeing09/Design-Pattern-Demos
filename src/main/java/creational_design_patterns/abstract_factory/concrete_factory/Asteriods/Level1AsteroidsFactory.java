package creational_design_patterns.abstract_factory.concrete_factory.Asteriods;

import creational_design_patterns.abstract_factory.product.Asteriods.Asteriods;
import creational_design_patterns.abstract_factory.product.Asteriods.Ice_Asteroids;
import creational_design_patterns.abstract_factory.product.Asteriods.Iron_Asteroids;
import creational_design_patterns.abstract_factory.product.Obstacle;


public class Level1AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return (Asteriods) new Iron_Asteroids();
    }
}
