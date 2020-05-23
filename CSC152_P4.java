
/* Purpose of program: Palindrome checker */

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class CSC152_P4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);// allows keyboard input

        String again = "";// runs checker again
        do {
            Stack<String> stack = new Stack<String>();// creates new stack object to hold words
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);// creates new queue object to hold
                                                                                   // words

            System.out.println("Welcome to Palindrome checker ");

            /* declare variables */
            String[] names = new String[100];// stores names
            int index = 0;// index position for names array
            String word = null;// holds word to be added to stack
            int noTests = 0;// counter for number of tests

            do {
                System.out.println("Type in the word that you'd like to check for a palindrome (Enter Done to stop)");
                word = keyboard.nextLine();
                if (word.equalsIgnoreCase("Done")) {
                    break;
                }
                names[index] = word;// stores word entered into names array
                index++;

                stack.push(word);// adds word to stack
                queue.add(word);// adds word to queue
            } while (!(word.equalsIgnoreCase("done")));

            /*
             * remove an element (one from stack & one from queue), compare if the value is
             * the same (ignore case)
             */
            boolean isPalindrome = false;// flag for palindrome
            while (!(stack.isEmpty())) {
                if (stack.peek().equalsIgnoreCase(queue.peek())) {
                    isPalindrome = true;// true flag for palindrome
                    System.out.println(stack.peek() + " " + queue.peek() + " -- This is a palindrome");
                    stack.pop();// remove one word from stack
                    queue.remove();// remove one word from queue
                } else {
                    System.out.println(stack.peek() + " " + queue.peek() + " -- This is not a palindrome");
                    isPalindrome = false;// keep isPalindrome false
                    stack.pop();// remove one word from stack
                    queue.remove();// remove one word from queue
                }
                noTests++;// counter for number of tests ran
            }

            /* allow the user to repeat the process */
            do {
                System.out.println("Would you like to run the test again? \n\t(only enter yes, no, y, or n)");
                again = keyboard.nextLine();
            } while (!(again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("no") || again.equalsIgnoreCase("n")
                    || again.equalsIgnoreCase("y")));

            System.out.println("You ran " + noTests + " tests");

        } while (!(again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")));

        keyboard.close();// closes keyboard
    }
}