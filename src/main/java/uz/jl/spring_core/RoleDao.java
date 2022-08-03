package uz.jl.spring_core;

import lombok.ToString;

@ToString
public class RoleDao {
    private String dbName;
    private String dbUsername;
    private String dbPassword;

    public void init() {
        System.out.println("Init method called");
    }

    public RoleDao() {
        System.out.println("Empty constructor called by spring container");
    }

    public RoleDao(String dbName, String dbUsername, String dbPassword) {
        System.out.println("All args constructor called by spring container");
        this.dbName = dbName;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public static RoleDao factory() {
        return new RoleDao("notion","admin","123");
    }

    public void setDbName(String dbName) {
        System.out.println("setDbName");
        this.dbName = dbName;
    }

    public void setDbUsername(String dbUsername) {
        System.out.println("setDbUsername");
        this.dbUsername = dbUsername;
    }

    public void setDbPassword(String dbPassword) {
        System.out.println("setDbPassword");
        this.dbPassword = dbPassword;
    }

    public void destroy() {
        System.out.println("Destroy method called");
    }
}
