package fotistsiou.java.algorithms.PrimeNumbers;

public class HundredthPrime {
   public static void main(String[] args) {
      int currentNumber = 2;
      int counter = 0;
      int maxNumber = 100;

      while (counter < maxNumber) {
         boolean isPrime = true;

         // Check if currentNumber is prime, based on the below property of prime numbers:
         // If a number n has no divisors less than or equal to its square root, then it is prime.
         for (int divisor = 2; divisor <= Math.sqrt(currentNumber); divisor++) {
            if (currentNumber % divisor == 0) {
               isPrime = false;
               break;
            }
         }

         // If currentNumber is prime, increment counter
         // If currentNumber is the 100th prime, print currentNumber and exit program
         if (isPrime) {
            counter++;
            if (counter == maxNumber) {
               System.out.println(currentNumber);
            }
         }

         // Move to the next number
         currentNumber++;
      }
   }
}