//Charles is given an array A. He wants to find the count of occurrences of second largest element in the array. Your task is to help him find and return an integer value representing the count of occurrence of the second largest element in an array.

public class seclarge{
    public static int countSecondLargestOccurrence(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;  // Return 0 if array is null or has less than 2 elements
        }
    
        Integer largest = null;
        Integer secondLargest = null;
    
        // Find the largest and second largest elements
        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;  // Update secondLargest before changing largest
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }
    
        // If there's no valid second-largest element, return 0
        if (secondLargest == null) {
            return 0;
        }
    
        // Count occurrences of the second-largest element
        int count = 0;
        for (int num : arr) {
            if (num == secondLargest) {
                count++;
            }
        }
    
        return count;
    }
    

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 6, 7, 5, 6, 3, 7};
        int result = countSecondLargestOccurrence(arr);
        System.out.println("Count of occurrences of the second largest element: " + result);
    }
}
