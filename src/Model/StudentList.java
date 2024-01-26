/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentList {

    public static ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void createStudent() {
        System.out.println("Enter student information:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline
        System.out.print("Course Name (Java, .Net, C/C++): ");
        String courseName = scanner.nextLine();

        Student student = new Student(id, studentName, semester, courseName);
        students.add(student);

        System.out.println("Student created successfully!");
    }

    public ArrayList<Student> searchStudentsByName(String searchName) {
        ArrayList<Student> searchResults = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().toLowerCase().contains(searchName.toLowerCase())) {
                searchResults.add(student);
            }
        }
        return searchResults;
    }

    public void findAndSortStudents() {
        System.out.print("Enter student name or part of student name to search: ");
        String searchName = scanner.nextLine();

        // Tìm kiếm sinh viên theo tên
        ArrayList<Student> searchResults = searchStudentsByName(searchName);

        // Sắp xếp kết quả theo tên sinh viên
        sortStudentsByName(searchResults);

        // Hiển thị kết quả
        System.out.println("Search results:");
        displayStudentList(searchResults);
    }

    public void sortStudentsByName(ArrayList<Student> studentList) {
        Collections.sort(studentList, Comparator.comparing(Student::getStudentName));
    }

    public void updateOrDeleteStudent() {
        System.out.print("Enter student ID to find: ");
        int searchId = scanner.nextInt();

        // Tìm sinh viên theo ID
        Student foundStudent = findStudentById(searchId);

        if (foundStudent == null) {
            System.out.println("Student not found with ID: " + searchId);
            return;
        }

        // Hiển thị thông tin sinh viên và hỏi người dùng muốn cập nhật hay xóa
        System.out.println("Found student:");
        displayStudent(foundStudent);
        System.out.print("Do you want to update (U) or delete (D) this student? ");
        char choice = scanner.next().charAt(0);

        if (choice == 'U' || choice == 'u') {
            // Cập nhật sinh viên
            updateStudent(foundStudent);
        } else if (choice == 'D' || choice == 'd') {
            // Xóa sinh viên
            deleteStudent(foundStudent);
        } else {
            System.out.println("Invalid choice. Returning to main menu.");
        }
    }

    public Student findStudentById(int searchId) {
        for (Student student : students) {
            if (student.getId() == searchId) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student student) {
        System.out.println("Enter new information for student:");
        System.out.print("Student Name: ");
        String newStudentName = scanner.nextLine();
        System.out.print("Semester: ");
        int newSemester = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline
        System.out.print("Course Name (Java, .Net, C/C++): ");
        String newCourseName = scanner.nextLine();

        // Cập nhật thông tin sinh viên
        student.setStudentName(newStudentName);
        student.setSemester(newSemester);
        student.setCourseName(newCourseName);

        System.out.println("Student updated successfully!");
    }

    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    public void generateReport() {
        // Tạo báo cáo và hiển thị
        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println(student.getStudentName() + " | " + student.getCourseName());
        }
    }
      public void printStudent() {
        // Tạo báo cáo và hiển thị
        System.out.println("Student :");
        for (Student student : students) {
         System.out.println("ID: " + student.getId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Semester: " + student.getSemester());
        System.out.println("Course Name: " + student.getCourseName());
        System.out.println("------------------------");
        }
    }

    public  void displayStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            displayStudent(student);
        }
    }

    public  void displayStudent(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Semester: " + student.getSemester());
        System.out.println("Course Name: " + student.getCourseName());
        System.out.println("------------------------");
    }

}
