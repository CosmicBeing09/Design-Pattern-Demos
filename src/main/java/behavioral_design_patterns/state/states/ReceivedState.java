package behavioral_design_patterns.state.states;

import behavioral_design_patterns.state.context.DeliveryPackage;

public class ReceivedState implements PackageState{
    @Override
    public void next(DeliveryPackage deliveryPackage) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package is successfully received by the client!!");
    }
}
