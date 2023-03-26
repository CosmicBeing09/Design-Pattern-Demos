package creational_design_patterns.singleton;

public class Client {
    public static void main(String[] args) {
        Database session1 = Database.getDatabaseInstance("value-1", "Avik");
        System.out.println(session1.getUserName());

        // trying to create another Database session

        Database session2 = Database.getDatabaseInstance("value-2", "Mahir");
        System.out.println(session2.getUserName());
    }
}
