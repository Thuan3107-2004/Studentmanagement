/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Student {
    private int id;
    private String studentName;
    private int semester;
    private String courseName;

    public Student() {
    }

    public Student(int id, String studentName, int semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSemester() {
        return semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentName=" + studentName + ", semester=" + semester + ", courseName=" + courseName + '}';
    }
    
}
