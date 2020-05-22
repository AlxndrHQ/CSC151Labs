import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

public class IceCreamDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");// creates new Decimal Format object
        // Stack<IceCream> stack = new Stack();// creates new stack to hold each order

        /*
         * String flavor = null;// represents the ice-cream flavor you order int
         * noScoops = 0;// represents number of ice-cream scoops you order float
         * scoopCost = 0.0F;// represents cost of ice-cream per scoop, based on
         * ice-cream flavor float totalCost = 0.0F;// = a floating-point representing a
         * total cost of ice-cream, i.e., aCost * noScoop int bill = 0;// = an integer
         * input representing a bill that you use to pay for this ice-cream cone float
         * change = 0.0F;// = a floating-point representing a change after paying for
         * this ice-cream cone String name = null;// used for name of order
         * 
         * System.out.println("***Welcome to The Ice Cream Stand***");
         * 
         * String again = "yes";// used to determine if user wants to run test again or
         * not
         */
        /*
         * do { System.out.println("What is the name for this order?"); name =
         * keyboard.nextLine();
         * 
         * System.out.println("Menu: " + "\n\t1. Vanilla: \t$1.50 " +
         * "\n\t2. Chocolate: \t$0.95" + "\n\t3. Strawberry: \t$2.59" +
         * "\n\t4. Blackberry: \t$1.50" + "\n\t5. Oreo: \t$1.75" +
         * "\n\t6. Rocky Road: \t$1.99" );
         * 
         * System.out.
         * println("What ice cream flavor would you like? (Enter the flavor name or a number 1-6) "
         * ); flavor = keyboard.nextLine();// stores flavor that user would like
         * 
         * switch(flavor) { // The cost of each flavor per scoop are (in respect to the
         * above order): // $1.50, $0.95, $2.59, $1.50, $1.75 and $1.99 case "Vanilla",
         * "1": System.out.println("You chose Vanilla"); scoopCost = 1.50F; break; case
         * "Chocolate", "2": System.out.println("You chose Chocolate"); scoopCost =
         * 0.95F; break; case "Strawberry","3":
         * System.out.println("You chose Strawberry"); scoopCost = 2.59F; break; case
         * "Blackberry", "4": System.out.println("You chose Blackberry"); scoopCost =
         * 1.50F; break; case "Oreo", "5": System.out.println("You chose Oreo");
         * scoopCost = 1.75F; break; case "Rocky Road", "6":
         * System.out.println("You chose Rocky Road"); scoopCost = 1.99F; break; }
         * 
         * //
         * System.out.println("How many scoops would you like? (must be more than 1)");
         * do {
         * System.out.println("How many scoops would you like? (must be more than 1)");
         * noScoops = keyboard.nextInt();// stores number of scoops
         * 
         * } while(noScoops < 1);
         * 
         * 
         * totalCost = scoopCost * noScoops;// = a floating-point representing a total
         * cost of ice-cream, i.e., aCost * noScoop // prints what the total cost is
         * based on flavor and number of scoops System.out.println("Your order of  " +
         * flavor + " for " + noScoops + " scoops costs $" +
         * decimalFormat.format(totalCost) + ".");
         * 
         * // asks user how large of a bill they would like to enter to pay for their
         * bill do { System.out.println("Please enter your bill ($1, $5, $10, $20)");
         * bill = keyboard.nextInt(); } while(! ( bill == 1 || bill == 5 || bill == 10
         * || bill == 20 ) );
         * 
         * 
         * change = bill - totalCost;// = a floating-point representing a change after
         * paying for this ice-cream cone System.out.println("Your change is $" +
         * decimalFormat.format(change));
         * 
         * // needs to calculate how many more scoops you can get // remaining scoops =
         * change / price per scoop float remainingScoops = change / scoopCost;
         * System.out.println("With your change, you can get " +
         * decimalFormat.format(remainingScoops) + " more scoops of " + flavor);
         * 
         * /* To Do: - needs to create object for this order - Needs to add order object
         * to stack - needs to print order object from stack
         */
        // creates object for this order
        // IceCream orderName = new IceCream(name, flavor, noScoops, scoopCost, bill,
        // change);
        // stack.add(orderName);

        /*
         * System.out.
         * println("Would you like to Place another order? (Only enter \"yes\" or \"no\")"
         * );
         */
        /*
         * } while (!(again.equalsIgnoreCase("yes")));
         * 
         */

        System.out.println("\nThank you for visiting the Ice-cream stand! \nCome again soon.");

        keyboard.close();// closes keyboard Scanner object
    }
}