import java.util.Scanner;

public class VowelnConsonantCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1= input.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0 ; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'o' ||  ch == 'i' || ch == 'u'){
                vowelCount++;
            } else{
                consonantCount++;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);
    }
}
