package behavioral_design_patterns.observer;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        User user1 = new User("John");
        User user2 = new User("Emily");
        User user3 = new User("David");

        weatherStation.attach(user1);
        weatherStation.attach(user2);
        weatherStation.attach(user3);

        weatherStation.setTemperature(25.5);
        // Output: John received an update: Temperature is 25.5
        //         Emily received an update: Temperature is 25.5
        //         David received an update: Temperature is 25.5

        weatherStation.detach(user2);

        weatherStation.setTemperature(30.0);
        // Output: John received an update: Temperature is 30.0
        //         David received an update: Temperature is 30.0

    }
}
