import java.text.DecimalFormat;
import java.util.Scanner;

public class WilliamsJrS_P3
{
    public static void main(String[] args)
    {
        // Write an ice-cream store application that asks the customer a flavor of ice-cream (each has a different price), 
        // ask how many scoops, 
        // input a bill used to pay for selected ice-cream, 
        // find the correct change.

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");// creates new Decimal Format object 

        int flavor = 0;// = an integer input representing the ice-cream flavor you order
        int noScoops = 0;// = an integer input representing a number of ice-cream scoops you order
        float scoopCost = 0.0F;// = a floating-point representing a cost of ice-cream per scoop, based on ice-cream flavor
        float totalCost = 0.0F;// = a floating-point representing a total cost of ice-cream, i.e., aCost * noScoop
        int bill = 0;// = an integer input representing a bill that you use to pay for this ice-cream cone
        float change = 0.0F;// = a floating-point representing a change after paying for this ice-cream cone

        System.out.println("***Welcome to The Ice Cream Stand***");
        System.out.println("Menu: "
                                + "\n\t1. Vanilla: \t$1.50 " 
                                + "\n\t2. Chocolate: \t$0.95" 
                                + "\n\t3. Strawberry: \t$2.59"
                                + "\n\t4. Blackberry: \t$1.50"
                                + "\n\t5. Oreo: \t$1.75"
                                + "\n\t6. Rocky Road: \t$1.99"
                                );

        System.out.println("What ice cream flavor would you like? (Enter the number 1-6) ");
        flavor = keyboard.nextInt();// stores flavor that user would like
        switch(flavor)
        {
            // The cost of each flavor per scoop are (in respect to the above order):
            // $1.50, $0.95, $2.59, $1.50, $1.75 and $1.99
            case 1:
            System.out.println("\nYou chose Vanilla");
            scoopCost = 1.50F;
            break;
            case 2:
            System.out.println("\nYou chose Chocolate");
            scoopCost = 0.95F;
            break;
            case 3:
            System.out.println("\nYou chose Strawberry");
            scoopCost = 2.59F;
            break;
            case 4:
            System.out.println("\nYou chose Blackberry");
            scoopCost = 1.50F;
            break;
            case 5:
            System.out.println("\nYou chose Oreo");
            scoopCost = 1.75F;
            break;
            case 6:
            System.out.println("\nYou chose Rocky Road");
            scoopCost = 1.99F;
            break;
        }
        
        // System.out.println("How many scoops would you like? (must be more than 1)");
        do
        {
            System.out.println("\nHow many scoops would you like? (must be more than 1)");
            noScoops = keyboard.nextInt();// stores number of scoops  

        } while(noScoops < 1);


        totalCost = scoopCost * noScoops;// = a floating-point representing a total cost of ice-cream, i.e., aCost * noScoop
        // prints what the total cost is based on flavor and number of scoops
        System.out.println("\nYour order of  " + flavor + " for " + noScoops + " scoops costs $" + decimalFormat.format(totalCost) + ".");

        // asks user how large of a bill they would like to enter to pay for their bill
        do
        {
            System.out.println("\nPlease enter your bill ($1, $5, $10, $20)");
            bill = keyboard.nextInt();
        } while(! ( bill == 1 || bill == 5 || bill == 10 || bill == 20 ) );
        

        change = bill - totalCost;// = a floating-point representing a change after paying for this ice-cream cone
        System.out.println("\nYour change is $" + decimalFormat.format(change));

        // needs to calculate how many more scoops you can get 
        // remaining scoops = change / price per scoop 
        float remainingScoops = change / scoopCost;
        System.out.println("\nWith your change, you can get " + decimalFormat.format(remainingScoops) + " more scoops of " + flavor);


        System.out.println("\nThank you for visiting the Ice-cream stand! \nCome again soon.");

        keyboard.close();// closes keyboard Scanner object
    }
}