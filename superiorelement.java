// Problem statement
// In an array a superior element is one which is greater than all elements to its right. The rightmost element
// will always be considered as a superior element.
// You are given a function,
// Int FindNumberOfSuperiorElements(int* arr, int n);
// The function accepts an integer array 'arr' and its length Implement the function to find and retum the
// number of superior elements in array 'arr'.

// Assumptions:
// 1. N>O.
// 2. Array index starts from O.


import java.util.*;
public class superiorelement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                count  = count+1;
            }
        }
        System.out.println(count);
        
    }
}
