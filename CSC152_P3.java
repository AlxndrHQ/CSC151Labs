import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* =================================================================
* CSC 152 Program Assignment 3 – Array, Searching, Sorting
* Semester: Spring 2020 - section
* File Name: CSC152_P3.java
* Purpose: is the driver for sortNsearch.java
================================================================== */

public class CSC152_P3 {
    public static void main(String[] args) throws IOException {

        /* read from file */
        Scanner inputScanner = new Scanner(new File("myIntegerData.txt"));

        /* declare variables */
        final int arrSize = inputScanner.nextInt();// used to determine size of array, first integer is size of array
        int index = 0;// tracker for array index
        int[] myUnsortedIntegers = new int[arrSize];// new array with size of first integer fom file
        int[] myUnsortedIntegers2 = new int[arrSize];
        int[] myUnsortedIntegers3 = new int[arrSize];
        int[] myUnsortedIntegers4 = new int[arrSize];

        /*
         * - [TODO] a. You will use Insertion Sort Algorithm to sort
         * MMM_mySortedIntegers1 Make sure that you print the array before and after
         * sorting as well as including algorithm efficiency for this sorting. - [TODO]
         * b. You will use Selection Sort Algorithm to sort MMM_mySortedIntegers2 Make
         * sure that you print the array before and after sorting as well as including
         * algorithm efficiency for this sorting. - [TODO] c. You will use Bubble Sort
         * Algorithm to sort MMM_mySortedIntegers3 Make sure that you print the array
         * before and after sorting as well as including algorithm efficiency for this
         * sorting.
         */

        /* Run until element is filled to array size */
        while (inputScanner.hasNext() && index < arrSize) {
            myUnsortedIntegers[index] = inputScanner.nextInt();// adds each integer to the array
            myUnsortedIntegers2[index] = myUnsortedIntegers[index];// copies the values from original array to 2nd array
            myUnsortedIntegers3[index] = myUnsortedIntegers[index];
            myUnsortedIntegers4[index] = myUnsortedIntegers[index];
            index++;// increments index
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
        System.out.println("insertion sort efficiency: 0(n^2) ");

        inputScanner.close();// stops reading from inputFile
    }
}