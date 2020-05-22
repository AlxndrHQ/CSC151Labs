public class CSC151_Lab2 {
    public static void main(String[] args) {
        // Part A -- Variables and Literals
        System.out.println("Part A: \"Variables and Literals\"");

        int distance, time;// defines distance and time
        distance = 350;
        time = 8;

        System.out.println("\nThe distance between the two cities is " + distance + " miles and it takes " + time
                + " hours to drive between them.");

        // Part B -- Arithmetic Operators 1
        double total, cost, tax;// defines total, cost, and tax
        final double sales_tax_rate = .0925;// will always be 9.25%
        cost = 320;
        tax = cost / sales_tax_rate;
        total = cost + tax;

        System.out.println("\nPart B: \"Arithmetc Operators 1\"");
        System.out.println("Cost is " + cost + ", the sales tax is " + tax + " and total is " + total);

        // Part C -- Arithmetic Operators 2
        int dividend, divisor, quotient, remainder;
        dividend = 23;
        divisor = 7;
        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("\nPart C: \"Arithmetic Operators 2\"");
        System.out.println("When " + dividend + " is divided by " + divisor + ", the quotient is " + quotient
                + " and the remainder is " + remainder + ".");

    }

}