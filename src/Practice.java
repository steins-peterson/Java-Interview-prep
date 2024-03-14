import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static int findSecondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num>secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {9, 12, 53, 19, 77, 81};
        int secondLargest = findSecondLargest(arr);

        if(secondLargest != Integer.MIN_VALUE){
            System.out.println("The second largest in the array is: " + secondLargest);
        } else {
            System.out.println("There's no second largest ");
        }
    }
}