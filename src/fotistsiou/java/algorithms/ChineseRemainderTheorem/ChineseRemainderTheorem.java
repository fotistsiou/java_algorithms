package fotistsiou.java.algorithms.ChineseRemainderTheorem;

import java.util.Scanner;

/**
 * Chinese Remainder Theorem to guess your age
 * -------------------------------------------
 * - Ask the user for the remainders of dividing your age by 3, 5 and 7.
 * - Use these remainders to predict the age of a user.
 */

public class ChineseRemainderTheorem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        scanner.close();

        // Use the Chinese Remainder Theorem to calculate the age
        // Formula: (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + ".");
    }
}
