import java.util.*;

public class nth_fib {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
            int b = 1;
        for(int i=0;i<n;i++){
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.print(a);
    }
}
