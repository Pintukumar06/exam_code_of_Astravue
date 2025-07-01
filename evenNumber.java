public class evenNumber {

    // To display numbers from X to Y whose digit sum is even

    public static void displayEvenDigitSumNumbers(int X, int Y) {
        System.out.println("Numbers from " + X + " to " + Y + " with even digit sum:");

        for (int i = X; i <= Y; i++) {
            int sum = getDigitSum(i);
            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Use to calculate sum of digits of a number

    public static int getDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  // To Get the last digit
            number = number / 10; // To Remove the last digit
        }
        return sum;
    }

    // Main method.
    public static void main(String[] args) {
        int X = 10;
        int Y = 30;
        displayEvenDigitSumNumbers(X, Y);
    }
}
