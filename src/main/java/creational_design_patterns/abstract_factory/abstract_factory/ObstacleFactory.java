package creational_design_patterns.abstract_factory.abstract_factory;

import creational_design_patterns.abstract_factory.product.Obstacle;

public abstract class ObstacleFactory {
    public abstract Obstacle createObstacle(int score);
}
