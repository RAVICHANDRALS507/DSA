import java.util.*;

public class pat_fib {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int str = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=str;j++){
                System.out.print(a+"\t");
                int c = a+b;
                a = b;
                b = c;
        }
        str++;
        System.out.println();
    }
    }
}