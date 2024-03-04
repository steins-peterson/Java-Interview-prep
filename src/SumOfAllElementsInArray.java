import java.util.Scanner;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("size of the array: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        int sum = 0;

        // filling the array
        for(int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        // adding all the integers in array

        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}
