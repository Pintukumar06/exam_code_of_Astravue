public class primeNumbers {

    // To generate prime numbers from 1 to N
    public static void generatePrimes(int N) {
        System.out.println("Prime numbers from 1 to " + N + ":");

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            // Check if i is divisible by any number from 2 to i-1
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    // Main method.
    public static void main(String[] args) {
        int N = 30; // You can change the value as your wish
        generatePrimes(N);
    }
    
}
