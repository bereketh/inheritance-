package com.bereket;

public class User {
    private String fName;
    private String lName;
    private int userId;
    private String role;

    public User(String fName, String lName, int userId, String role) {
        this.fName = fName;
        this.lName = lName;
        this.userId = userId;
        this.role = role;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void absent(int daysAbsent){
        System.out.println(this.fName + " is absent for " + daysAbsent + " days");
    }
}
