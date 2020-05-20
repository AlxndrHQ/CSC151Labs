import java.util.Date;

/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance, Spring 2020 - section
* FileName: Person
* Purpose: establishes base information about a generic person 
================================================================== */
public class Person {
    protected String firstName;
    protected String lastName;
    protected int yearOfBirth;
    protected String city = "Prince George's County";
    protected String state = "MD";
    protected double money = 725;
    
    Date date = new Date();// new date object 

    public Person(String firstName, String lastName, int bYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        yearOfBirth = bYear;
    }

    public Person(String fName, String lName, int bYear, double aMoney) {
        firstName = fName;
        lastName = lName;
        yearOfBirth = bYear;
        money = aMoney;
    }

    public String getName() {
        // Return a concatenation of firstName and lastName with a space between names.
        return firstName + " " + lastName;
    }

    public int getBirthYear() {
        return yearOfBirth;
    }

    public double getMoney() {
        return money;
    }

    public String getCityState() {
        /*
         * Return a concatenation of City and State using comma and space “, ” to
         * separate the value.
         */
        return city + ", " + state;
    }

    public int getAge() {
        /* Return an integer of age – calculate from yearOfBirth */
        return yearOfBirth - date;
    }

    public void setMoney(double newMoney) {
        money = newMoney;
    }

    public void setCityState(String newCity, String newState) {
        /* set a new value to city and state attribute with this one method */
        city = newCity;
        state = newState;
    }

    public void work(double amount) {
        /* This method will add amount to the current money. */
        money += amount;
    }

    public void work(int hours, double payRate) {
        /*
         * This method will (a) compute the wage based on hours and payRate. If this
         * person works more than 40 hours, those extra hours will be 1.5 times of a
         * normal payRate; then (b) add the calculated wage to the current money. For
         * example, if you have 45 hours, then first 40 hours will use payRate and the
         * remaining 5 hours will use 1.5 of payrate. So, if payRate is $10.00; in this
         * example you work for 45 hours, you will get pay 40 * 10 + 5 * 1.5 * 10 =
         * $475.00
         */
        money = payRate * hours;

        if (hours > 40) {
            money += (hours - 40) * (payRate * 1.5);
        }
    }

    public void work(String amount) {
        /*
         * This method will convert amount from String to double and then add the value
         * to the current money.
         */
        money += Double.parseDouble(amount);
    }

    public void shop() {
        /*
         * This method will subtract 30.00 from current money. Note that you cannot have
         * negative money!
         */
        money -= 30.00;

        if (money < 0.0) {
            System.out.println("you cannot have negative money!");
        }
    }

    public void shop(double amount) {
        /*
         * This method will subtract amount from current money. You should not spend
         * more than what you have, so make sure to provide error message!
         */
        money -= amount;

        if (money < 0.0) {
            System.out.println("you cannot have negative money!");
        }

    }

    public void shop(String amount) {
        /*
         * This method will convert amount from String to double and then subtract value
         * from money.
         */
        money -= Double.parseDouble(amount);
        if (money < 0.0) {
            System.out.println("you cannot have negative money!");
        }
    }

    public String toString() {
        /*
         * Return a string of all attribute values with a TAB delimiter, except
         * firstname and lastname, where you will use a space delimiter/separator.
         */
        return "Name: " + firstName + " " + lastName + "\tBirth Year: " + yearOfBirth + "\tCity: " + city + "\tState: " + state + "\tMoney: " + money;
    }

}