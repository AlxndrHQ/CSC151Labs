import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WilliamsJrS_P5v2 {
    public static void main(String[] args) throws IOException {
        // reads names from file "WilliamsJr_Scores.txt"
        Scanner inputFile = new Scanner(new File("WilliamsJr_Scores.txt"));// reads the file using the Scanner object
        PrintWriter printWriter = new PrintWriter("WilliamsJrS_P5Outputv2.txt");// prints to a text file

        // formats decimals
        DecimalFormat decimalFormat = new DecimalFormat("###.00");

        /* class variables */
        int[] classScoreArr = new int[6];// holds lowest score for all 5 students
        int classMinScore = 1000;// holds lowest score in class
        int classMaxScore = -1000;// used to hold highest score in class

        int[] classAverageArr = new int[6];// holds average score for all 5 students
        int classMinAverageScore = 1000;// holds lowest average score in class
        int classMaxAverageScore = -1000;// holds highest average score in class

        double classAverageScore = 0.0;// holds class average score
        int i = 0;// used to count number of iterations for while loop

        /* student variables */
        int numStudents = 0;// counter for number of students

        /* Creates Header */
        System.out.println(
                "================================================================================================================================================");
        System.out.println("Name" + "\t\t\t\t\t\tScores" + "\t\t\t\t\tTotal" + "\t\tAvg" + "\t\tMin" + "\t\tMax");
        System.out.println(
                "================================================================================================================================================");

        /* Prints to a file */
        printWriter.println(
                "================================================================================================================================================");
        printWriter.println("Name" + "\t\t\t\t\t\tScores" + "\t\t\t\t\tTotal" + "\t\tAvg" + "\t\tMin" + "\t\tMax");
        printWriter.println(
                "================================================================================================================================================");

        /* read name, and score from file for each student */
        while (inputFile.hasNext())// while there is another name to read
        {
            String firstName = inputFile.next();// stores first name
            String lastName = inputFile.next();// stores last name
            numStudents++;// adds 1 to total number of students

            int score1 = inputFile.nextInt();// stores first int
            int score2 = inputFile.nextInt();
            int score3 = inputFile.nextInt();
            int score4 = inputFile.nextInt();
            int score5 = inputFile.nextInt();

            int numScores = 5;// counts number of scores for the student 5 because there are 5 scores

            // calculate the quiz total and average for each student
            int studentTotalScore = score1 + score2 + score3 + score4 + score5;// adds all the students scores together
            int studentAverage = studentTotalScore / numScores;// calculates the students average

            // adds onto class average score (will be calculated later)
            classAverageScore += studentTotalScore;

            /*
             * [Task]: calculate the class min score, max score, & average score [Task]:
             * Before calculating class min score || max score || average score, we need the
             * min max and average for each individual student
             */
            int studentMinScore = 1000;// holds students min score, initalized high to be used in while loop
            while (studentMinScore > score1) {// will determine studentMinScore
                while (studentMinScore > score1) {
                    studentMinScore = score1;
                }
                while (studentMinScore > score2) {
                    studentMinScore = score2;
                }
                while (studentMinScore > score3) {
                    studentMinScore = score3;
                }
                while (studentMinScore > score3) {
                    studentMinScore = score3;
                }
                while (studentMinScore > score4) {
                    studentMinScore = score4;
                }
                while (studentMinScore > score5) {
                    studentMinScore = score5;
                }
            }

            /* find class min score */
            classScoreArr[i] = studentMinScore;
            while (classScoreArr[i] < classMinScore) {
                classMinScore = classScoreArr[i];// assigns the current students lowest score to the class' lowest
                                                 // score
            }

            /* find classMinAveragScore && classMaxAverageScore */
            classAverageArr[i] = studentAverage;// stores current student average score in array
            while (classAverageArr[i] < classMinAverageScore) {
                classMinAverageScore = classAverageArr[i];// assigns the current average to the lowest class average
            }
            while (classAverageArr[i] > classMaxAverageScore) {
                classMaxAverageScore = classAverageArr[i];// assigns the current average to the highest class average
            }

            /* find student max score */
            int studentMaxScore = -1000;// will hold studentMaxScore, initalized low
            while (studentMaxScore < score1) {// finds students max score
                while (studentMaxScore < score1) {
                    studentMaxScore = score1;
                }
                while (studentMaxScore < score2) {
                    studentMaxScore = score2;
                }
                while (studentMaxScore < score3) {
                    studentMaxScore = score3;
                }
                while (studentMaxScore < score4) {
                    studentMaxScore = score4;
                }
                while (studentMaxScore < score5) {
                    studentMaxScore = score5;
                }
            }

            /* find class max score */
            classScoreArr[i] = studentMaxScore;// assigns current student's max score to the array
            while (classScoreArr[i] > classMaxScore) {// used to determine highest score from the class
                classMaxScore = classScoreArr[i];// assigns this students max score to the class' max score
            }

            /* Prints students attributes */
            System.out.println(firstName + " " + lastName + "\t\t\t\t" + +score1 + ", " + score2 + ", " + score3 + ", "
                    + score4 + ", " + score5 + "\t\t\t\t" + studentTotalScore + "\t\t"
                    + decimalFormat.format(studentAverage) + "\t\t" + studentMinScore + "\t\t" + studentMaxScore);
            printWriter.println(firstName + " " + lastName + "\t\t\t\t" + +score1 + ", " + score2 + ", " + score3 + ", "
                    + score4 + ", " + score5 + "\t\t\t\t" + studentTotalScore + "\t\t"
                    + decimalFormat.format(studentAverage) + "\t\t" + studentMinScore + "\t\t" + studentMaxScore);

            /* reset variables */
            studentMaxScore = -1000;
            studentMinScore = 1000;
            studentAverage = 0;
            studentTotalScore = 0;
            i++;// adds 1 to i, used in the next iteration
        }

        classAverageScore /= numStudents;// calculates classAverageScore

        /*
         * // print classMinScore // Print classMaxScore // Print class min average
         * score (lowest students average) // Print class max average score (highest
         * students average) // Print class average score (all students average) //
         * Print total number of students in class
         */
        System.out.println(
                "================================================================================================================================================");
        System.out.println("Class statistics for a total of " + numStudents + " students." + "\n\tClass Min Score: "
                + classMinScore + "\n\tClass Max Score: " + classMaxScore + "\n\tClass Min Average Score: "
                + decimalFormat.format(classMinAverageScore) + "\n\tClass Max Average Score: "
                + decimalFormat.format(classMaxAverageScore) + "\n\tClass Average Score: "
                + decimalFormat.format(classAverageScore) + "\n\tTotal Number of Students: " + numStudents);
        System.out.println(
                "================================================================================================================================================");
        System.out.println("Program Completed by Steven Alexander, CSC 151, ");

        printWriter.println(
                "================================================================================================================================================");
        printWriter.println("Class statistics for a total of " + numStudents + " students." + "\n\tClass Min Score: "
                + classMinScore + "\n\tClass Max Score: " + classMaxScore + "\n\tClass Min Average Score: "
                + decimalFormat.format(classMinAverageScore) + "\n\tClass Max Average Score: "
                + decimalFormat.format(classMaxAverageScore) + "\n\tClass Average Score: "
                + decimalFormat.format(classAverageScore) + "\n\tTotal Number of Students: " + numStudents);
        printWriter.println(
                "================================================================================================================================================");
        printWriter.println("Program Completed by Steven Alexander, CSC 151,");

        inputFile.close();// closes inputFile
        printWriter.close();// closes printWriter
    }
}