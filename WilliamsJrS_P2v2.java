import java.util.*;// imports util class

// use a do-while loop to calc new student and their information 

public class WilliamsJrS_P2v2
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);// Allows for user input 
        Stack<WilliamsJrS_Student> stack = new Stack();// make a new ArrayList (initially empty)

        String userYes = "yes";
        do
        {
            System.out.println("Enter your name: ");
            String name = keyboard.nextLine();
    
            System.out.println("Enter your major: ");
            String major = keyboard.nextLine();
    
            System.out.println("Enter your classification: ");
            String classification = keyboard.nextLine();
    
            System.out.println("Enter your GPA: ");
            double GPA = keyboard.nextDouble();
    
            // Create a Student object, called firstStudent_XXX. Pass in appropriate variables
            WilliamsJrS_Student student = new WilliamsJrS_Student(name, major, classification);
            student.changeGPA(GPA);
    
            // Prints out first Student object
            System.out.println("Student 1 information: " + student.toString());

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
            for (Object obj : vals) {
                System.out.println(obj);// prints each item from the stack from first entered to last entered
                stack.pop();// removes each item from stack after it has been printed
            }
        }

        keyboard.close();// closes keyboard object
    }
}