public class PrimeChecker {
    public static void main(String[] args) {
        int number = 17; // Change this number to check for different values

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // If the number is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisor other than 1 and itself, it's prime
    }
}
