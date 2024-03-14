public class NumberSwapperWithoutThirdVariable {
    public static void main(String [] args){
        int num1 = 5;
        int num2 = 10;

        // Printing before swapping the numbers
        System.out.println(num1);
        System.out.println(num2);

        // Let's start swapping

        num1 = num1+ num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("value of num1 after swapping: "+ num1);
        System.out.println("value of num2 after swapping: "+ num2);
    }
}
