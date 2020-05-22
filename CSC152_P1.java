import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSC152_P1 {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(new File("StudentListScores.txt"));// reads file StudentListScores.txt using
                                                                              // Scanner object
        FileWriter fileWriter = new FileWriter("CSC152_P1Output.txt", true);// outputs to CSC152_P1Output.txt, appends
                                                                            // to end
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        /* student variables */
        int numStudents = 0;// counts number of students
        String firstName = null;
        String lastName = null;
        int score1 = 0;
        int score2 = 0;

        /* Prints to console */
        System.out.println("\t\t\t\t\t\tSteven Williams Jr Class\n\n"
                + "Name \t\t\t Scores \t\t\t Average \t\t\t Message\n"
                + "======================================================================================================================");

        /* Prints to CSC152_P1Output.txt */
        printWriter.println("\t\t\t\t\t\tSteven Williams Jr Class\n\n"
                + "Name \t\t\t Scores \t\t\t Average \t\t\t Message\n"
                + "======================================================================================================================");

               
        while (inputScanner.hasNext()) {
            var aStudent = new Student();// creates blank student object

            firstName = inputScanner.next();// holds firstName
            lastName = inputScanner.next();// holds lastName
            score1 = inputScanner.nextInt();// holds score1
            score2 = inputScanner.nextInt();// holds score2
            numStudents++;// adds 1 to number of students

            /* adds attributes to aStudent object */
            aStudent.setFirstName(firstName);
            aStudent.setLastName(lastName);
            aStudent.setScore1(score1);
            aStudent.setScore2(score2);
            aStudent.setScore3();// generates random int between 15 and 30
            // aStudent.setScores(score1, score2, aStudent.getScore3());
            aStudent.setAverage(aStudent.getScore1(), aStudent.getScore2(), aStudent.getScore3());
            aStudent.setMessage();// uses scores to generate message

            /* Printing */
            System.out.println(aStudent.toString());// prints aStudent object to console
            printWriter.println(aStudent.toString());// prints aStudent object to CSC152_P1Output.txt

            /*
             * add two student records (2 lines) at the end of the given data file: one
             * student with your information and another student with your friends
             * information. You can use any scores between 20-30 for score1 and score2.
             */

            while (numStudents >= 7 && numStudents < 9) {
                /* Student 1 */
                aStudent.reset();// resets the aStudent object
                aStudent.setScore3();// generates random integer between 15 and 30
                aStudent.setAverage(27, 21, aStudent.getScore3());// sets new average
                aStudent.setMessage();// runs method to set message
                aStudent.setNewAttributes("Steven", "Alexander", 27, 21, aStudent.getScore3(), aStudent.getAverage(),
                        aStudent.getMessage());
                System.out.println(aStudent.toString());
                printWriter.println(aStudent.toString());

                /* Student 2 */
                aStudent.reset();// resets the aStudent object
                aStudent.setScore3();
                aStudent.setAverage(22, 25, aStudent.getScore3());
                aStudent.setMessage();
                aStudent.setNewAttributes("Brook", "Addisu", 22, 25, aStudent.getScore3(), aStudent.getAverage(),
                        aStudent.getMessage());
                System.out.println(aStudent.toString());
                printWriter.println(aStudent.toString());

                /* Increments */
                numStudents += 2;
            }

            /* Resets values */
            aStudent.reset();
        }

        /* At the end of the program, also print how many Students are in the list. */
        System.out.println("\n\t\t\t\t\t\tThere are " + numStudents + " students in this list. \n");
        printWriter.println("\n\t\t\t\t\t\tThere are " + numStudents + " students in this list. \n");

        inputScanner.close();// closes inputScanner
        printWriter.close();// closes printWriter
    }
}