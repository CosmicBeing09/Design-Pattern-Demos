package behavioral_design_patterns.state;

import behavioral_design_patterns.state.context.DeliveryPackage;

public class Client {
    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage();

        deliveryPackage.printStatus();

        deliveryPackage.nextState();
        deliveryPackage.printStatus();

        deliveryPackage.nextState();
        deliveryPackage.printStatus();

        deliveryPackage.nextState();
    }
}
