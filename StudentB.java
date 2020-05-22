import java.text.DecimalFormat;// import decimal format

public class StudentB {
    DecimalFormat desiFormat = new DecimalFormat("##.##");// creates new decimal format object

    private String firstName;
    private String lastName;
    private String message;

    private double average;

    private int score1;
    private int score2;
    private int score3;

    public Student() {
        // creates empty student object
    }

    public Student(String aName, String aMajor, String aClass) {
        name = aName;
        major = aMajor;
        classification = aClass;
    }

    public String toString() {
        return firstName + " " + lastName + "\t" + score1 + ", " + score2 + ", " + score3 + "\t\t\t" + average
                + "\t\t\t" + message;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newName) {
        lastName = newName;
    }

    /**
     * @return double return the average
     */
    public double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(int s1, int s2, int s3) {
        average = (s1 + s2 + s3) / 3;
    }

    /**
     * @param score12
     * @return int return the score1
     */
    public int getScore1() {
        return score1;
    }

    /**
     * @param score1 the score1 to set
     */
    public void setScore1(int score1) {
        this.score1 = score1;
    }

    /**
     * @param score22
     * @return int return the score2
     */
    public int getScore2() {
        return score2;
    }

    /**
     * @param score2 the score2 to set
     */
    public void setScore2(int score2) {
        this.score2 = score2;
    }

    /**
     * @param score3 the score3 to set
     */
    public void setScore3() {
        score3 = (int) (15 + (Math.random() * 30));// generates a random integer between 15 and 30
    }

    /**
     * @return int return the score3
     */
    public int getScore3() {
        return score3;
    }

    /**
     * @param scores the scores to set
     */
    public void setScores(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    /**
     * @param gpa the gpa to set
     * 
     *            public void setGpa(double gpa) { this.gpa = gpa; }
     */

    /*
     * public void calculateGPA(double grade1, double grade2, double grade3, double
     * grade4, double grade5, double grade6) { gpa = ((3 * grade1) + (3 * grade2) +
     * (3 * grade3) + (4 * grade4) + (2 * grade5) + (1 * grade6)) / (3 + 3 + 3 + 4 +
     * 2 + 1);
     * 
     * // desiFormat.format(gpa); }
     */

    /**
     * @return double return the gpa
     * 
     *         public double getGpa() { return gpa; }
     */

    /**
     * @param classification the classification to set
     * 
     *                       public void setClassification(String classification) {
     *                       this.classification = classification; }
     */

    /**
     * @return String return the classification
     * 
     *         public String getClassification() { return classification; }
     */

    /* Sets the message based on the scores */
    public void setMessage() {
        if (average >= 27) {
            message = "Excellence, A";
        } else if (average >= 24 && average < 27) {
            message = "Good, B";
        } else if (average >= 19 && average < 24) {
            message = "Okay, C";
        } else {
            message = "Need Improvement";
        }
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /* Set new object attributes */
    public void setNewAttributes(String firstName, String lastName, int score1, int score2, int score3, double average,
            String message) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.average = average;
        this.message = message;
    }

    /* Resets all object attributes */
    public void reset() {
        firstName = null;
        lastName = null;
        message = null;

        average = 0.0;

        score1 = 0;
        score2 = 0;
        score3 = 0;
    }

}