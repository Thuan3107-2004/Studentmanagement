/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;
import Model.Student;
import Model.StudentList;

/**
 *
 * @author admin
 */
public class StudentManagement extends Menu {

    StudentList bin = new StudentList();
    static String[] menu = {"Create", "Find and Sort", "Update/Delete", "Report", "EXIT"};

    public StudentManagement() {
        super("Search Menu", menu);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                bin.printStudent();
              
                bin.createStudent();
               
                break;
            case 2:
                bin.findAndSortStudents();
                break;
            case 3:
                bin.updateOrDeleteStudent();
                break;
            case 4:
                bin.generateReport();
            case 5:
                System.out.println("Exiting the program.");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choosen. Please try again!!");
        }
    }

}
