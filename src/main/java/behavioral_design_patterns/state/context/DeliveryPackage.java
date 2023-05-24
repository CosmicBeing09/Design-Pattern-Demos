package behavioral_design_patterns.state.context;

import behavioral_design_patterns.state.states.OrderedState;
import behavioral_design_patterns.state.states.PackageState;

public class DeliveryPackage {

    private PackageState state = new OrderedState();


    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
