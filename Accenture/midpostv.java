//You are given an array arr of length n. ftnd and pnnt the element at the mid-jndex of arr Ignonng all the indices at which negative numbers ate present in the array.

public class midpostv {

    public static void main(String[] args) {
        int[] arr = {3, -2, 7, -5, 5, 9, -4};
        int result = findMiddlePositiveElement(arr);

        
            System.out.println("Middle element ignoring negatives: " + result);
    }

    public static int findMiddlePositiveElement(int[] arr) {
        int positiveCount = 0;

        // First pass: count the positive numbers
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            }
        }

        // If there are no positive numbers, return -1
        // if (positiveCount == 0) {
        //     return -1;
        // }

        // Calculate the index of the middle positive element
        int midIndex = positiveCount / 2;
        int positiveIndex = 0;

        // Second pass: find the middle positive element
        for (int num : arr) {
            if (positiveIndex == midIndex) {
                return num;
            }
            positiveIndex++;
        }

        return -1; // This should never happen with valid input
    }
}
