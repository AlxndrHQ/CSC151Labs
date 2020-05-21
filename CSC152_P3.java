import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/* =================================================================
* CSC 152 Program Assignment 3 – Array, Searching, Sorting
* Semester: Spring 2020 - section
* File Name: CSC152_P3.java
* Purpose: is the driver for sortNsearch.java
================================================================== */

public class CSC152_P3 {
    public static void main(String[] args) throws Exception {

        try {
            /* read from file */
            Scanner inputScanner = new Scanner(new File("myIntegerData.txt"));
            Scanner keyboard = new Scanner(System.in);// allows keyboard input

            /* declare variables */
            final int arrSize = inputScanner.nextInt();// used to determine size of array, first integer is size of
                                                       // array
            int index = 0;// tracker for array index
            int count = 0;// tracker for # of elements in UnfilledArray
            int[] myUnsortedIntegers = new int[arrSize];// new array with size of first integer fom file
            int[] myUnsortedIntegers2 = new int[arrSize];
            int[] myUnsortedIntegers3 = new int[arrSize];
            int[] myUnsortedIntegers4 = new int[arrSize];
            int[] unfilledArray = new int[arrSize * 2];// new array 2x size of original array
            int userTarget = 0;// used for user's target value
            int position = -1;// used to hold position of users value
            int nextDelete = -1;// holds element to delete next
            String userSearch = null;// records users searching selection
            String userArray = null;// records users array selection
            String again = "";// used to run program again

            /* Run until element is filled to array size */
            while (inputScanner.hasNext() && index < arrSize) {
                myUnsortedIntegers[index] = inputScanner.nextInt();// adds each integer to the array
                index++;// increments index
            }

            /* Copy elements from original unsorted array to new arrays */
            for (index = 0; index < arrSize; index++) {
                myUnsortedIntegers2[index] = myUnsortedIntegers[index];
                myUnsortedIntegers3[index] = myUnsortedIntegers[index];
                myUnsortedIntegers4[index] = myUnsortedIntegers[index];
                unfilledArray[index] = myUnsortedIntegers[index];// fills half of new array
                count++;
            }

            /* Print myUnsortedIntegers2 before insertion sort */
            System.out.println("myUnsortedIntegers2 Before: ");
            for (int print : myUnsortedIntegers2)
                System.out.print(print + " ");

            /* Sort myUnsortedIntegers2 using IntInsertionSort Algo */
            SortAndSearch.IntInsertionSort(myUnsortedIntegers2);

            /* Print myUnsortedIntegers2 afer insertion sort */
            System.out.println("\nmyUnsortedIntegers2 After: ");
            for (int print : myUnsortedIntegers2)
                System.out.print(print + " ");

            /* Print insertion sort efficiency */
            System.out.println("\ninsertion sort efficiency: 0(n^2) ");

            /* Print myUnsortedIntegers3 before selection sort */
            System.out.println("myUnsortedIntegers3 Before: ");
            for (int print : myUnsortedIntegers3)
                System.out.print(print + " ");

            /* Sort myUnsortedIntegers3 using IntSelectionSort Algo */
            SortAndSearch.IntSelectionSort(myUnsortedIntegers3);

            /* Print myUnsortedIntegers2 afer selection sort */
            System.out.println("\nmyUnsortedIntegers3 After: ");
            for (int print : myUnsortedIntegers3)
                System.out.print(print + " ");

            /* Print selection sort efficiency */
            System.out.println("\nselection sort efficiency: 0(n^2) ");

            /* Print myUnsortedIntegers4 before bubble sort */
            System.out.println("myUnsortedIntegers4 Before: ");
            for (int print : myUnsortedIntegers4)
                System.out.print(print + " ");

            /* Sort myUnsortedIntegers4 using IntBubbleSort Algo */
            SortAndSearch.IntBubbleSort(myUnsortedIntegers4);

            /* Print myUnsortedIntegers2 afer selection sort */
            System.out.println("\nmyUnsortedIntegers4 After: ");
            for (int print : myUnsortedIntegers4)
                System.out.print(print + " ");

            /* Print selection sort efficiency */
            System.out.println("\nBubble sort efficiency: 0(n^2) ");

            /* Reset Arrays: Copy elements from original unsorted array to new arrays */
            for (index = 0; index < arrSize; index++) {
                myUnsortedIntegers2[index] = myUnsortedIntegers[index];
                myUnsortedIntegers3[index] = myUnsortedIntegers[index];
                myUnsortedIntegers4[index] = myUnsortedIntegers[index];
            }

            do {
                /* create a menu that will ask the user which search algorithm */
                System.out.println("Which searching algorithm would you like to use?" + "\n\t(A) for Sequential Search"
                        + "\n\tor" + "\n\t(B) for Binary Search");

                userSearch = keyboard.nextLine();// records users searching selection
                while (!(userSearch.equalsIgnoreCase("A") || userSearch.equalsIgnoreCase("B"))) {
                    System.out.println("Enter only \"A\" or \"B\"");
                    userSearch = keyboard.nextLine();
                }

                if (userSearch.equalsIgnoreCase("A")) {
                    /* give them 4 sorted arrays for user to choose from */
                    System.out.println("You have 4 arrays to choose from: ");

                    System.out.println("\nArray 1: myUnsortedIntegers ");
                    for (int print : myUnsortedIntegers)
                        System.out.print(print + " ");
                    System.out.println("\nArray 2: myUnsortedIntegers2 ");
                    for (int print : myUnsortedIntegers2)
                        System.out.print(print + " ");
                    System.out.println("\nArray 3: myUnsortedIntegers3 ");
                    for (int print : myUnsortedIntegers3)
                        System.out.print(print + " ");
                    System.out.println("\nArray 4: myUnsortedIntegers4 ");
                    for (int print : myUnsortedIntegers4)
                        System.out.print(print + " ");

                    System.out.println("\nWhich array would you like? (Type array name, array number, or A-D) ");
                    userArray = keyboard.nextLine();
                    while (!(userArray.equalsIgnoreCase("Array 1") || userArray.equalsIgnoreCase("Array 2")
                            || userArray.equalsIgnoreCase("Array 3") || userArray.equalsIgnoreCase("Array 4")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers2")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers3")
                            || userArray.equalsIgnoreCase("myUnsortedInteger4") || userArray.equalsIgnoreCase("A")
                            || userArray.equalsIgnoreCase("B") || userArray.equalsIgnoreCase("C")
                            || userArray.equalsIgnoreCase("D"))) {
                        System.out.println("\nType either array name, array number, or A-D");
                        userArray = keyboard.nextLine();
                    }
                }
                if (userSearch.equalsIgnoreCase("B")) {
                    /* give them only 3 sorted arrays for user to choose from */
                    System.out.println("You have 3 arrays to choose from: ");

                    System.out.println("\nArray 2: myUnsortedIntegers2 ");
                    for (int print : myUnsortedIntegers2)
                        System.out.print(print + " ");
                    System.out.println("\nArray 3: myUnsortedIntegers3 ");
                    for (int print : myUnsortedIntegers3)
                        System.out.print(print + " ");
                    System.out.println("\nArray 4: myUnsortedIntegers4 ");
                    for (int print : myUnsortedIntegers4)
                        System.out.print(print + " ");

                    System.out.println("\nWhich array would you like? (Type array name, array number, or A-C) ");
                    userArray = keyboard.nextLine();
                    while (!(userArray.equalsIgnoreCase("1") || userArray.equalsIgnoreCase("2")
                            || userArray.equalsIgnoreCase("3") || userArray.equalsIgnoreCase("4")
                            || userArray.equalsIgnoreCase("Array 2") || userArray.equalsIgnoreCase("Array 3")
                            || userArray.equalsIgnoreCase("Array 4")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers2")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers3")
                            || userArray.equalsIgnoreCase("myUnsortedInteger4") || userArray.equalsIgnoreCase("A")
                            || userArray.equalsIgnoreCase("B") || userArray.equalsIgnoreCase("C"))) {
                        System.out.println("\nType either array name, array number, or A-D");
                        userArray = keyboard.nextLine();
                    }
                }

                /* ask the user to enter a target value. */
                System.out.println("Enter a target value (integer): ");
                try {
                    userTarget = keyboard.nextInt();
                } catch (NumberFormatException e) {
                    System.out.println("Enter only an integer");
                    userTarget = keyboard.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter only an integer");
                    userTarget = keyboard.nextInt();
                }

                /*
                 * Based on search results, print if the search value is found in this array. If
                 * found, tell the location/position that it is found in the array.
                 */

                /* Case: user chose sequential search */
                if (userSearch.equalsIgnoreCase("A")) {
                    /* Case: user chose array 1 */
                    if (userArray.equalsIgnoreCase("1") || userArray.equalsIgnoreCase("array1")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers") || userArray.equalsIgnoreCase("A")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers, userTarget);// stores position
                                                                                                     // of
                                                                                                     // users target
                                                                                                     // value
                    }
                    /* Case: user chose array 2 */
                    if (userArray.equalsIgnoreCase("2") || userArray.equalsIgnoreCase("array2")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers2") || userArray.equalsIgnoreCase("B")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers2, userTarget);
                    }
                    /* Case: user chose array 3 */
                    if (userArray.equalsIgnoreCase("3") || userArray.equalsIgnoreCase("array3")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers3") || userArray.equalsIgnoreCase("C")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers3, userTarget);
                    }
                    /* Case: user chose array 4 */
                    if (userArray.equalsIgnoreCase("4") || userArray.equalsIgnoreCase("array4")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers4") || userArray.equalsIgnoreCase("D")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers4, userTarget);
                    }
                }

                /* Case: user chose binary search */
                if (userSearch.equalsIgnoreCase("B")) {
                    /* Case: user chose array 2 */
                    if (userArray.equalsIgnoreCase("2") || userArray.equalsIgnoreCase("array2")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers2") || userArray.equalsIgnoreCase("B")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers2, userTarget);
                    }
                    /* Case: user chose array 3 */
                    if (userArray.equalsIgnoreCase("3") || userArray.equalsIgnoreCase("array3")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers3") || userArray.equalsIgnoreCase("C")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers3, userTarget);
                    }
                    /* Case: user chose array 4 */
                    if (userArray.equalsIgnoreCase("4") || userArray.equalsIgnoreCase("array4")
                            || userArray.equalsIgnoreCase("myUnsortedIntegers4") || userArray.equalsIgnoreCase("D")) {
                        position = SortAndSearch.IntSequentialSearch(myUnsortedIntegers4, userTarget);
                    }
                }
                if (position == -1) {
                    System.out.println("Your target value was not found in the array");
                } else {
                    System.out.println("Your target value was found at position: " + position);
                }

                /* run test again? */
                System.out.println("Would you like to run the test again? (Enter \"NO\" to stop)");
                again = keyboard.nextLine();

                while (!(again.equalsIgnoreCase("Yes") || again.equalsIgnoreCase("No"))) {
                    System.out.println("Enter only a yes or a no.");
                    again = keyboard.nextLine();
                }

            } while (again.equalsIgnoreCase("YES"));

            System.out.println("\nPrintng unfilledArray (10 items for line):");
            int j = 0;// tracker for when to add new line
            for (int element : unfilledArray) {// prints 10 items for line
                System.out.print(element + " ");
                j++;
                if (j == 10) {
                    System.out.println("");// adds new line
                    j = 0;// resets j
                }
            }
            System.out.println("\nPrintng unfilledArray (5 items for line, only elements with values):");
            for (int i = 0; i < unfilledArray.length - 1; i++) {// prints 5 items per line
                if (unfilledArray[i] == 0) {
                    break;
                }
                System.out.print(unfilledArray[i] + " ");// print each element
                j++;
                if (j == 5) {
                    System.out.println();// adds new line
                    j = 0;// resets j
                }
            }

            /* user to enter 4 integers and you will add them to UnfilledArray */
            count = 4;// counts number of additional integers needed to fill array
            int additional = 0;
            while (count > 0) {
                System.out.println("Enter " + count + " more integers to add to the unfilled array (no zeros)");
                additional = keyboard.nextInt();

                /* input cannot be 0 */
                while (additional == 0) {
                    System.out.println("Enter another number that isnt 0");
                    additional = keyboard.nextInt();
                }
                unfilledArray[index] = additional;
                count--;
                index++;
            }

            System.out.println("\nPrintng unfilledArray (After adding 4 items, only elements with values):");
            j = 0;// reset new line tracker
            for (int i = 0; i < unfilledArray.length - 1; i++) {// runs for length of unfilledArray
                if (unfilledArray[i] == 0) {
                    break;
                }
                System.out.print(unfilledArray[i] + " ");// print each element
                j++;
                if (j == 5) {// only 5 elements per line
                    System.out.println();// adds new line
                    j = 0;// resets new line tracker
                }

            }

            /* Print the 4th element value in unfilledArray (subscript index 3) */
            System.out.println("\nPrintng 4th element in unfilledArray: " + unfilledArray[3]);

            /*
             * step through the array, shift every element after index 3 down 1 (Delete 4th
             * element)
             */
            for (index = 3; index < unfilledArray.length; index++) {
                try {
                    unfilledArray[index] = myUnsortedIntegers[index + 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }

            }
            /*
             * Print new unfilled array with 4th element removed, only 5 elements per line
             */
            System.out.println("\nPrintng unfilledArray with 4th element removed: ");
            j = 0;
            for (int i = 0; i < unfilledArray.length - 1; i++) {// runs for length of unfilledArray
                if (unfilledArray[i] == 0) {
                    break;
                }
                System.out.print(unfilledArray[i] + " ");// print each element
                j++;
                if (j == 5) {// only 5 elements per line
                    System.out.println();// adds new line
                    j = 0;// resets new line tracker
                }
            }

            /* Reset unfilledArray: Copy elements from original unsorted array to unfilledArray */
            for (index = 0; index < myUnsortedIntegers.length; index++) {
                unfilledArray[index] = myUnsortedIntegers[index];
            }

            /* Ask what element to delete next (Their first element is 1, not zero) */
            System.out.println(
                    "\nEnter which index would you like to delete next: (Positive integer only, must not be larger than the array length)");
            nextDelete = keyboard.nextInt();
            while (nextDelete < 0 || nextDelete > unfilledArray.length) {
                System.out.println("Enter a positive integer only, must not be larger than the array length");
                nextDelete = keyboard.nextInt();
            }
            System.out.println("\nYou selected the " + nextDelete + " index in unfilledArray, which is: "
                    + unfilledArray[nextDelete]);

            /* shift every element after index nextDelete down 1 */
            for (index = nextDelete; index < unfilledArray.length; index++) {
                try {
                    unfilledArray[index] = myUnsortedIntegers[index + 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }

            }

            /* Print unfilledArray with nextDelete index removed, count # filled elements */
            System.out.println("\nPrintng unfilledArray with " + nextDelete + " element removed: ");
            count = 0;
            for (int i = 0; i < unfilledArray.length - 1; i++) {// runs for length of unfilledArray
                if (unfilledArray[i] == 0) {
                    break;
                }
                System.out.print(unfilledArray[i] + " ");// print each element
                count++;
            }
            System.out.println("\nThere are " + count + " elements filled");

            keyboard.close();// closes keyboard object
            inputScanner.close();// stops reading from inputScanner

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
