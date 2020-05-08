import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;
import java.lang.*;

public class WilliamsJrS_P4 {
    public static void main(String[] args) {
        /*
         * For v2: - instantiate an object from the iceCream class to store the
         * customers data - at the end, ask if the user would like to place another
         * order - use user defined setter and getter methods to set and retrieve the
         * data to the respective class
         */

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");// creates new Decimal Format object

        String anotherOrder = "";// used to determine if user wants to make anotherOrder

        do {
            String flavor = null;// represents the ice-cream flavor you order
            int noScoops = 0;// represents number of ice-cream scoops you order
            float scoopCost = 0.0F;// represents cost of ice-cream per scoop, based on ice-cream flavor
            float totalCost = 0.0F;// = a floating-point representing a total cost of ice-cream, i.e., aCost *
                                   // noScoop
            int bill = 0;// = an integer input representing a bill that you use to pay for this ice-cream
                         // cone
            float change = 0.0F;// = a floating-point representing a change after paying for this ice-cream cone
            String name = "";// used for name of order

            System.out.println("***Welcome to The Ice Cream Stand***");

            while (name.equalsIgnoreCase(""))// name cannot be blank
            {
                System.out.println("What is the name for this order? (order must have a name)");
                name = keyboard.nextLine();
            }

            // IceCream newOrder = new IceCream();// creates new object using iceCream class
            // newOrder.setName(name);// gives the order a name

            System.out.println("Hello " + name + " this is our Menu: " + "\n\t1. Vanilla: \t$1.50 "
                    + "\n\t2. Chocolate: \t$0.95" + "\n\t3. Strawberry: \t$2.59" + "\n\t4. Blackberry: \t$1.50"
                    + "\n\t5. Oreo: \t$1.75" + "\n\t6. Rocky Road: \t$1.99");
            do {
                System.out.println(
                        name + ", What ice cream flavor would you like? (Enter the flavor name or a number 1-6) ");
                flavor = keyboard.nextLine();// stores flavor choice that user would like
            } while (!(flavor.equalsIgnoreCase("1") || flavor.equalsIgnoreCase("2") || flavor.equalsIgnoreCase("3")
                    || flavor.equalsIgnoreCase("4") || flavor.equalsIgnoreCase("5") || flavor.equalsIgnoreCase("6")
                    || flavor.equalsIgnoreCase("Vanilla") || flavor.equalsIgnoreCase("Chocolate")
                    || flavor.equalsIgnoreCase("Strawberry") || flavor.equalsIgnoreCase("Blackberry")
                    || flavor.equalsIgnoreCase("Oreo") || flavor.equalsIgnoreCase("Rocky Road")));

            switch (flavor) {
                case "1", "Vanilla", "vanilla":
                    System.out.println("\nYou chose Vanilla");
                    scoopCost = 1.50F;
                    // newOrder.setFlavor(1);// stores the flavor to the order
                    // newOrder.setCost(scoopCost);// stores scoopCost to order
                    break;
                case "Chocolate", "2", "chocolate":
                    System.out.println("\nYou chose Chocolate");
                    scoopCost = 0.95F;
                    // newOrder.setFlavor(2);
                    // newOrder.setCost(scoopCost);
                    break;
                case "Strawberry", "3", "strawberry":
                    System.out.println("\nYou chose Strawberry");
                    scoopCost = 2.59F;
                    // newOrder.setFlavor(3);
                    // newOrder.setCost(scoopCost);
                    break;
                case "Blackberry", "4", "blackberry":
                    System.out.println("\nYou chose Blackberry");
                    scoopCost = 1.50F;
                    // newOrder.setFlavor(4);
                    // newOrder.setCost(scoopCost);
                    break;
                case "Oreo", "5", "oreo":
                    System.out.println("\nYou chose Oreo");
                    scoopCost = 1.75F;
                    // newOrder.setFlavor(5);
                    // newOrder.setCost(scoopCost);
                    break;
                case "Rocky Road", "6", "rocky road":
                    System.out.println("\nYou chose Rocky Road");
                    scoopCost = 1.99F;
                    // newOrder.setFlavor(6);
                    // newOrder.setCost(scoopCost);
                    break;
                default:
                    System.out.println("\nEnter a valid choice (1-6)");
                    flavor = keyboard.nextLine();// stores flavor choice that user would like
                    break;
            }

            do {
                System.out.println("How many scoops would you like? (must be between 1 and 10)");
                noScoops = keyboard.nextInt();// stores number of scoops
            } while (!(noScoops > 1 && noScoops < 11));

            // prints what the total cost is based on flavor and number of scoops
            totalCost = scoopCost * noScoops;// total cost of ice-cream based on number of scoops and type of ice cream
            System.out.println("Your order of " + flavor + " for $" + scoopCost + " per scoop costs $"
                    + decimalFormat.format(totalCost) + ".");

            do {
                // asks user how large of a bill they would like to enter to pay for their bill
                // used as long as the bill is not a 0, 1, 5, 10, or 20
                System.out.println("Please enter your bill (Only: $1, $5, $10, $20, $50, $100)");
                bill = keyboard.nextInt();
            } while (!(bill == 0 || bill == 1 || bill == 5 || bill == 10 || bill == 20 || bill == 50 || bill == 100));

            double userTender = (double) bill;
            System.out.println("You have entered $" + userTender + ".");

            double remaining = totalCost - (double) userTender;

            while ((bill == 0 || bill == 1 || bill == 5 || bill == 10 || bill == 20 || bill == 50 || bill == 100)) {

                while (remaining > 0.0) {

                    System.out.println("Please enter an additional $" + decimalFormat.format(remaining)
                            + " to complete your order");
                    bill = keyboard.nextInt();

                    while (!(bill == 0 || bill == 1 || bill == 5 || bill == 10 || bill == 20 || bill == 50
                            || bill == 100)) {// bill must be 1, 5, 10, 20, 50, or 100

                        // asks user how large of a bill they would like to enter to pay for their bill
                        // used as long as the bill is not a 0, 1, 5, 10, or 20
                        System.out.println("Please enter your bill (Only: $1, $5, $10, $20, $50, $100)");
                        bill = keyboard.nextInt();
                    }
                    userTender += bill;// adds the bill entered to the user's tender
                    System.out.println("You have entered $" + userTender + " in total.");
                    remaining = totalCost - (double) userTender;// subtracts the remaining amount from what the user
                                                                // entered minus the total cost of their tab

                    if (remaining > 0.0) {
                        System.out.println("You owe an additional $" + decimalFormat.format(remaining));
                    }

                }

                if (userTender > remaining) {// userTender was larger than cost
                    change = (float) userTender - totalCost;// a floating-point representing a change after paying for
                                                            // this ice-cream cone
                    break;
                }

            }

            change = (float) userTender - totalCost;// a floating-point representing a change after paying for this
                                                    // ice-cream cone
            System.out.println("Your change is $" + decimalFormat.format(change));

            // needs to calculate how many more scoops you can get
            // remaining scoops = change / price per scoop
            float remainingScoops = change / scoopCost;
            System.out.println("With $" + decimalFormat.format(change) + ", you can get " + (int) remainingScoops
                    + " more whole scoops of " + flavor);

            String anotherScoop = "";
            if (remainingScoops > 1) {

                do {
                    System.out.println(
                            "Would you like to get another scoop of " + flavor + "? (Only enter \"yes\" or \"no\")");
                    keyboard.nextLine();// clears buffer
                    anotherScoop = keyboard.nextLine();
                } while (!(anotherScoop.equalsIgnoreCase("no") || anotherScoop.equalsIgnoreCase("yes")));

            } else {
                keyboard.nextLine();// clears buffer
                // break;
            }

            while (remainingScoops > 1 && anotherScoop.equalsIgnoreCase("yes")) {

                noScoops++;// add one to number of scoops
                totalCost = scoopCost * noScoops;// adds onto total cost
                change = (float) userTender - totalCost;// calculates how much change remains
                change -= scoopCost;// subtract that latest scoop cost from the change

                remainingScoops = change / scoopCost;
                System.out.println("With $" + decimalFormat.format(change) + ", you can get " + (int) remainingScoops
                        + " more whole scoops of " + flavor);

                System.out.println(
                        "Would you like to get another scoop of " + flavor + "? (Only enter \"yes\" or \"no\")");

                anotherScoop = keyboard.nextLine();
            }

            do// user must only enter yes or no
            {
                System.out.println("Would you like to place another order? (Must be \"yes\" or \"no\")");
                anotherOrder = keyboard.nextLine();
            } while (!(anotherOrder.equalsIgnoreCase("yes") || anotherOrder.equalsIgnoreCase("no")));

            // returns a reciept for what the user ordered
            System.out.println("*************************");
            System.out.println(name + ", here is your reciept: " + "\n\tIce Cream Flavor: " + flavor
                    + "\n\tNumber of scoops for " + flavor + ": " + noScoops + "\n\tPrice Per Scoop: $" + decimalFormat.format(scoopCost)
                    + "\n\tTotal Cost: $" + decimalFormat.format(totalCost) + "\n\tTotal amount that you entered: $" + decimalFormat.format(userTender)
                    + "\n\tChange given: $" + decimalFormat.format(change));
            System.out.println("*************************");

        } while (!(anotherOrder.equalsIgnoreCase("no")));

        System.out.println("\nThank you for visiting the Ice Cream stand! \nCome again soon!");

        keyboard.close();// closes keyboard Scanner object
    }
}