public class BinarySearch {
    public static int binarySearch(int [] arr , int key){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == key){
                return mid;
            } else if (arr[mid]<key) {
                low = mid + 1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,9};
        int key = 5;

        int result = binarySearch(arr,key);

        if(result !=-1){
            System.out.println("the key is found at index: "+ result);
        } else {
            System.out.println("The key is not there ");
        }
    }

}
