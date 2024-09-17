// Given a number N to make a single digit number by performing
// * if N is ODD make it floor(N/2)
// * if N is Even make it floor((N-2)/2)
// * if N is already a single digit print it as it is

// Example:
// I/P = 10
// O/P = 4

// Example:
// I/P = 12
// O/P = 5

import java.util.*;
public class singledigit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n>9){
            if(n % 2 == 0){
                n = (n/2);
            }else{
                n = ((n-2)/2);
            }
            System.out.println(n);
        }
    }
}
