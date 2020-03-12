package com.bereket;

public class Teacher extends User {

    private String subject;
    private String [] classrooms;
    private int ptoDays = 10;

    public Teacher(String fName, String lName, int userId, String subject, String[] classrooms) {
        super(fName, lName, userId, "T");
        this.subject = subject;
        this.classrooms = classrooms;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(String[] classrooms) {
        this.classrooms = classrooms;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    @Override
    public void absent(int daysAbsent) {
        this.ptoDays -= daysAbsent;
        System.out.println(this.getfName() + "has" + this.ptoDays + "days left");
        super.absent(daysAbsent);
    }
}
