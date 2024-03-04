import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1 = input.nextLine();

        System.out.println("Enter a String: ");
        String str2 = input.nextLine();

        if(areAnagrams(str1.toLowerCase(),str2.toLowerCase())){
            System.out.println("The user entered Strings are anagrams");
        } else{
            System.out.println("Not anagrams");
        }
    }
    public static boolean areAnagrams(String str1, String str2){
        char[] charArray1 = str1.toCharArray(); // we are converting them like this because it will be easy to manipulate
        // as a character
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1); // this method sort the characters in the array in ascending order.
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
