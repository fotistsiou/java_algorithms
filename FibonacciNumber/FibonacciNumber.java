public class FibonacciNumber { 
    // Cache for storing Fibonacci numbers
    public static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to know its Fibonacci number:");
        int n = scanner.nextInt();

        // Cache for storing Fibonacci numbers, initialized to size n+1
        fibonacciCache = new long[n + 1];

        // Print the Fibonacci Number of n 
        long startTime = System.nanoTime();
        System.out.println("The Fibonacci Number of the number " + n + " is: " + fibonacci(n));
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("The calculation of Fibonacci Number took: " + String.format("%.7f", duration) + " seconds.");

        // Print the Fibonacci Sequence up to F(n)
        System.out.print("Fibonacci sequence up to F(" + n + "): ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciMemoization(i) + " ");
        }
        
        scanner.close();
    }

    public static long fibonacciMemoization(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n]; // Return cached value if it exists
        }

        // Recursive call with memoization
        long nthFibonacciNumber = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        fibonacciCache[n] = nthFibonacciNumber; // Cache the result

        return nthFibonacciNumber;
    }
}