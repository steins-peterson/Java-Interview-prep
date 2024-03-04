import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userIP = input.nextLine();

        String rev = "";

        for(int i = userIP.length()-1; i>=0; i--){
            rev = rev + userIP.charAt(i);
        }

        if(userIP.equals(rev)){
            System.out.println("We have a Palindrome!");
        } else{
            System.out.println("Not a Palindrome");
        }

        System.out.println(rev);





    }
}
