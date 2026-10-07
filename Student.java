/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Student {
    private String studentId;
    private String name;
    private String program;
    private double finalGrade;

    public Student(String studentId, String name, String program, double finalGrade) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.finalGrade = finalGrade;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getProgram() { return program; }
    public double getFinalGrade() { return finalGrade; }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-8s %6.2f",studentId, name, program, finalGrade);
    }
}

 
    


 