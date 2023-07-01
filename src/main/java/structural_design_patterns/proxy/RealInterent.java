package structural_design_patterns.proxy;

public class RealInterent implements Internet{
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to : " + serverHost);
    }
}
