import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;

        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit; // appends
            number = number / 10;
        }

        if(originalNumber == reverse){
            System.out.println("The given number is a Palindrome");
        } else{
            System.out.println("The given number is not a palindrome");
        }

        System.out.println("The entered num is " + originalNumber + " and the reverse of that number is " + reverse);
    }
}
