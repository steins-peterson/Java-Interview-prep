import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        fibonacci(num1,num2,n );
    }

    public static void fibonacci(int num1, int num2 , int n){
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i <= n; i++){
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}
