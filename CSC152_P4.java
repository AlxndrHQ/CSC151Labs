
/* Purpose of program: Palindrome checker */

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CSC152_P4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);// allows keyboard input

        
        String again = "";// runs checker again 
        do{
            Stack<String> stack = new Stack<String>();// creates new stack object to hold words
        // Queue<String> queue = new Queue<String>();// creates new queue object to hold words

        String word = null;
        do {
            System.out.println("Type in the word that you'd like to check for a palindrome (Enter Done to stop)");
            word = keyboard.nextLine();
            if (word.equalsIgnoreCase("Done")){
                break;
            }
            
            stack.add(word);// adds word to stack 
            // queue.add(word);// adds word to queue

        } while (!(word.equalsIgnoreCase("done")));

        /*Then as you removing an element out one from stack and one from queue, you will compare if the value is the same (ignore case) */
        boolean isPalindrome = false;
        while(!(stack.isEmpty())){
            String check = stack.peek();
            if (check.equalsIgnoreCase(word)){
                isPalindrome = true;// true flag for palindrome
                break;
            }
            stack.pop();// remove one word from stack

        }
        /* allow the user to repeat the process */
        do {
            System.out.println("Would you like to run the test again? \n\t(only enter yes, no, y, or n)");
            again = keyboard.nextLine();
        } while(!(again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("no") || again.equalsIgnoreCase("n") || again.equalsIgnoreCase("y")));

        

        } while (!(again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")));
        

        keyboard.close();// closes keyboard
    }
}