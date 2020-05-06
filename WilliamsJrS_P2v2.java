import java.util.*;// imports util class

/* next iteration: 
random String generator for name, major, class, 
& random number generator for grades
*/

public class WilliamsJrS_P2v2
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);// Allows for user input 
        Stack<WilliamsJrS_Student> stack = new Stack();// make a new stack (initially empty)

        String userYes = "yes";
        do
        {
            System.out.println("Enter your name: ");
            String name = keyboard.nextLine();
    
            System.out.println("Enter your major: ");
            String major = keyboard.nextLine();
    
            System.out.println("Enter your classification: ");
            String classification = keyboard.nextLine();
    
            //System.out.println("Enter your GPA: ");
            //double GPA = keyboard.nextDouble();

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
    
            // Create a Student object, called firstStudent_XXX. Pass in appropriate variables
            WilliamsJrS_Student student = new WilliamsJrS_Student(name, major, classification);
            // student.changeGPA(GPA);
            student.calculateGPA(engGrade, commGrade, csGrade, mathGrade, healthGrade, uniGrade);

    
            // Prints out first Student object
            System.out.println(student.getName() + "'s information: " + student.toString());

            System.out.println("Would you like to run the test again?");
            keyboard.nextLine();// clears buffer
            userYes = keyboard.nextLine();

            stack.add(student);
        
        } while (userYes.equalsIgnoreCase("yes"));

        while (!(stack.isEmpty()))
        {
            //System.out.println(stack.pop());// removes and prints each item from the stack

            // method 2:
            Object[] vals = stack.toArray();
            for (Object obj : vals) 
            {
                System.out.println(obj);// prints each item from the stack from first entered to last entered
                stack.pop();// removes each item from stack after it has been printed
            }
        }

        keyboard.close();// closes keyboard object
    }
}