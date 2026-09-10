package org.example.DesignPattern.CreationalDesignPattern.SingletonDesignPattern.BetterCode;

public class SingletonPattern {

    public static void main(String[] args) {
      AppSetting appSetting = AppSetting.getInstance();
      AppSetting appSettingCopy = AppSetting.getInstance();
      System.out.println(appSettingCopy.equals(appSetting));
    }
}
class AppSetting {
    private String dbUrl;
    private String apiKey;
    private static AppSetting instance; // Step 1 - A private static instance of the class.

    // The constructor is responsible for creating an object.
    // Private constructor to prevent direct object creation.
    private AppSetting() {

        dbUrl = "jdbc:mysql://localhost:3306/test";
        apiKey = "12345-abc";
    }


    // Private constructor will not let to create an object. A method to create the object.
    // Public static method to create the single instance of the class.
    public static AppSetting getInstance() {
        if (instance == null)
            instance = new AppSetting();
        return instance;
    }


    public String getDbUrl() {
        return dbUrl;
    }
    public String getApiKey() {
        return apiKey;
    }
}