
/* 
Name: Steven Williams Jr
Student ID: 00396725
Location Completed: Personal Laptop @ Home

Description about this file: 

*/
import java.util.*;
import java.text.*;
import java.io.*;

public class WilliamsJrS_P5_Original {
    public static void main(String[] args)// Start Main
            throws IOException {
        Scanner keyboard = new Scanner(System.in);// Creates new scanner object
        Scanner inputFile = new Scanner(new File("WilliamsJr_Scores.txt"));// Reads WilliamsJr_Scores file from .txt
                                                                           // file

        int classTotal = 0;
        double minValue = 2147483647, maxValue = 0;
        double averageTotal = 0, classAverageScore = 0;

        // double averageScore;
        DecimalFormat scoreFormat = new DecimalFormat("###.00");

        System.out.println("========================================================================");
        System.out.println("Name" + "\t\t\t\t\t\tScores" + "\t\t\t\t\tTotal" + "\t\tAvg");
        System.out.println("========================================================================");// Creates Header
                                                                                                       // for .txt file

        while (inputFile.hasNext()) {
            String firstName = inputFile.next();// Grabs first name from .txt file
            // System.out.print(firstName);
            classTotal++;

            String lastName = inputFile.next();// Grabs Lastname from .txt file
            System.out.print(lastName + ", " + firstName);

            int score1 = inputFile.nextInt();
            // double totalScore = 0;
            // totalScore += score1;
            // classTotal++;
            int score2 = inputFile.nextInt();
            // totalScore += score2;
            // classTotal++;
            int score3 = inputFile.nextInt();
            // totalScore += score3;
            // classTotal++;
            int score4 = inputFile.nextInt();
            // totalScore += score4;
            // classTotal++;
            int score5 = inputFile.nextInt();
            // totalScore += score5;
            // classTotal++;

            int totalScore = score1 + score2 + score3 + score4 + score5;

            double averageScore = totalScore / 5.0;
            classAverageScore += averageScore;

            // scoreFormat.format(averageScore);

            if (averageScore > maxValue) {
                maxValue = averageScore;
            }
            if (averageScore < minValue) {
                minValue = averageScore;
            }

            System.out.print("\t\t\t" + score1 + ", " + score2 + ", " + score3 + ", " + score4 + ", " + score5);
            // totalScore = 0;
            System.out.print("\t" + totalScore + "\t" + scoreFormat.format(averageScore) + "\n");
            totalScore = 0;

        }
        System.out.println("========================================================================");
        System.out.println("Class total for a total of " + classTotal + " students");
        System.out.println("\tMin = " + scoreFormat.format(minValue));
        System.out.println("\tMax = " + scoreFormat.format(maxValue));
        double classAverage = classAverageScore / classTotal;
        System.out.println("\tAverage = " + scoreFormat.format(classAverage));
        System.out.println("========================================================================");
        System.out.println("Program completed by Steven Williams Jr, CSC 151 Fall 2019");

    }// end main
}