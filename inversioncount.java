// Problem statement
// Let j and k be two indices in an array A.
// If j < K and A[j] > A[k], then the pair (i.k) is known as an "Inversion pair".
// You are required to implement the following function:
// int InversionCount(int int n):
// The function accepts an array 'A' of 'n' unique integers as its argument. You are required to
// calculate the number of 'Inversion pair' in an array A. and return.
// Note:
// If 'A' is NULL (None in case of python). return -1
// If n>2 return O

import java.util.Scanner;

public class inversioncount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt(); 
        }

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            } 
        }
        System.out.println(count);
    }
}
