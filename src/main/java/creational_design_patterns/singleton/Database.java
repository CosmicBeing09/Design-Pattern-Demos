package creational_design_patterns.singleton;

public class Database {
    public static Database databaseInstance;
    private String userName;

    public Database(String userName){
        this.userName = userName;
    }

    public static Database getDatabaseInstance(String credentialKey, String userName){
        if(databaseInstance == null){
            databaseInstance = new Database(userName);
        }
        return databaseInstance;
    }

    public  String getUserName(){
        return userName;
    }
}
