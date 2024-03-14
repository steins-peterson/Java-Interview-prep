import java.util.Scanner;

public class FibonacciNumberAtIndex {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the fibonacci number that you want to print: ");
        int index = input.nextInt();

        System.out.println(fibonacci(num1,num2,index));

    }

    public static int fibonacci(int num1, int num2, int index){
        if (index == 0){
            return 0;
        } else if (index == 1){
            return 1;
        }

        int nextNum = 0;

        for (int i = 2; i <= index; i++){
            nextNum = num1+num2;
            num1 = num2;
            num2 = nextNum;
        }
        return nextNum;
    }
}
