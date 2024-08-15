// finding sum of prime numbers till N

public class program3 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Sum of prime numbers till " + n + " is: " + primeSum(n));
    }

    public static int primeSum(int n) {
        if (n < 2) {
            return 0; // No prime numbers less than 2
        }

        int sum = 0;

        // Iterate through all numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if the current number i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;  // If i is divisible by any number other than 1 and itself, it's not prime
                    break;
                }
            }

            // If the number is prime, add it to the sum
            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }
}
