package fotistsiou.java.algorithms.PerfectSquare;

import java.util.Scanner;

/**
 * Perfect Square
 * --------------
 * Create a Java program that finds and prints the first perfect square number greater than a given input number.
 * - Input: An integer N (1 <= N <= 10000)
 * - Output: The first perfect square number greater than N
 */

public class PerfectSquare {
    public static void main(String[] args) {
        // Read an integer N from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer N (1 <= N <= 10000):");
        int N = scanner.nextInt(); 
        scanner.close();

        // Initialize 'number' as the next integer after N
        int number = N + 1;

        // Loop to find the next perfect square
        while (true) {
            // Calculate the square root of 'number'
            double sqrt = Math.sqrt(number);

            // Check if the square root is an integer (i.e., a perfect square)
            if (sqrt == (int)sqrt) {
                // If a perfect square is found, print it and exit the loop
                System.out.println(number);
                break;
            }

            // Increment 'number' and continue the search
            number++;
        }
    }
}