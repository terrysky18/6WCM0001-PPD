package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        String teacher_name = "Lucy Pendleton";
        int birth_year = 1983;
        String room_num = "g.134";

        Staff staff1 = new Staff(teacher_name, birth_year, room_num);

        //System.out.println(staff1.getRoom());
        String student_name = "Emma Yorke";
        birth_year = 1995;
        String student_ID = "JS17DIA";

        Student student1 = new Student(student_name, birth_year, student_ID);

        Database myDB = new Database();
        myDB.addPerson(staff1);
        myDB.addPerson(student1);

        myDB.listAll();
        System.out.println("Completed");
    }
}
