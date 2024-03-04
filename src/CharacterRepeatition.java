import java.util.Scanner;
public class CharacterRepeatition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userIP = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        int occurences = countOccurences(userIP,ch);
        System.out.println("The character " + ch + " occurs " + occurences + " times.");

    }

    public static int countOccurences(String userIP, char ch){
        int count = 0;
        for(int i = 0; i < userIP.length(); i++){
            if(userIP.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
