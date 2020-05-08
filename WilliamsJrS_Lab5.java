import java.util.Scanner;// import scanner class

public class WilliamsJrS_Lab5
{
    public static void main (String[] args)
    {
        //Part A -- Read Input from Keyboard using Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input your name: ");
        //keyboard.nextLine();// clears buffer
        String name = keyboard.nextLine();

        System.out.println("\nInput your age:");
        int age = keyboard.nextInt();

        System.out.println("\nEnter your GPA");
        double gpa = keyboard.nextDouble();

        System.out.println("\nEnter your major");
        keyboard.nextLine();// clears buffer
        String major = keyboard.nextLine();

        System.out.println("\nEnter the number of classes that you are taking: ");
        int noClasses = keyboard.nextInt();

        System.out.println("\nYour name is " + name 
                            + ", your age is " + age
                            + ", your GPA is " + gpa
                            + ", your major is " + major 
                            + ", you are taking " + noClasses + " classes");

        // Part B -- Data Conversion
        byte vByte = 123;
        short vShort = vByte;
        int vInt = vShort;
        long vLong = vInt;
        float vFloat = vLong;
        double vDouble = vFloat;

        // Prints all current values of the above variables
        System.out.println("\nbyte = " + vByte
                            + "\nshort = " + vShort
                            + "\nint = " + vInt
                            + "\nlong = " + vLong
                            + "\nfloat = " + vFloat
                            + "\ndouble = " + vDouble);

        // Casts the values down from highest to lowest
        vDouble = 123.456;
        vFloat = (float)vDouble;
        vLong = (long)vFloat;
        vInt = (int)vLong;
        vShort = (short)vInt;
        vByte = (byte)vShort;
 
        System.out.println("\ndouble = " + vDouble
                            + "\nFloat = " + vFloat
                            + "\nLong = " + vLong
                            + "\nInt = " + vInt
                            + "\nShort = " + vShort
                            + "\nByte = " + vByte);

        // Part C -- String Manipulation
        name = "Steven Alexander";
        String school = "Hampton University";
        
        // prints the values of the variables above
        System.out.println("\n" + name + " attends " + school
                            + "\nMy name contains " + name.length() + " characters including spaces"
                            + "\nMy name in uppercase is " + name.toUpperCase()
                            + "\nMy name in lowercase is " + name.toLowerCase()
                            + "\nMy last name starts with " + name.charAt(name.length() - 9));

        String first = "first", second = "second";
        String myNewString = first.concat(second);

        // Prints first, second, myNewString
        System.out.println("\nfirst: " + first
                            + " \nsecond: " + second
                            + "\nmyNewSting: " + myNewString);
        
        System.out.println("First new String: " + first 
                            + "\nFirst string after replacement: " + first.replace('r', 's'));

        System.out.println("First string before total replacement: " + first
                            + "\nFirst string after total replacement: " + first.replaceAll("first", "newFirst" ));
        
        
        
        // Part D -- Mixed & Matched User Input With Calculation 
        double total, cost, rate, tax;
        System.out.println("\nEnter the cost and rate (in percent)");
        cost = keyboard.nextDouble();
        rate = keyboard.nextDouble();

        tax = (cost * rate);
        total = (cost + tax);
        System.out.println("\nTotal is " + total
                            + " Cost is " + cost
                            + ", the rate is " + rate
                            + " and the tax is " + tax);
        
        final double MORGAGE_RATE = 0.045;

        System.out.println("\nEnter your loan amount");
        double loanAmount = keyboard.nextDouble();
        double result2 = MORGAGE_RATE * loanAmount;

        // Prints all values from most recent variables
        System.out.println("\nYour loan amount was " + loanAmount
                            + ". \nAs a result, you will pay $" + result2 + " in interest over the life of the loan");
        
        keyboard.close();// Closes keyboard 
    }
}