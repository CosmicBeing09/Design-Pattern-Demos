package behavioral_design_patterns.state.states;

import behavioral_design_patterns.state.context.DeliveryPackage;

public class OrderedState implements PackageState{
    @Override
    public void next(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new DeliveredState());
    }

    @Override
    public void prev(DeliveryPackage deliveryPackage) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
