/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.StudentManagement;
import Model.StudentList;
import Model.Student;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Student st = new Student(001, "nguyen van A", 1, "Java");
        StudentList.students.add(st);
        Student st1 = new Student(002, "nguyen thi B", 1, "Java");
        StudentList.students.add(st1);
        Student st2 = new Student(003, "nguyen thi C", 1, "Java");
        StudentList.students.add(st2);
        Student st3 = new Student(004, "nguyen van D", 1, "Java");
        StudentList.students.add(st3);
        Student st4 = new Student(005, "nguyen thi E", 1, "Java");
        StudentList.students.add(st4);
        Student st5 = new Student(006, "nguyen van F", 1, "Java");
        StudentList.students.add(st5);
        Student st6 = new Student(007, "nguyen van G", 1, "Java");
        StudentList.students.add(st6);
        Student st7 = new Student(007, "nguyen van F", 1, "Java");
        StudentList.students.add(st7);

      

        StudentManagement manager = new StudentManagement();

        while (true) {
            
            manager.run();
        }
    }
}
