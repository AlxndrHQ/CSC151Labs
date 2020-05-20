/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: Faculty
* Purpose: inherited from a Person class, specific to faculty information
================================================================== */
public class Faculty extends Person {

    private String department = "Unknown";// default “Unknown”
    private String position = "Unknown";// default “Unknown”

    public Faculty(String firstName, String lastName, int bYear, double money) {
        super(firstName, lastName, bYear, money);// reintroduces variables from superclass
        super.firstName = firstName;
        super.lastName = lastName;
        super.yearOfBirth = bYear;
        super.money = money;
    }

    public Faculty(String firstName, String lastName, int bYear, double money, String department, String position) {
        super(firstName, lastName, bYear, money);// reintroduces variables from superclass
        super.firstName = firstName;
        super.lastName = lastName;
        super.yearOfBirth = bYear;
        super.money = money;
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void changeDepartment(String newDept) {
        department = newDept;
    }

    public String getPosition() {
        return position;
    }

    public void updatePosition(String newPos) {
        position = newPos;
    }

    public String toString() {
        return "Name: " +firstName + " " + lastName + "\tBirth Year: " + yearOfBirth + "\tMoney: " + money + "\tDepartment: " + department + "\tPosition: " + position;
    }

}