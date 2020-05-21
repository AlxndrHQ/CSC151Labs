import java.text.DecimalFormat;// import decimal format
import java.util.Scanner;// imports scanner class

public class CSC151_P2
{
    public static void main(String[]args)
    {
        // DecimalFormat desiFormat = new DecimalFormat("##.##");// creates new decimal format object 
        Scanner keyboard = new Scanner(System.in);// Allows for user input 

        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("Enter your major: ");
        String major = keyboard.nextLine();

        System.out.println("Enter your classification: ");
        String classification = keyboard.nextLine();

        System.out.println("Enter your GPA: ");
        double GPA = keyboard.nextDouble();

        // Create a Student object, called firstStudent_XXX. Pass in appropriate variables
        WilliamsJrS_Student firstStudent = new WilliamsJrS_Student(name, major, classification);
        firstStudent.changeGPA(GPA);

        // Prints out first Student object
        System.out.println("Student 1 information: " + firstStudent.toString());



        // Student 2
        System.out.println("\n\n\n***Student 2***");

        System.out.println("Enter your name: ");
        keyboard.nextLine();// clears buffer
        name = keyboard.nextLine();

        System.out.println("Enter your major: ");
        major = keyboard.nextLine();

        System.out.println("Enter your classification: ");
        classification = keyboard.nextLine();

        // inputs student 2's grades
        System.out.println("Enter the grades for Student 2 (A -> 4.0, A- -> 3.7): ");

        System.out.println("\n\tEnglish grade: (3 cr.): ");
        double engGrade = keyboard.nextDouble();// 3 credit hours
        
        System.out.println("\n\tCommunications grade: (3 cr.): ");
        double commGrade = keyboard.nextDouble();// 3 credit hours 
        
        System.out.println("\n\tComputer Science grade: (3 cr.): ");
        double csGrade = keyboard.nextDouble();// 3 credit hours
        
        System.out.println("\n\tMath grade: (4 cr.): ");
        double mathGrade = keyboard.nextDouble();// 4 credit hours 
        
        System.out.println("\n\tHealth grade: (2 cr.): ");
        double healthGrade = keyboard.nextDouble();// 2 credit hours 
        
        System.out.println("\n\tUniversity grade: (1 cr.): ");
        double uniGrade = keyboard.nextDouble();// 1 credit hour



        //Create a second Student object, called secondStudent_XXX. Hard code the appropriate parameters – using your own information.
        WilliamsJrS_Student secondStudent = new WilliamsJrS_Student(name, major, classification);
        secondStudent.calculateGPA(engGrade, commGrade, csGrade, mathGrade, healthGrade, uniGrade);

        System.out.println(secondStudent.getName() + "'s information: " + secondStudent.toString());

        System.out.println("Enter " + secondStudent.getName() + "'s new major: ");
        keyboard.nextLine();// clears buffer
        major = keyboard.nextLine();
        secondStudent.switchMajor(major);

        System.out.println(secondStudent.getName() + "'s updated information: " + secondStudent.toString());
        
        keyboard.close();// closes keyboard object
    }
}