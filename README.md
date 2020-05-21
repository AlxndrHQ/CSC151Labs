# CSC151Labs

CSC 151/2 Labs

This will be a collection of all of the labs, projects, and classes that I was given during CSC151 & CSC152.
I will be recompleting all of my old assignments.

## CSC 152 - Programming Assignment 3

[Completed] name the class sortNsearch.java
[Completed] name your driver CSC152_P3.java

[Completed](1) Read Input from a Text file and store them in Array of Integers

- [Completed] a. Read input from a data file, myIntegerData.txt. This will have just integers. The first number in this file will tell you how many integers value you will need to read and this will be used to define a size of your integer arrays that will be created in this assignment.

- [Completed] b. Then, you will read each of the value and store them in integer array, called MMM_myUnsortedIntegers

[Completed](2) Copy an Unsorted Array 3 times with Exact Size

- [Completed] a. You will create exact duplicate of you MMM_myUnsortedIntegers 3 times, but name them MMM_mySortedIntegers1, MMM_mySortedIntegers2, MMM_mySortedIntegers3 [Note that after your copy, all 3 arrays will have unsorted data, but the other 3 arrays will be used in sorting algorithm below]

[Completed](3) Sorting

- [Completed] a. You will use Insertion Sort Algorithm to sort MMM_mySortedIntegers1 Make sure that you print the array before and after sorting as well as including algorithm efficiency for this sorting.
- [Completed] b. You will use Selection Sort Algorithm to sort MMM_mySortedIntegers2 Make sure that you print the array before and after sorting as well as including algorithm efficiency for this sorting.
- [Completed] c. You will use Bubble Sort Algorithm to sort MMM_mySortedIntegers3 Make sure that you print the array before and after sorting as well as including algorithm efficiency for this sorting.

[Completed](4) Searching

- [Completed] a. You will create a menu that will ask the user which search algorithm and based on search algorithm, you will give them option on the arrays that they can choose.
- [Completed] i. Search Algorithm Options: (A) for Sequential Search and (B) for Binary Search
- [Completed] ii. If Search Option A is chosen (Sequential Search), you will give them a list of all 4 arrays that you created to use.
- [Completed] iii. If Search Option B is chosen (Binary Search), you will give them only 3 sorted arrays for user to choose.
- [Completed] iv. Once the user picked searching algorithm and then array to use in this search, you will ask the user to enter a target value.
- [Completed] Based on search results, you should print if the value (give the search value) is found or not in this array (give array name), and if it is found, you will tell the location/position that it is found in the array. Keep in mind that the user does not know that the array start from zero. Make sure that your screen is nice and neat; and have all necessary labels.

- [Completed] b. Then, you will ask the user if they want to search again [Yes or No].
- [Completed] i. If anything that not Yes or No enter (ignore case), you should ask them to re-enter again
- [Completed] ii. If they said “Yes,” then you will repeat all steps in 4(a) and then ask if they want to search again.
- [Completed] iii. If they said “No” then you will stop the loop.

[Completed](5) Copy an Unsorted Array with Double Size

- [Completed] a. Create a new integer array called, XXXX_UnfilledArray, that has double the size of MMM_myUnsortedIntegers and then first set of data are from MMM_myUnsortedIntegers
- [Completed] b. Create an integer variable, MMM_count, that will keep track how many elements in XXXX_UnfilledArray has values in them.
- [Completed] c. Print out values XXXX_UnfilledArray twice, [make sure to give appropriate heading]
- [Completed] i. The first one (print all elements): using enhanced for-loop and print each number separate by a space, and only 10 integers per line.
- [Completed] ii. The second one (only print elements with values): only print element with values, each number separate by a space, and only 5 integers per line.

- [Completed] d. You will ask the user to enter 4 integers and you will add them to the array XXXX_UnfilledArray (so now you should have 4 more elements filled)
- [Completed] e. Print out values XXXX_UnfilledArray only those that filled, each number separate by a space, and only 5 integers per line.

[Completed](6) Delete Elements from Array

- [Completed] a. Print the 4th element value in the array (that is, subscript index 3) XXXX_UnfilledArray
- [Completed] b. You will delete the 4th element in XXXX_UnfilledArray -- Keep in mind that now every element after will have to be shifted left (i.e. the value in index 4 (5th value) will now be in index 3, and then the value in index 5 (6th value) will now be in index 4 and so on.)

- [Completed] c. Print out values XXXX_UnfilledArray only those that filled after an element in subscript index 3 is deleted, each number separate by a space, and only 5 integers per line.
- [Completed] d. Ask the user the location of an element that they want to delete next (note that the user will only enter integer value, positive, and within the subscript index). If they enter a negative value or outside of the array that have value (different than the length of array), then you will have to ask them to re-enter. Their first element is 1, not zero like in the program.
- [Completed] e. Once you get a location of element that the user want to delete (that within a range), then you will (i) print the value of that element, (b) delete that element, and (c) print the XXXX_UnfilledArray array after deletion as well as stating how many elements in the array that are filled (not the actual size).

## sortAndSearch.java

[Completed] This class, you will take the source codes that we discussed about sorting and searching (from your textbook). Make sure that they are static methods so you can call them directly from your driver.

- IntSequentialSearch : this is a sequential search method with 2 parameters (integer array and integer value for search) and then will return the position where the first occurrence is found or -1 when it is not found.
- IntBinarySearch_XXXX : this is a binary search method with 2 parameters (sorted integer array and integer value for search) and then will return the position where the first occurrence is found or -1 when it is not found.
- IntBubbleSort_MMM : this is a bubble sort method with 1 parameter (integer array to be sorted), no return value, but the array that you pass to this method will be sorted.
- IntSelectionSort_XXXX : this is a selection sort method with 1 parameter (integer array to be sorted), no return value, but the array that you pass to this method will be sorted.
- IntInsertionSort_XXXX_MMM : this is a insertion sort method with 1 parameter (integer array to be sorted), no return value, but the array that you pass to this method will be sorted.

## CSC 152 - Programming Assignment 2

- [Completed] You must name the class Person.java, StudentP.java, and Faculty.java
- [Completed] You must name your driver LastnameFirstINIT\*XXXX_P2.java (where XXXX is your last 4 digit of student ID)
- [Completed] Create 5 objects: one for each constructor (1 Person object, 2 Student objects, and 2 Faculty objects) [Person will have a default money, and then you need to use random number to generate any number between 300 and 800 for other objects – make sure to re-generate the value for each object] SHOULD NOT have repeated name. Hard-Code the information in your driver, DO NOT ask anything from Keyboard!!!
- [Completed] i. Each object you created, you have prefix with LastnameFirstINIT_XXXX\* for example, a variable for the first student object could be LastnameFirstINIT_XXXX_Stu1 [make sure that the variable name make sense, i.e. have meaning]
- [completed] ii. One student should have your information (note that an object for Person class should not be your name, all 5 object should have different information) and another is one of your peer (friend) that are not in CSC 152 class
- [Completed] iii. One faculty should be your one of your MATH instructor or another CSC course that not CSC 152 instructor (could be your CSC 151 Lab instructor from last semester). If you do not have any other course, then go to MATH department website and pick one of faculty.
- [Completed] iv. Another faculty should be one of your non-Science class (e.g. English, History, etc.) you taking this semester. If you do not take other course, then go to ENGLISH or HISTORY department website and pick one of faculty.

- [Completed] b. Print all 5 objects information on the screen – design your own output screen, make sure that all data has appropriate labels.
- [Completed] c. On your friend student object (the 2nd Student object), complete the following
- [Completed] i. Change Major:: Ask user to enter new major, and based on what user input, then you will use appropriate method to change the student’s major
- [Completed] ii. Then, call shop( ) method on this student, with the value of your last 2 digit of students ID as the spending amount. Print current status of this student object.

- [Completed] iii. Then, call work( ) method with a random number of hours between 30 and 50 (include) and payrate of \$12.50. Print the current status of this student object.
- [Completed] iv. Note, you will print the updated information of this student object – after changing major, after shop, and after work (each time).

### Faculty.java

- A Faculty class is inherited from a Person class (see UML diagram)
- [Completed]: 2 additional instance data: department, position (both are String)
- [Completed]: 2 constructors: one with all 6 attributes and another only 4 attributes required in Person class
- [Completed]: Methods: getDepartment, setDepartment, getPosition, setPosition; ; need to override toString to include data in Faculty class

### StudentP.java

- A Student class is inherited from a Person class (see UML diagram)
- [Completed]: 2 additional instance data: major, gpa (String and double)
- [Completed]: 2 constructors: one with all 6 attributes and another only 4 attributes required in Person class
- [Completed]: Methods: getMajor, setMajor, getGpa, setGpa; need to override toString to include data in Student class

### Person.java

- [Completed]: Create 2 constructor, the first constructor has 4 parameter – firstname, lastname, yearOfBirth, money Set GPA to 0.0, major to “Undeclared”, and minor to “No Minor”
- [Completed]: b. the 2nd constructor has 6 parameters -- firstname, lastname, yearOfBirth, money, major, and gpa. Then, set minor to “No Minor”
- [Completed]: c. Implement appropriate accessor and mutator methods as shown on UML diagram.
- [Completed]: d. Override toString method to show all attributes with TAB delimited, except firstname and lastname that will separate by a space. [use toString method from super class as the starting]

## CSC 152 – Programming Assignment 1

[Background]:

- You must name the java class Student_XXX.java (using the UML class diagram)
  [Completed]: Name Java Class: Student.java
- You must name the java driver, program to test your class LASTNAMEfirstInitial_P1.java
  [Completed]: Name driver: CSC152_P1.java
  [Completed] The first line of your output should state: “I, YOURNAME, did not receive any assistant from anyone other than Dr. Boonthum-Denecke Spring 2020.” [Not tutor help for this because it is CSC 151 concepts][completed] The last line of source code, put a comment “java file name (Student.java), created by YOURNAME and ID, Spring 2020”

[Objectives]:

- (1) Read a list of Students from a file (given on blackboard, “StudentListScores.txt”) – using Scanner object Each line contains 4 columns: firstname, lastname, score1, and score2 (note that score3 will be from Random) It uses “TAB” (or space) as a delimiter.
  - [Completed]: Create Scanner object which will read data from a file: "StudentListScores.txt"
- (2) For each Student in the list, it will
  - (3) use Random number class to generate an integer between 15 and 30 (include 30), and this will be score3. -[Completed]: use Math.Random to generate int between 15 and 30 assign to score3
  - (4) [Completed]: create aStudent object using information reading from a file (fName, lName, score1, and score2) and random value of score3
  - (5) [Completed]: check an average of 3 scores, and print appropriate information for each average
    - if average is >= 27, print “Excellence, A”
    - if average is >=24 but < 27, print “Good, B”
    - if average is >=19 but < 24, print “Okay, C”
    - otherwise, print “Need Improvement”
- [Completed]: (6) At the end of the program, also print how many Students are in the list.
  - [Completed]: Create an integer counter noStudent and increment it by 1 each time a new Student is processed. [DO NOT hard code since your program has to work in any situation]
- [Completed](7) Update data file by adding two student records (2 lines) at the end of the given data file:
  one student with your information and another student with your friends information.
  You can use any scores between 20-30 for score1 and score2.
  RE-RUN your program and take another screenshot of the output. [So, you should have 2 screenshot, one is with the original data, and the second one is of the new data set once you add another record to your data file] -[Completed]: print student information to CSC152_P1Output.txt

[Future]

- [Completed] set new name (First/Last)
- [Completed] get new name (First/Last)
- [Completed] set new scores (setScores)
- [Completed] configure average and message for aStudent object
- [Completed] set newScore3 for each aStudent object
- [Completed] set newAverage for each aStudent object

## CSC151_P5v2

[Completed] Overall:

- The data file, each row representing a record of student. It contains first name, last name, and 5 quizzes score. Your task is to read these data from an input file and then calculate the quiz total and average for each student as well as the class statistics, for min score, max score, and average score for each quiz.
- [Completed]: read name, and score from file for each student
- [Completed]: calculate the quiz total and average for each student
- [Completed]: calculate the class min score, max score, & average score

- Your task is to read these data from an input file and then calculate the quiz total and average for each student as well as the class statistics, for min score, max score, and average score for each quiz.
- [Completed]: Need quiz total and average for each student

- (1) Read a list of persons from a file (given on blackboard, “LASTNAME_Scores.txt” – replace LASTNAME with your last name for this program) – using Scanner object, Each line contains 7 columns: first_name, last_name, and 5 quizzes scores.
- [Completed]: use scanner object to read file "WilliamsJr_Scores.txt"

- (2) For each student and scores in the file, the program will (a) calculate each student total score and average score (only 2 decimal point)
- [Completed]: calculate each students total score and average score (round to 2 decimal places)

- (3) At the end, the program will print out the statistics summary of this class (a) min average score for this class (b) max average score for this class (c) average for this class (d) total number of students
- [Completed]: Print class min average score (lowest students average)
- [Completed]: Print class max average score (highest students average)
- [Completed]: Print class average score (all students average)
- [Completed]: Print total number of students in class

- (4) You will also write the exact same output you print on the screen to a file call, LastnameFirstInit_P5Output.txt -[Completed]: write stats to file: "WilliamsJrS_P5Output.txt"

[Future]:

- Create setters and getters for this program
  - [TODO]Optimize: calculating class average
  - [TODO]min score
  - [TODO]max score
  - [TODO]class min average score
  - [TODO]class max average score

## CSC151_P5

[TODO] Overall:

- Your task is to read these data from an input file and then calculate the quiz total and average for each student as well as the class statistics, for min score, max score, and average score for each quiz.

- [COMPLETED] 1st: read a list of persons from a file using Scanner object. Each line contains 7 columns: first_name, last_name, and 5 quizzes scores
- [COMPLETED] 2nd: For each student and scores in the file, the program will (a) calculate each student's total score and average score (only 2 decimal points)
- [Completed] 3rd: At the end, the program will print out the statistics summary of this class (a) min average score for this class (b) max average score for this class (c) average for this class (d) total number of students 1. Needs a counter for all the scores of the class (classScoreTotal) 2. Needs a counter for minimum average (classMinAverage) 3. Needs a counter for maximum average (classMaxAverage) 4. Needs a counter for total number of students (classStudentTotal)
- [Completed]: needs to get accurate reading of min and max values from each student
- [Completed] 4th: You will also write the exact same output you print on the screen to a file called, LastnameFirstInit_P5Output.txt

## IceCream.java

[TODO]: Establish setters and getters for:

- [completed] name
- [completed] noScoops
- [completed] flavor
- [completed] scoopCost
- [completed] calculateTotal
- [completed] change

- [TODO]: Find a way to calculateTotal using the flavorCost \* noScoops
- [TODO]: create the ability to instantiate an object from this IceCream class into the driver
- [TODO]: create a function to: caculate change

## CSC151_P4.java

- This is a continuation of IceCreamDriver2.
- This file will offer input validation:

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

- [Completed] while change > scoopCost && the user said yes, noScoop++. totalCost = scoopCost \* noScoops. Subtract that particular scoopCost from the change that we currently have
- [Completed] need to find a loop that allows the user to exit the store, even if they can afford to buy another scoop (line 196)
- [Completed]: if you overpay, and say you dont want another scoop, there is no way to exit
- [Completed]: currently if you overpay it tells you that you owe an additional \$- negative value. Create if/else or switch statement that deals with negative values
- [Completed]: ensure that a name is entered for the order (cannot be blank)
- [Completed]: print a reciept for: name, flavor, noScoops, scoopCost, totalCost, userTender, and change -[TODO]: Find out why when you have leftover cash, and you say yes to another scoop it takes 2 scoops initially then just 1

- [Future]:

  - 1. instantiate an object from iceCream class
  - 2. create setters and getters to store the order name, order number, flavor, number of scoops, total price, number of items added, number of scoops tenders added, subtotals

- [TODO]: add the ability to enter other flavors to your order.

- [Future]: guard against foreign curencies (unicode validation)
- [Future]: payment verification
- [Future]: offer buyers rewards based on how long they have been in our system

## IceCreamDriver2.java

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

## CSC151_P3

- This is an ice cream stand, in the next iteration I will use the ice cream class to create user defined methods to set and retrieve the values pertaining to the ice cream stand.

- I will add each order to a stack, and ask the user if they would like to create another order.
