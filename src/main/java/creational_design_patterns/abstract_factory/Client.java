package creational_design_patterns.abstract_factory;


import creational_design_patterns.abstract_factory.abstract_factory.ObstacleFactory;
import creational_design_patterns.abstract_factory.concrete_factory.Asteriods.Level1AsteroidsFactory;
import creational_design_patterns.abstract_factory.concrete_factory.Asteriods.Level2AsteroidsFactory;
import creational_design_patterns.abstract_factory.concrete_factory.DebrisField.Level1DebrisFieldFactory;
import creational_design_patterns.abstract_factory.concrete_factory.DebrisField.Level2DebrisFieldFactory;
import creational_design_patterns.abstract_factory.product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        ObstacleFactory factory;

        if(level == 1) factory = new Level1AsteroidsFactory();
        else factory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if(level == 1) factory = new Level1DebrisFieldFactory();
        else factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();


    }
}
