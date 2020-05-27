# CSC151Labs

CSC 151/2 Labs

This will be a collection of all of the labs, projects, and classes that I was given during CSC151 & CSC152.
I will be recompleting all of my old assignments rewritten in C#.

## CSC 152 - Programming Assignment 3

[TODO] name the class sortNsearch.cs
[TODO] name your driver CSC152_P3.cs

[TODO](1) Read Input from a Text file and store them in Array of Integers

- [TODO] a. Read input from a data file, myIntegerData.txt. This will have just integers. The first number in this file will tell you how many integers value you will need to read and this will be used to define a size of your integer arrays that will be created in this assignment.

- [TODO] b. Then, you will read each of the value and store them in integer array, called MMM_myUnsortedIntegers

[TODO](2) Copy an Unsorted Array 3 times with Exact Size

- [TODO] a. You will create exact duplicate of you myUnsortedIntegers 3 times, but name them mySortedIntegers1, mySortedIntegers2, mySortedIntegers3 [Note that after your copy, all 3 arrays will have unsorted data, but the other 3 arrays will be used in sorting algorithm below]

[TODO](3) Sorting

- [TODO] a. You will use Insertion Sort Algorithm to sort MMM_mySortedIntegers1 Make sure that you print the array before and after sorting as well as including algorithm efficiency for this sorting.
- [TODO] b. You will use Selection Sort Algorithm to sort MMM_mySortedIntegers2 Make sure that you print the array before and after sorting as well as including algorithm efficiency for this sorting.
- [TODO] c. You will use Bubble Sort Algorithm to sort MMM_mySortedIntegers3 Make sure that you print the array before and after sorting as well as including algorithm efficiency for this sorting.

[TODO](4) Searching

- [TODO] a. You will create a menu that will ask the user which search algorithm and based on search algorithm, you will give them option on the arrays that they can choose.
- [TODO] i. Search Algorithm Options: (A) for Sequential Search and (B) for Binary Search
- [TODO] ii. If Search Option A is chosen (Sequential Search), you will give them a list of all 4 arrays that you created to use.
- [TODO] iii. If Search Option B is chosen (Binary Search), you will give them only 3 sorted arrays for user to choose.
- [TODO] iv. Once the user picked searching algorithm and then array to use in this search, you will ask the user to enter a target value.
- [TODO] Based on search results, you should print if the value (give the search value) is found or not in this array (give array name), and if it is found, you will tell the location/position that it is found in the array. Keep in mind that the user does not know that the array start from zero. Make sure that your screen is nice and neat; and have all necessary labels.

- [TODO] b. Then, you will ask the user if they want to search again [Yes or No].
- [TODO] i. If anything that not Yes or No enter (ignore case), you should ask them to re-enter again
- [TODO] ii. If they said “Yes,” then you will repeat all steps in 4(a) and then ask if they want to search again.
- [TODO] iii. If they said “No” then you will stop the loop.

[TODO](5) Copy an Unsorted Array with Double Size

- [TODO] a. Create a new integer array called, XXXX_UnfilledArray, that has double the size of MMM_myUnsortedIntegers and then first set of data are from MMM_myUnsortedIntegers
- [TODO] b. Create an integer variable, MMM_count, that will keep track how many elements in XXXX_UnfilledArray has values in them.
- [TODO] c. Print out values XXXX_UnfilledArray twice, [make sure to give appropriate heading]
- [TODO] i. The first one (print all elements): using enhanced for-loop and print each number separate by a space, and only 10 integers per line.
- [TODO] ii. The second one (only print elements with values): only print element with values, each number separate by a space, and only 5 integers per line.

- [TODO] d. You will ask the user to enter 4 integers and you will add them to the array XXXX_UnfilledArray (so now you should have 4 more elements filled)
- [TODO] e. Print out values XXXX_UnfilledArray only those that filled, each number separate by a space, and only 5 integers per line.

[TODO](6) Delete Elements from Array

- [TODO] a. Print the 4th element value in the array (that is, subscript index 3) XXXX_UnfilledArray
- [TODO] b. You will delete the 4th element in XXXX_UnfilledArray -- Keep in mind that now every element after will have to be shifted left (i.e. the value in index 4 (5th value) will now be in index 3, and then the value in index 5 (6th value) will now be in index 4 and so on.)

- [TODO] c. Print out values XXXX_UnfilledArray only those that filled after an element in subscript index 3 is deleted, each number separate by a space, and only 5 integers per line.
- [TODO] d. Ask the user the location of an element that they want to delete next (note that the user will only enter integer value, positive, and within the subscript index). If they enter a negative value or outside of the array that have value (different than the length of array), then you will have to ask them to re-enter. Their first element is 1, not zero like in the program.
- [TODO] e. Once you get a location of element that the user want to delete (that within a range), then you will (i) print the value of that element, (b) delete that element, and (c) print the XXXX_UnfilledArray array after deletion as well as stating how many elements in the array that are filled (not the actual size).

## sortAndSearch.cs

- [TODO] This class, you will take the source codes that we discussed about sorting and searching (from your textbook). Make sure that they are static methods so you can call them directly from your driver.

- IntSequentialSearch : this is a sequential search method with 2 parameters (integer array and integer value for search) and then will return the position where the first occurrence is found or -1 when it is not found.
- IntBinarySearch_XXXX : this is a binary search method with 2 parameters (sorted integer array and integer value for search) and then will return the position where the first occurrence is found or -1 when it is not found.
- IntBubbleSort_MMM : this is a bubble sort method with 1 parameter (integer array to be sorted), no return value, but the array that you pass to this method will be sorted.
- IntSelectionSort_XXXX : this is a selection sort method with 1 parameter (integer array to be sorted), no return value, but the array that you pass to this method will be sorted.
- IntInsertionSort_XXXX_MMM : this is a insertion sort method with 1 parameter (integer array to be sorted), no return value, but the array that you pass to this method will be sorted.

