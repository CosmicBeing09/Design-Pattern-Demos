package behavioral_design_patterns.state.states;

import behavioral_design_patterns.state.context.DeliveryPackage;

public interface PackageState {
    void next(DeliveryPackage deliveryPackage);
    void prev(DeliveryPackage deliveryPackage);
    void printStatus();
}
