import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CSC151_P5 {
    public static void main(String[] args) throws IOException {

        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");// creates new decimalFormat object

        // declare variables for class
        double classMinScore = 1.7E308;// holds class minimum score
        int[] classMinScoreArray = new int[6];// will hold all lowest values from each student in the class
        double classMaxScore = 1.7E-308;// counter for maximum score
        int[] classMaxScoreArray = new int[6];// will hold all highest values from each student in the class
        double classMinAverageScore = 1.7E308;// holds min average score for class

        double[] classMinAverageScoreArray = new double[6];// creates new array to hold each students min score
        double classMaxAverageScore = 1.7E-308;// stores value for class max score
        double[] classMaxAverageScoreArray = new double[6];// creates new array to hold each students max score
        int classStudentTotal = 0;// counter for total number of students
        double classAverage = 0.0;// calculates the class average

        int classScoreTotal = 0;// counter for total class score
        int classScoreCount = 0;// counter for the total number of scores for the class

        // declare variables for student
        int studentMinScore = 2147483647;// will hold min score. set to highest possible int value
        int studentMaxScore = -2147483648;// will hold max score. set to lowest possible int value
        int i = 0;// counter for nested while loop that will run until inputFile !next

        Scanner inputFile = new Scanner(new File("WilliamsJr_Scores.txt"));// reads the file using the Scanner object
        PrintWriter printWriter = new PrintWriter("WilliamsJrS_P5Output.txt");// prints to a new file

        System.out.println(
                "================================================================================================================================================");
        System.out.println("Name" + "\t\t\t\t\t\tScores" + "\t\t\t\t\tTotal" + "\t\tAvg" + "\t\tMin" + "\t\tMax");
        System.out.println(
                "================================================================================================================================================");// Creates
                                                                                                                                                                    // Header
        printWriter.println(
                "================================================================================================================================================");
        printWriter.println("Name" + "\t\t\t\t\t\tScores" + "\t\t\t\t\tTotal" + "\t\tAvg" + "\t\tMin" + "\t\tMax");
        printWriter.println(
                "================================================================================================================================================");// Creates
                                                                                                                                                                    // Header

        while (inputFile.hasNext()) {
            String firstName = inputFile.next();// grabs the first name from the file
            classStudentTotal++;// adds to the total number of students
            String lastName = inputFile.next();// grabs the last name from the file

            int scoreCount = 0;// counts number of scores for this specific student

            int score1 = inputFile.nextInt();// grabs the first int from the file
            scoreCount++;
            classScoreCount++;// counts total number of scores for the class
            int score2 = inputFile.nextInt();
            scoreCount++;
            classScoreCount++;
            int score3 = inputFile.nextInt();
            scoreCount++;
            classScoreCount++;
            int score4 = inputFile.nextInt();
            scoreCount++;
            classScoreCount++;
            int score5 = inputFile.nextInt();
            scoreCount++;
            classScoreCount++;

            int studentTotalScore = score1 + score2 + score3 + score4 + score5;// calculates totalScore for this student
            double studentAverageScore = studentTotalScore / scoreCount;// divides studentTotalScore by number of scores

            classScoreTotal += studentTotalScore;// adds the studentTotalScore to the classScoreTotal
            classAverage = classScoreTotal / classScoreCount;// sum of each students total score divided by the number
                                                             // of scores from this class

            // finds the minimum score from this students's scores
            do {
                while (score1 < studentMinScore) {
                    studentMinScore = score1;
                }
                while (score2 < studentMinScore) {
                    studentMinScore = score2;
                }
                while (score3 < studentMinScore) {
                    studentMinScore = score3;
                }
                while (score4 < studentMinScore) {
                    studentMinScore = score4;
                }
                while (score5 < studentMinScore) {
                    studentMinScore = score5;
                }
            } while (studentMinScore > score1);

            // adds each minimum score to an array, will be returned which is the lowest
            // number from all students

            // adds each student's average score to array, which will be used to find which
            // student has lowest class average
            classMinAverageScoreArray[i] = studentAverageScore;// adds the students min score to the array
            while (classMinAverageScoreArray[i] < classMinAverageScore) {
                classMinAverageScore = classMinAverageScoreArray[i];
            }

            // adds each student's score to array, which will be used to find which student
            // has lowest score
            classMinScoreArray[i] = studentMinScore;// adds students minimum score to score array
            while (classMinScoreArray[i] < classMinScore) {
                classMinScore = classMinScoreArray[i];
            }

            // finds the maximum score from this students's scores
            do {
                while (score1 > studentMaxScore) {
                    studentMaxScore = score1;
                }
                while (score2 > studentMaxScore) {
                    studentMaxScore = score2;
                }
                while (score3 > studentMaxScore) {
                    studentMaxScore = score3;
                }
                while (score4 > studentMaxScore) {
                    studentMaxScore = score4;
                }
                while (score5 > studentMaxScore) {
                    studentMaxScore = score5;
                }
            } while (studentMaxScore < score1);

            // adds each students maximum score to array, which will be used to find which
            // student has highest class average
            classMaxAverageScoreArray[i] = studentAverageScore;// adds the students max score to the array
            while (classMaxAverageScoreArray[i] > classMaxAverageScore) {
                classMaxAverageScore = classMaxAverageScoreArray[i];
            }

            // adds each students maximum score to array, which will be used to find which
            // student has highest class score
            classMaxScoreArray[i] = studentMaxScore;// adds the students max score to the array
            while (classMaxScoreArray[i] > classMaxScore) {
                classMaxScore = classMaxScoreArray[i];
            }

            /*
             * prints outputs // prints first and last name on same line // prints each
             * individual score // prints the average score of that student // prints the
             * minimum score of that student // prints the maximum score of that student
             */
            System.out.print(firstName + ", " + lastName + "\t\t\t\t" + score1 + ", " + score2 + ", " + score3 + ", "
                    + score4 + ", " + score5 + "\t\t\t\t" + studentTotalScore + "\t\t"
                    + decimalFormat.format(studentAverageScore) + "\t\t" + studentMinScore + "\t\t" + studentMaxScore
                    + "\n");

            printWriter.print(firstName + ", " + lastName + "\t\t\t\t" + score1 + ", " + score2 + ", " + score3 + ", "
                    + score4 + ", " + score5 + "\t\t\t" + studentTotalScore + "\t\t"
                    + decimalFormat.format(studentAverageScore) + "\t\t" + studentMinScore + "\t\t" + studentMaxScore
                    + "\n");

            // resets attributes for student
            scoreCount = 0;// resets score count
            studentTotalScore = 0;// resets studentTotalScore
            studentAverageScore = 0;// resets studentaverageScore count
            studentMinScore = 2147483647;// resets studentMinScore
            studentMaxScore = -2147483648;// resets studentMaxScore
            i++;// adds 1 to i
        }

        System.out.println("Min average score for the class: " + classMinAverageScore);// returns lowest average amongst
                                                                                       // the students
        System.out.println("Max average score for this class: " + classMaxAverageScore);// returns max highest average
                                                                                        // amongst the students
        System.out.println("Min score for the class: " + classMinScore);// returns lowest score in the class
        System.out.println("Max score for the class: " + classMaxScore);// returns highest score in the class
        System.out.println("Average score for this class: " + classAverage);// returns average of the class overall
        System.out.println("Total number of students: " + classStudentTotal);// returns total number of students

        inputFile.close();// closes inputFile
        printWriter.close();// closes printWriter object
    }
}