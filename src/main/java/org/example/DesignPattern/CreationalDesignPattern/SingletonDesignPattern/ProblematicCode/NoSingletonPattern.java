package org.example.DesignPattern.CreationalDesignPattern.SingletonDesignPattern.ProblematicCode;

public class NoSingletonPattern
{
    public static void main(String[] args) {
        AppSetting appSetting = new AppSetting();
        AppSetting appSettingCopy = new AppSetting();
        System.out.println(appSetting.getDbUrl());
        System.out.println(appSettingCopy.getDbUrl());

        System.out.println(appSettingCopy.equals(appSetting));
        // The application should use the same dbUrl and when the there are more object then it takes memory and it is not needed.
    }
}

class AppSetting {
    private String dbUrl;
    private String apiKey;

    public AppSetting() {
        dbUrl = "jdbc:mysql://localhost:3306/test";
        apiKey = "12345-abc";
    }

    public String getDbUrl() {
        return dbUrl;
    }
    public String getApiKey() {
        return apiKey;
    }
}