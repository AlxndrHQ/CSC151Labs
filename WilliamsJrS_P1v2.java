
// Full Name: Steven Williams 
// Location Completed: Dining Room 
// Tutor?: N/A

import java.lang.*;// imports math class and all its methods 
import java.util.Scanner;
import java.text.SimpleDateFormat; 

public class WilliamsJrS_P1v2 {
    public static void main(String[] args)
    {
        System.out.println("Fall 2019 -- Program 1 by Steven Williams Jr");
        Scanner keyboard = new Scanner(System.in);// allows user input 

        /*
        Read 3 numbers and a String from a keyboard using Scanner class (a, b, r and
        name) – a and b are integer, r is a double, and name is a String.

        1. create a keyboard object using scanner class
        2. read 3 numbers (2 ints 1 double)
            - a is int
            - b is int 
            - r is double 
        3. read 1 String 
            - name
        */

        int a = 0, b = 0;// stores ints a and b
        double r = 0.0;// stores double r
        String name;// stores name

        

        

        /*
        Ask user to enter their hometown (city and state) in one variable
        ii. Print the hometown in ALL UPPERCASE
        iii. Print the hometown in all lowercase
        iv. Print the last character of hometown in UPPERCASE
        */

        System.out.println("Enter an integer for a");
        a = keyboard.nextInt();

        System.out.println("Enter an integer for b");
        b = keyboard.nextInt();

        System.out.println("Enter a decimal for r");
        r = keyboard.nextDouble();

        System.out.println("Enter your name");
        keyboard.nextLine();// clears buffer
        name = keyboard.nextLine();

        System.out.println( name + ", your values inputs were:"
                            + "\n\ta: " + a 
                            + "\n\tb " + b
                            + "\n\tr " + r
                            );

        int result1 = (int) Math.pow(a, 7) + (5 * 9);// formula for result1
        int result2 = (int) Math.pow(a, 4) - (8 * a * b) + (int) Math.pow(b,5);// formula for result22
        //double result3 = ((2*a − 5)/18) + (((3*b) - 7)/15);// formula for result3
        double result3 = ((2*a - 5)/18) + ((3*b -7)/15);// forumula for result3
        double result4 = (5 * Math.pow(r, 10) + 3) / 9;// formula for result4

        /*
        Calculate 4 results – make sure to use appropriate expression and Math function
        when appropriate.

        result1 = a 7 + 5 * 9 (result1 must be integer)
        result2 = a 4 - 8ab + b 5 (result2 must be integer)
        result3 = ((2a − 5)/18) + ((3b - 7)/15) (make sure that you get decimal points)
        result4 = (5r^10 + 3)/9 (make sure that you get decimal points)
        */

        System.out.println("Your calculated results are: "
                            + "\n\tresult1: " + result1
                            + "\n\tresult2: " + result2
                            + "\n\tresult3: " + result3
                            + "\n\tresult4: " + result4);
        
        System.out.println("Please enter your hometown (City and State): ");
        String hometown = keyboard.nextLine();

        System.out.println("\n\tUpper Case ==> " + hometown.toUpperCase()
                            + "\n\tLower Case ==> " + hometown.toLowerCase()
                            + "\n\tLast character ==> " + hometown.charAt(0));

        System.out.println("Program 1 is completed by " + name);

        /*
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");  
        Date date = new Date();

        System.out.println(formatter.format(date));
        */
        
        keyboard.close();// Closes keyboard 


        
    }
}