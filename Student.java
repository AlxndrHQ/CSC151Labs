import java.text.DecimalFormat;

import jdk.internal.jshell.tool.resources.version;

public class Student {
    private String firstName;
    private String lastName;
    private String message;
    private int score1;
    private int score2;
    private int score3;
    private int average;

    protected final int min = 15;// lowest possible value of random
    protected final int max = 30;// highest possible value of random

    DecimalFormat decimalFormat = new DecimalFormat("###.00");// creates new decimalFormat object

    public Student() {// blank student object
    }

    public Student(String fName, String lName, int s1, int s2, int s3, int newAverage, String newMessage) {
        firstName = fName;
        lastName = lName;
        score1 = s1;
        score2 = s2;
        score3 = s3;
        average = newAverage;
        message = newMessage;
    }

    public Student(String fName, String lName, int s1, int s2, int s3) {
        firstName = fName;
        lastName = lName;
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    public void setNewAttributes(String fName, String lName, int score1, int score2, int score3, int average,
            String message) {
        firstName = fName;
        lastName = lName;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.average = average;
        this.message = message;
    }

    public void reset() {
        firstName = null;
        lastName = null;
        score1 = 0;
        score2 = 0;
        score3 = 0;
        average = 0;
        message = null;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

    public void setLastName(String newName) {
        lastName = newName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setScore1(int newScore) {
        score1 = newScore;
    }

    public void setScore2(int newScore) {
        score2 = newScore;
    }

    public void setScore3() {
        score3 = (int) (Math.random() * (max - min + 1) + min);// range between 15 and 30;
    }

    public int getScore3() {
        return score3;
    }

    public void setScores(int s1, int s2, int s3) {
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    public String getScores() {
        return score1 + ", " + score2 + ", " + score3;
    }

    public void setAverage(int s1, int s2, int s3) {
        average = (s1 + s2 + s3) / 3;
    }

    public int getAverage() {
        return average;
    }

    public void setMessage() {

        /*
         * check an average of 3 scores, and print appropriate information for each
         * average - if average is >= 27, print “Excellence, A” - if average is >=24 but
         * < 27, print “Good, B” - if average is >=19 but < 24, print “Okay, C” -
         * otherwise, print “Need Improvement”
         */

        if (average >= 27) {
            message = "Excellence, A";
        } else if (average >= 24 && average < 27) {
            message = "Good, B";
        } else if (average >= 19 && average < 24) {
            message = "Okay, C";
        } else {
            message = "Needs Improvement";
        }
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        // return firstName + " " + lastName + " " + score1 + "\t" + score2 + "\t" +
        // score3;
        return firstName + " " + lastName + "\t\t" + score1 + ", " + score2 + ", " + score3 + "\t\t\t"
                + decimalFormat.format(average) + "\t\t\t\t" + message;
    }

}