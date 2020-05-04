// name
// Location where this file was completed
// Tutors?

import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat; 


public class WiilliamsJrS_P1
{
    public static void main
    {
        System.out.println("Fall 2019 -- Program 1 by Steven Williams Jr");

        // Creates new Scanner object for keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer for a: ");
        int a = keyboard.nextInt();

        System.out.println("Enter an integer for b: ");
        int b = keyboard.nextInt();

        System.out.println("Enter a decimal for r: ");
        double r = keyboard.nextDouble();

        System.out.println("Enter your name: ");
        keyboard.nextLine();// Clears Buffer
        String name = keyboard.nextLine();

        System.out.println(name + ", your inputs were: "
                            + "\n\ta = " + a 
                            + "\n\tb = " + b 
                            + "\n\tr = " + r 
                            ); 
                            
        int result1 = (int) ((Math.pow(a, 7)) + 5 * 9);
        int result2 = (int) ((Math.pow(a, 4)) - 8 * a * b + (Math.pow(b, 5)));
        double result3 = ((2*a - 5)/18) + ((3*b -7)/15);
        double result4 = ((5 * Math.pow(r, 10) + 3)/ 9); 
                            
        System.out.println("Calculated results were: "
                            + "\n\tresult1 = " + result1
                            + "\n\tresult2 = " + result2
                            + "\n\tresult3 = " + result3
                            + "\n\tresult4 = " + result4
                            );

        System.out.println("Please enter your hometown (City and State): ");
        keyboard.nextLine();// clears buffer
        String hometown = keyboard.nextLine();

        System.out.println(name + ", your hometown is " + hometown);
        System.out.println("Upper Case ==> " + hometown.toUpperCase());
        System.out.println("Lower Case ==> " + hometown.toLowerCase());
        System.out.println("Last character of your hometown is " + hometown.charAt(hometown.length() - 1));

        System.out.println("Program 1 is completed by Steven Alexander ");

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");  
        Date date = new Date();

        System.out.println(formatter.format(date));
    }
}