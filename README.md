# CSC151Labs

CSC 151 Labs

This will be a collection of all of the labs, projects, and classes that I was given during CSC151.

In this repo I will be recompleting all of my old assignments.

## WilliamsJrS_P4

This is a continuation of IceCreamDriver2.
This file will offer input validation:

Objectives:

- [completed] Input Validation: Make sure that if the value is not within range, you MUST ask the user to re-enter until the
  value is within range.
- [completed] A. Flavor: ice-cream flavor, only accepted int value are 1 to 6
- [completed] B. No Scoops: number of scoops is at least 1 scoop (no negative integer or 0), but cannot be more than 10
  scoops (10 is maximum number).
- [completed] C. Bill Amount: bill has to be positive number and at least greater than the cost of the ice-cream
- [completed] D. Bill Type: only accept the following single bill – $5, $10, $20, $50, or \$100 bill – only these 5 are
  acceptable.

To Do:

- [Completed] while change > scoopCost && the user said yes, noScoop++. totalCost = scoopCost * noScoops. Subtract that particular scoopCost from the change that we currently have
- [Completed] need to find a loop that allows the user to exit the store, even if they can afford to buy another scoop (line 196)
- [Completed]: if you overpay, and say you dont want another scoop, there is no way to exit
- [Completed]: currently if you overpay it tells you that you owe an additional $- negative value. Create if/else or switch statement that deals with negative values
- [Completed]: ensure that a name is entered for the order (cannot be blank)
-[Completed]: print a reciept for: name, flavor, noScoops, scoopCost, totalCost, userTender, and change
-[TODO]: Find out why when you have leftover cash, and you say yes to another scoop it takes 2 scoops initially then just 1
- [Future]:

1. instantiate an object from iceCream class
2. create setters and getters to store the order name, order number, flavor, number of scoops, total price, number of items added, number of scoops tenders added, subtotals

-[TODO]: add the ability to enter other flavors to your order.

-[Future]: guard against foreign curencies (unicode validation)
-[Future]: payment verification
-[Future]: offer buyers rewards based on how long they have been in our system

## IceCreamDriver2

This is the continuation of the ice cream stand.
I will use the IceCream class to create user defined methods to set and retrieve the values pertaining to the ice cream stand driver.

- instantiate an object from the iceCream class to store the customers data
- use user defined setter and getter methods to set and retrieve the data to the respective class
- store each input based on what the user has entered (Ex. setFlavor)
- add each order to a stack.
- at the end, ask if the user would like to place another order

Goal:

- user will input a bill, if insuffient they will be prompted to add the remaining balance (only 1, 5, 10, 20)
  the additional bills will be added to their tender
  subtract their tender from their bill, then return amount of change

To Do:

- needs to create object for this order
- needs to print order object from stack
- (Completed) the flavor needs to work for the string or the number value

## WilliamsJrS_P3

This is an ice cream stand, in the next iteration I will use the ice cream class to create user defined methods to set and retrieve the values pertaining to the ice cream stand.

I will add each order to a stack, and ask the user if they would like to create another order.
