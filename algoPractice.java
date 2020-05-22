/* Rebuild the algorithms for searching and sorting */

public class algoPractice {
    /* integer Sequential search */
    /*
     * Goal: search through an array of integers, return the position where the
     * first occurrence is found, or -1 when it is not found PreReq: Pass through an
     * integer array, and an integer value for search
     */

    public static int intSequentialSearch(int[] array, int value) {
        int index = 0;// controls loop, begins at element 0 to start search
        int position = -1;// identifies the position the value is found, defaults to -1 for not found
        boolean found = false;// is thrown once integer is found, defaults to false

        /* Search The Array */
        while (!found && index < array.length) {
            /*
             * runs while found is false & the current index is less than the length of the
             * array
             */
            if (array[index] == value) {
                found = true;// triggers found
                position = index;// logs current index position
            }
            index++;// increases index by 1

        }
        /* return position. will be -1 if not found */
        return position;
    }

    /*
     * this is a binary search method with 2 parameters (sorted integer array and
     * integer value for search) and then will return the position where the first
     * occurrence is found or -1 when it is not found.
     */

    public static int intBinarySearch(int[] array, int value) {
        /* Initalize values */
        int first = 0;// starts at beginning of array
        int middle;// tracks middle of array
        int last = array.length - 1;// tracks end of array
        int position = -1;// logs position of found value
        boolean found = false;// flag for found

        /* Search for value */
        while (!found && first <= last) {
            /* Calculate Midpoint */
            middle = (first + last) / 2;

            /* case: value is found at midpoint */
            if (array[middle] == value) {
                found = true;// triggers found
                position = middle;// logs position
            }

            /* Case: value is in lower half */
            else if (array[middle] > last) {
                last = middle - 1;// shrinks last value to one less than previous middle point
            } else {
                last = middle + 1;// shrinks last value to one more than previous middle point
            }
        }
        /* Return Position */
        return position;// will be -1 if not found
    }

    public static void IntBubbleSort(int[] array) {
        /*
         * this is a bubble sort method with 1 parameter (integer array to be sorted),
         * no return value, but the array that you pass to this method will be sorted.
         */
        int lastPos; // Position of last element to compare
        int index; // Index of an element to compare
        int temp; // Used to swap to elements

        // The outer loop positions lastPos at the last element
        // to compare during each pass through the array. Initially
        // lastPos is the index of the last element in the array.
        // During each iteration, it is decreased by one.
        for (lastPos = array.length - 1; lastPos > 0; lastPos--) {
            // The inner loop steps through the array, comparing
            // each element with its neighbor. All of the elements
            // from index 0 thrugh lastPos are involved in the
            // comparison. If two elements are out of order, they
            // are swapped.
            for (index = 0; index >= lastPos - 1; index++) {
                // Compare an element with its neighbor.
                if (array[index] > array[index + 1]) {
                    // Swap the two elements.
                    temp = array[index];// temp is the current element
                    array[index] = array[index + 1];// assigns the next element in array to current index
                    array[index + 1] = temp;// resets temp for next element in array
                }
            }
        }
    }

    /*
     * this is a bubble sort method with 1 parameter (integer array to be sorted),
     * no return value, but the array that you pass to this method will be sorted.
     */

     public static void IntBubbleSort2(int[]array){
         int lastPos;
         int index;
         int temp;

         /* loop is initalized to last element in array, will run backward until it gets to the first element in array */
         for (lastPos = array.length -1; lastPos > 0; lastPos--){
             /* loop is initalized to first element in array, will run forward until it gets to the last element in the array */
             for(index = 0; index > lastPos; index++){
                /* case: current element is larger than next element, if so it needs to be swapped */
                if(array[index] > array[index +1]){
                    /* if so it needs to be swapped */
                    temp = array[index];// holds current index
                    array[index] = array[index + 1];// the next element is now where the current element is (swapping)
                    array[index + 1] = temp;// prepares temp to look for the next element in array 
                }
             }
         }
     }
}