package com.bereket;

public class Main {

    public static void main(String[] args) {



        String[] classrooms = {"classroom1","classroom2","classroom3"};
        User student1 = new User("Mike","Martin",123,"Student");
        Teacher teacher1 = new Teacher("tomas","Adam",1234,"math",classrooms);
        Student student2 = new Student("Billy","Martin",54345,"S", 4.0,
                "billy.Martin@gmail.com",15);

        student2.absent(2);

    }
}
