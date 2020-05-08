import java.util.Scanner;// import Scanner class

public class WilliamsJrS_Lab3
{
    public static void main(String[] args)
    {
        double x, y, z; 
        x = 0.0;
        y = 9.0;
        z = 0.6;

        int i, j, k;
        i = 15;
        k = 7;
        j = 15;

        x += 5;
        y -= y;
        z *= 5;
        i /= k;
        j %= k;

        System.out.println("Part A: \"Combined Assignment Operators\"");
        System.out.println("\nx = " + x + ", y = " + y + ", z = " + z + " \ni = " + i + ", j = " + j);

        // Part B -- Primitive Data Types
        byte byteLow = -128;
        byte byteHigh = 127;
        System.out.println("The range of a byte variable is from " + byteLow + " to " + byteHigh);

        short shortLow = -32768;
        short shortHigh = 32767;
        System.out.println("The range of a short variable is from " + shortLow + " to " + shortHigh);


        int intLow = -2147483648;
        int intHigh = 2147483647;
        System.out.println("The range of a integer variable is from " + intLow + " to " + intHigh);


        long longLow = -9223372036854775808L;
        long longHigh = 9223372036854775807L;
        System.out.println("The range of a long variable is from " + longLow + " to " + longHigh);


        float floatLow = -3.4E-38F;
        float floatHigh = 3.4E38F;
        System.out.println("The range of a float variable is from " + floatLow + " to " + floatHigh);


        double doubleLow = 1.7E-308;
        double doubleHigh = 1.7E308;
        System.out.println("The range of a double variable is from " + doubleLow + " to " + doubleHigh);

        boolean booleanTrue = true;
        boolean booleanFalse = false;
        System.out.println("Boolean Data Types can be either " + booleanTrue + " or " + booleanFalse);

        char charA = 6510;
        char charZ = 9010;
        System.out.println("Uppercase Alphabet runs from " + charA + " to " + charZ);

        
        // Part B -- Instantiate and use a Scanner object 
        Scanner keyboard = new Scanner(System.in);// Creates new Scanner object 

        System.out.println("Enter your first, then last name: ");
        String firstName = keyboard.nextLine();
        String lastName = keyboard.nextLine();
        String myFullName = firstName + " " +lastName; 


        System.out.println("Your full name is " + myFullName);

        System.out.println("Enter your university: ");
        String university = keyboard.nextLine();
        System.out.println("Your university is:  " + university);

        String nameSchool = myFullName + " attends " + university;
        System.out.println(nameSchool);

        System.out.println("Enter your first name: ");
        firstName = keyboard.nextLine();

        System.out.println("Enter your favorite number  ");
        int favNum = keyboard.nextInt();
        System.out.println(firstName + "'s favorite number is: " + favNum);



        //Part D -- String Manipulation
        //String name = "Steven Alexander", school = "Hampton University";
        System.out.println(myFullName + " attends " + university);

        int size = myFullName.length();
        String nameU = myFullName.toUpperCase();
        String nameL = myFullName.toLowerCase();
        char firstLetter = myFullName.charAt(0), lastLetter = myFullName.charAt(myFullName.length()-1);

        System.out.println(myFullName + " attends " + university);
        System.out.println("My name contains " + size + " characters including spaces");
        System.out.println("My name in uppercase is " + nameU);
        System.out.println("My name in lowercase is " + nameL);
        System.out.println("My last name begins with " + firstLetter);

        String first = "first", second = "second";
        String myNewString = first.concat(second);
        System.out.println(first + " " + second + " " + myNewString);
        
        System.out.println("Before replacement: " + first + " after replacement: " + first.replace('r', 'i'));
        
        keyboard.close();// Closes keyboard 
    }
}