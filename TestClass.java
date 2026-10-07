/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {

    public static void display(String title, Student[] students) {
        System.out.println("=== " + title + " ===");
        System.out.printf("%-10s %-20s %-8s %6s%n", "ID", "Name", "Program", "Grade");
        System.out.println("------------------------------------------------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("202550081", "Roger Lacuarin",    "BSIT", 92.50),
            new Student("202550055", "Carias Jerald",  "BSIT", 85.75),
            new Student("202550088", "KIan Magsayo",       "BSCS", 97.25),
            new Student("202550033", "BenMArk delacerna",   "BSIS", 78.00),
            new Student("202550256", "Jhon MArk",     "BSIT", 88.40),
           
        };

        display("Students Before Sorting", students);

        SortingAlgorithm.sort(students);

        display("Students After Sorting (Highest to Lowest)", students);

        System.out.println("=== Top 3 Students ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Rank " + (i + 1) + ": " + students[i]);
        }
    }
}