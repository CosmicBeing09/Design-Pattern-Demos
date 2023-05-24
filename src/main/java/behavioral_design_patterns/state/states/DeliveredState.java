package behavioral_design_patterns.state.states;

import behavioral_design_patterns.state.context.DeliveryPackage;

public class DeliveredState implements PackageState{
    @Override
    public void next(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new ReceivedState());
    }

    @Override
    public void prev(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
