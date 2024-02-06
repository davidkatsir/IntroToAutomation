package lessonTwo;

public class LoopsTargil8 {
    public static void main(String[] args) {
        // רמה מתקדמת
        // תרגיל 1
        System.out.println("Prime numbers between 2 and 100: ");

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check for factors up to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;  // This break statement exits the inner loop
                }
            }

            // If isPrime is still true, then the number is prime
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}