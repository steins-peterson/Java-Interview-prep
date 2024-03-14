public class FindSecondLargestinArray {
    public static int findSecondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // let's loop through the array
        for(int num : arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,7,5};
        int secondLargest = findSecondLargest(arr);

        if(secondLargest != Integer.MIN_VALUE){
            System.out.println("The second largest number in the array is: " + secondLargest);
        } else{
            System.out.println("There's no second largest number in the array!");
        }
    }
}
