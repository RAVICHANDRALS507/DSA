// Problem statement
// It is Edward's birthday today. His friends have bought him a huge circular cake.
// Edward wants to find out the maximum number of pieces he can get by making exactly N straight vertical
// cuts on the cake.
// Your task is to write a function that returns the maximum number of pieces that can be obtained by making
// N number of cuts.
// Note: Since the answer can be quite lar , modulo it by 1000000007
// Input Specification:
// inputl: An integer N denoting the number of cuts
// Output Specification:
// Return the maximum number of pieces that can be obtained by making N cuts on the cake



import java.util.*;

public class edwardbirthday {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = n*(n+1)/2+1;
        System.out.println(a);
        
    }
}
