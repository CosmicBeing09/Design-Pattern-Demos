package behavioral_design_patterns.chain_of_responsibility;

public interface AuthenticationHandler {
    void setNextHandler(AuthenticationHandler authenticationHandler);
    boolean authenticate(String userName, String password);
}
