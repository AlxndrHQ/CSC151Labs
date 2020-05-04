import java.util.Scanner;// imports Scanner class

public class WilliamsJrS_Lab6
{
    public static void main(String[] args)
    {
        // creates new WilliamsJrS_TestScore objects for 5 subjects 
        WilliamsJrS_TestScore math = new WilliamsJrS_TestScore();
        WilliamsJrS_TestScore history = new WilliamsJrS_TestScore();
        WilliamsJrS_TestScore programming = new WilliamsJrS_TestScore();        
        WilliamsJrS_TestScore physics = new WilliamsJrS_TestScore();
        WilliamsJrS_TestScore chemistry = new WilliamsJrS_TestScore();
        
        Scanner keyboard = new Scanner(System.in);// creates new scanner object 

        System.out.println("Enter your math course name, and your grade (Between 0 and 4.0)");
        String courseName = keyboard.nextLine();// stores input for courseName
        double courseScore = keyboard.nextDouble();// stores input for courseScore
        math.setCourseName(courseName);// passes user input for courseName to math object
        math.setCourseScore(courseScore);// passes user input for courseScore to math object

        System.out.println("Enter your history course name, and your grade (Between 0 and 4.0)");
        keyboard.nextLine();// Clears buffer
        courseName = keyboard.nextLine();
        courseScore = keyboard.nextDouble();
        history.setCourseName(courseName);
        history.setCourseScore(courseScore);

        System.out.println("Enter your programming course name, and your grade (Between 0 and 4.0)");
        keyboard.nextLine();// Clears buffer
        courseName = keyboard.nextLine();
        courseScore = keyboard.nextDouble();
        programming.setCourseName(courseName);
        programming.setCourseScore(courseScore);

        System.out.println("Enter your physics course name, and your grade (Between 0 and 4.0)");
        keyboard.nextLine();// Clears buffer
        courseName = keyboard.nextLine();
        courseScore = keyboard.nextDouble();
        physics.setCourseName(courseName);
        physics.setCourseScore(courseScore);

        System.out.println("Enter your chemistry course name, and your grade (Between 0 and 4.0)");
        keyboard.nextLine();// Clears buffer
        courseName = keyboard.nextLine();
        courseScore = keyboard.nextDouble();
        chemistry.setCourseName(courseName);
        chemistry.setCourseScore(courseScore);
        

        // Calculates the student's average for the semester
        double semesterAverage = (math.getCourseScore() + history.getCourseScore() + programming.getCourseScore() + physics.getCourseScore() + chemistry.getCourseScore())/ 5;// adds up all courseScores and divides by 5
        System.out.println("The student's average for the current semester is " + semesterAverage);
    }

}