# CSC151Labs

CSC 151 Labs

This will be a collection of all of the labs, projects, and classes that I was given during CSC151.

In this repo I will be recompleting all of my old assignments.

## WilliamsJrS_P5v2

[TODO] Overall:

- The data file, each row representing a record of student. It contains first name, last name, and 5 quizzes score. Your task is to read these data from an input file and then calculate the quiz total and average for each student as well as the class statistics, for min score, max score, and average score for each quiz.
  -[Completed]: read name, and score from file for each student
  -[Completed]: calculate the quiz total and average for each student
  -[Completed]: calculate the class min score, max score, & average score

- Your task is to read these data from an input file and then calculate the quiz total and average for each student as well as the class statistics, for min score, max score, and average score for each quiz.
  -[Completed]: Need quiz total and average for each student

- (1) Read a list of persons from a file (given on blackboard, “LASTNAME_Scores.txt” – replace LASTNAME with your last name for this program) – using Scanner object, Each line contains 7 columns: first_name, last_name, and 5 quizzes scores.
  -[Completed]: use scanner object to read file "WilliamsJr_Scores.txt"

- (2) For each student and scores in the file, the program will (a) calculate each student total score and average score (only 2 decimal point)
  -[Completed]: calculate each students total score and average score (round to 2 decimal places)

- (3) At the end, the program will print out the statistics summary of this class (a) min average score for this class (b) max average score for this class (c) average for this class (d) total number of students
  -[Completed]: Print class min average score (lowest students average)
  -[Completed]: Print class max average score (highest students average)
  -[Completed]: Print class average score (all students average)
  -[Completed]: Print total number of students in class

- (4) You will also write the exact same output you print on the screen to a file call, LastnameFirstInit_P5Output.txt
  -[Completed]: write stats to file: "WilliamsJrS_P5Output.txt"

[Future]:

- Create setters and getters for this program
  [TODO]Optimize: calculating class average
  [TODO]min score
  [TODO]max score
  [TODO]class min average score
  [TODO]class max average score

## WilliamsJrS_P5

[TODO] Overall:

- Your task is to read these data from an input file and then calculate the quiz total and average for each student as well as the class statistics, for min score, max score, and average score for each quiz.

[COMPLETED] 1st:

- read a list of persons from a file using Scanner object. Each line contains 7 columns: first_name, last_name, and 5 quizzes scores

[COMPLETED] 2nd:

- For each student and scores in the file, the program will (a) calculate each student's total score and average score (only 2 decimal points)

[Completed] 3rd:

- At the end, the program will print out the statistics summary of this class (a) min average score for this class (b) max average score for this class (c) average for this class (d) total number of students 1. Needs a counter for all the scores of the class (classScoreTotal) 2. Needs a counter for minimum average (classMinAverage) 3. Needs a counter for maximum average (classMaxAverage) 4. Needs a counter for total number of students (classStudentTotal)
-[Completed]: needs to get accurate reading of min and max values from each student

[Completed] 4th:

- You will also write the exact same output you print on the screen to a file called, LastnameFirstInit_P5Output.txt

## IceCream.java

[TODO]: Establish setters and getters for:

- [completed] name
- [completed] noScoops
- [completed] flavor
- [completed] scoopCost
- [completed] calculateTotal
- [completed] change

[TODO]: Find a way to calculateTotal using the flavorCost \* noScoops

[TODO]: create the ability to instantiate an object from this IceCream class into the driver

[TODO]: create a function to:

- caculate change

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

Deliverables:

[Completed] while change > scoopCost && the user said yes, noScoop++. totalCost = scoopCost \* noScoops. Subtract that particular scoopCost from the change that we currently have[Completed] need to find a loop that allows the user to exit the store, even if they can afford to buy another scoop (line 196)
[Completed]: if you overpay, and say you dont want another scoop, there is no way to exit
[Completed]: currently if you overpay it tells you that you owe an additional \$- negative value. Create if/else or switch statement that deals with negative values
[Completed]: ensure that a name is entered for the order (cannot be blank)
[Completed]: print a reciept for: name, flavor, noScoops, scoopCost, totalCost, userTender, and change -[TODO]: Find out why when you have leftover cash, and you say yes to another scoop it takes 2 scoops initially then just 1

[Future]:

1. instantiate an object from iceCream class
2. create setters and getters to store the order name, order number, flavor, number of scoops, total price, number of items added, number of scoops tenders added, subtotals

[TODO]: add the ability to enter other flavors to your order.

[Future]: guard against foreign curencies (unicode validation)
[Future]: payment verification
[Future]: offer buyers rewards based on how long they have been in our system

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
