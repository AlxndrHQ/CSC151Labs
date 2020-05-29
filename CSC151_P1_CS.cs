using System;

namespace CSC151_P1_CS
{
    public class CSC151_P1_CS
    {
        public static void main(String[] args)
        {
            /*Read 3 numbers and a String from a keyboard using Scanner class (a, b, r and name) – a and b are integer, r is a double, */
            Console.WriteLine("Enter an integer for a, then b");
            Scanner keyboard = new Scanner(System);// allows user input 
            int a = keyboard.nextInt();
            int b = keyboard.nextInt();

            Console.WriteLine("Enter a double for r");
            double r = keyboard.nextDouble();

            Console.WriteLine("Enter your name:");
            String name = keyboard.nextLine();

            Console.WriteLine(name + " Your entered results were: \n\t" + a + "\n\t" + b + "\n\t" + r);


        }
    }

}