package creational_design_patterns.abstract_factory.concrete_factory.Asteriods;

import creational_design_patterns.abstract_factory.product.Asteriods.Asteriods;
import creational_design_patterns.abstract_factory.product.Asteriods.Rocky_Asteroids;
import creational_design_patterns.abstract_factory.product.Asteriods.Silicon_Asteroids;
import creational_design_patterns.abstract_factory.product.Obstacle;

public class Level2AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
