import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Scanner;

/* Purpose of Program: Palindrome Checker to compare words & Determine 
if the entry is the same word forward as it is backward 
*/
public class CSC152_P4v2 {
    public static void main(String[] args){
        /* Declare Objects */
        Scanner keyboard = new Scanner(System.in);// Allows for user input 
        Stack<String> stack = new Stack<String>();// Stack of Strings 
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);// Queue of Strings
        
        /* Declare Variables */
        String repeat = "";// repeats entire palindrome loop
        String input = "";// adds word to the stack 
        String[] words = new String[100];// holds words entered 
        int index = 0;// used to track position within array 
        int noTests = 0;// counts number of tests ran 

        System.out.println("Welcome to Palindrome checker ");
        
        do {
            do {
                /* As words are entered, added entry to stack and a queue, except "Done" */
                System.out.println("Enter your word into the palindrome checker: (Enter \"Done\" to Stop) ");
                input = keyboard.nextLine();
                    if (input.equalsIgnoreCase("Done")){
                        break;
                    }
                words[index] = input;// stores input into array
                index++;
                stack.add(input);
                queue.add(input);
            } while(!input.equalsIgnoreCase("done"));
                

            /* remove an element (one from stack & one from queue) compare if the value is the same (ignore case). */
            index = 0;
            while (!queue.isEmpty()){
                if (stack.peek().equalsIgnoreCase(queue.peek())) {
                    System.out.println(queue.peek() + " " + stack.peek() + " is a palindrome.");
                    System.out.println(words[index] + " " + words[index + 1] + " is + a palindrome.");
                } else {
                    System.out.println(queue.peek() + " " + stack.peek() + " is not a palindrome.");
                }
                stack.pop();
                queue.remove();
                ++noTests;
            }

            /* allow the user to repeat the process */
            do {
                System.out.println("Would you like to run the test repeat? \n\t(only enter yes, no, y, or n)");
                repeat = keyboard.nextLine();
            } while (!(repeat.equalsIgnoreCase("yes") || repeat.equalsIgnoreCase("no") || repeat.equalsIgnoreCase("n")
                    || repeat.equalsIgnoreCase("y")));

            System.out.println("You ran " + noTests + " tests");
        } while(!(repeat.equalsIgnoreCase("No") || repeat.equalsIgnoreCase("n")));// "NO" (ignore case) stops the input 

        keyboard.close();
    }
}