/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: Student2
* Purpose: inherited from a Person class, specific to student information
================================================================== */
public class StudentP extends Person {
    private String major = "Undeclared";// default “Undeclared”
    private String minor = "No Minor";// default “No Minor”
    private double gpa = 0.0;// default “0.00”

    public Student2 (String firstName, String lastName, int bYear, double money){
        super(firstName, lastName, bYear, money);// reintroduces variables from superclass
        super.firstName = firstName;
        super.lastName = lastName;
        super.yearOfBirth = bYear;
        super.money = money;
    }

    public Student2 (String firstName, String lastName, int bYear, double money, String major, double gpa) {
        super(firstName, lastName, bYear, money);// reintroduces variables from superclass
        super.firstName = firstName;
        super.lastName = lastName;
        super.yearOfBirth = bYear;
        super.money = money;
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void switchMajor(String newMajor) {
        major = newMajor;
    }

    public String getMinor() {
        return minor;
    }

    public void changeMinor(String newMinor) {
        minor = newMinor;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double newGPA) {
        gpa = newGPA;
    }

    public String toString() {
        /*
         * Override toString method to show all attributes with TAB delimited, except
         * firstname and lastname that will separate by a space. [use toString method
         * from super class as the starting]
         */
        return "Name: " + firstName + " " + lastName + "\tBirth Year: " + yearOfBirth + "\tMoney: " + money
                + "\tMajor: " + major + "\tMinor: " + minor + "\tGPA: " + gpa;
    }
}