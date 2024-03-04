import java.util.Scanner;
public class ReverseAString {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String userInput = input.nextLine();
            String rev = "";

            // logic to fill the String
            for (int i = userInput.length() - 1; i >= 0; i--) {
                rev = rev + userInput.charAt(i);
            }

            System.out.println(rev);
        }
}
