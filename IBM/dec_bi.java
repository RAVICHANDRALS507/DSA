import java.util.*;

/**
 * dec_bi
 */
public class dec_bi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String b = "";
        int t = n;
        while(t>0){
            int r = t%2;
            t = t/2;
            b = r+b;
        }
        System.out.println(b);
    }
}