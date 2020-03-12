package com.bereket;

public class Student extends User {

    private double GPA = 4.0;
    private String email;
    private int age;

    public Student(String fName, String lName, int userId, String role, double GPA, String email, int age) {
        super(fName, lName, userId, role);
        this.GPA = GPA;
        this.email = email;
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void absent(int daysAbsent) {
        this.GPA -= daysAbsent * 0.01;
        System.out.println(this.getEmail() + "has " + this.GPA + "as total GPA");
        super.absent(daysAbsent);
    }
}
