//public class ReverseArray {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4};
//        int [] rev = new int[arr.length];
//
//        for(int i = arr.length-1, j = 0; i >= 0; i-- , j++){
//            rev[j] = arr[i];
//        }
//        for(int x:rev){
//            System.out.print(x+" ");
//        }
//    }
//}


import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int rev[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        // filling rev array

        for(int i = arr.length - 1, j = 0; i>=0; i--,j++){
            rev[j] = arr[i];
        }

        System.out.println("The original array is:");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("The reverse array is: ");
        for(int num : rev){
            System.out.print(num + " ");
        }
    }

}