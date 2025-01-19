/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu25.student;

/**
 *
 * @author drggf
 */
import java.util.Scanner;

public class Student {
    private int admNo;
    private String sname;
    private float oopMarks;
    private float calculusMarks;
    private float sadMarks;
    private float total;

    // Function to calculate the total marks
    public void calctotal() {
        total = oopMarks + calculusMarks + sadMarks;
    }

    // Function to accept values and calculate total marks
    public void getdata() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Admission Number: ");
        admNo = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter Student Name: ");
        sname = scanner.nextLine();
        
        System.out.print("Enter marks in OOP: ");
        oopMarks = scanner.nextFloat();
        
        System.out.print("Enter marks in Calculus: ");
        calculusMarks = scanner.nextFloat();
        
        System.out.print("Enter marks in SAD: ");
        sadMarks = scanner.nextFloat();

        calctotal();  // Calculate total marks
    }

    // Function to display all data members
    public void displaydata() {
        System.out.println("Admission Number: " + admNo);
        System.out.println("Student Name: " + sname);
        System.out.println("Marks in OOP: " + oopMarks);
        System.out.println("Marks in Calculus: " + calculusMarks);
        System.out.println("Marks in SAD: " + sadMarks);
        System.out.println("Total Marks: " + total);
    }

    // Main method to demonstrate the usage of the Student class
    public static void main(String[] args) {
        Student student = new Student();
        student.getdata();
        student.displaydata();
    }
}
