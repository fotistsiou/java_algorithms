package fotistsiou.java.algorithms.ReverseArray;

import java.util.Arrays;

/**
 * Reverse elements
 * ----------------
 * In this task, you need to implement reverseElements method.
 * It should reverse all rows of the two-dimensional array as in the example below.
 * P.S. You don't need to create a new array, just modify the existing two-dimensional array.
 */

public class ReverseArray {

    public static void main(String[] args) {
        int[][] twoDimArray = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}
        };
        reverseElements(twoDimArray);
        System.out.println(Arrays.deepToString(twoDimArray));
    }

    static void reverseElements(int[][] twoDimArray) {
        // Iterate through each row of the 2D array
        for (int i = 0; i < twoDimArray.length; i++) {
            // Get the length of the current row
            int len = twoDimArray[i].length;

            // Reverse the elements in the current row in-place
            // Swap elements from start and end of the row moving towards the center
            for (int j = 0; j < len / 2; j++) {
                // Temporarily store the element at the current position
                int temp = twoDimArray[i][j];

                // Swap the current element with the element from the end of the row
                twoDimArray[i][j] = twoDimArray[i][len - 1 - j];

                // Place the stored element in the position from the end of the row
                twoDimArray[i][len - 1 - j] = temp;
            }
        }
    }
}
