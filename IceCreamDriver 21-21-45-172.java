import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;
import java.lang.*;

public class IceCreamDriver
{
    public static void main(String[] args)
    {
        /*
            For v2:
            - instantiate an object from the iceCream class to store the customers data
            - at the end, ask if the user would like to place another order
            - use user defined setter and getter methods to set and retrieve the data to the respective class 
        */

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");// creates new Decimal Format object 

        String again = "yes";// used to determine if user wants to run test again or not 

        do
        {
            String flavor = null;// represents the ice-cream flavor you order
            int noScoops = 0;// represents number of ice-cream scoops you order
            float scoopCost = 0.0F;// represents cost of ice-cream per scoop, based on ice-cream flavor
            float totalCost = 0.0F;// = a floating-point representing a total cost of ice-cream, i.e., aCost * noScoop
            int bill = 0;// = an integer input representing a bill that you use to pay for this ice-cream cone
            float change = 0.0F;// = a floating-point representing a change after paying for this ice-cream cone
            String name = null;// used for name of order 

            System.out.println("***Welcome to The Ice Cream Stand***");
            
            System.out.println("What is the name for this order?");
            name = keyboard.nextLine();
            
            // IceCream newOrder = new IceCream();// creates new object using iceCream class
            // newOrder.setName(name);// gives the order a name

            System.out.println("Hello " + name + " this is our Menu: "
                                    + "\n\t1. Vanilla: \t$1.50 " 
                                    + "\n\t2. Chocolate: \t$0.95" 
                                    + "\n\t3. Strawberry: \t$2.59"
                                    + "\n\t4. Blackberry: \t$1.50"
                                    + "\n\t5. Oreo: \t$1.75"
                                    + "\n\t6. Rocky Road: \t$1.99"
                                    );
            
                System.out.println(name + ", What ice cream flavor would you like? (Enter the flavor name or a number 1-6) ");
                flavor = keyboard.nextLine();// stores flavor choice that user would like

                int one = 1;

                switch(flavor)
                {
                    case "Vanilla", "1":
                    System.out.println("\nYou chose Vanilla");
                    scoopCost = 1.50F;
                    //newOrder.setFlavor(1);// stores the flavor to the order 
                    //newOrder.setCost(scoopCost);// stores scoopCost to order
                    break;
                    case "Chocolate", "2":
                    System.out.println("\nYou chose Chocolate");
                    scoopCost = 0.95F;
                    //newOrder.setFlavor(2); 
                    //newOrder.setCost(scoopCost);
                    break;
                    case "Strawberry","3":
                    System.out.println("\nYou chose Strawberry");
                    scoopCost = 2.59F;
                    //newOrder.setFlavor(3);
                    //newOrder.setCost(scoopCost);
                    break;
                    case "Blackberry", "4":
                    System.out.println("\nYou chose Blackberry");
                    scoopCost = 1.50F;
                    //newOrder.setFlavor(4); 
                    //newOrder.setCost(scoopCost);
                    break;
                    case "Oreo", "5":
                    System.out.println("\nYou chose Oreo");
                    scoopCost = 1.75F;
                    //newOrder.setFlavor(5); 
                    //newOrder.setCost(scoopCost);
                    break;
                    case "Rocky Road", "6":
                    System.out.println("\nYou chose Rocky Road");
                    scoopCost = 1.99F;
                    //newOrder.setFlavor(6);
                    //newOrder.setCost(scoopCost);
                    break;
                }
                
            
            
            do
            {
                System.out.println("How many scoops would you like? (must be more than 1)");
                noScoops = keyboard.nextInt();// stores number of scoops  
            } while(noScoops < 1);
    
            
            // prints what the total cost is based on flavor and number of scoops
            totalCost = scoopCost * noScoops;// total cost of ice-cream based on number of scoops and type of ice cream
            System.out.println("Your order of  " + flavor + " for " + flavor + " scoops costs $" + decimalFormat.format(totalCost) + ".");
    
            // asks user how large of a bill they would like to enter to pay for their bill
            do
            {
                System.out.println("Please enter your bill ($1, $5, $10, $20)");
                bill = keyboard.nextInt();
            } while(! ( bill == 1 || bill == 5 || bill == 10 || bill == 20 ) );
            
    
            change = bill - totalCost;// = a floating-point representing a change after paying for this ice-cream cone
            System.out.println("Your change is $" + decimalFormat.format(change));
    
            // needs to calculate how many more scoops you can get 
            // remaining scoops = change / price per scoop 
            float remainingScoops = change / scoopCost;
            System.out.println("With your change, you can get " + decimalFormat.format(remainingScoops) + " more scoops of " + flavor);
            
            
            /*
                To Do:
                - needs to create object for this order
                - Needs to add order object to stack
                - needs to print order object from stack
            */
            // creates object for this order
            // IceCream orderName = new IceCream(name, flavor, noScoops, scoopCost, bill, change);
            // stack.add(orderName);

            
            System.out.println("Would you like to Place another order? (Only enter \"yes\" or \"no\")");
            again = keyboard.nextLine();
           
        } while ((again.equalsIgnoreCase("yes")));
        
        

        System.out.println("\nThank you for visiting the Ice Cream stand!"
                            + "\nCome again soon!");

        keyboard.close();// closes keyboard Scanner object
    }
}