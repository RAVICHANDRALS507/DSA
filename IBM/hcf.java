import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int n1 = a;
        int n2 = b;
        while(a % b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        int gcd = b;
        int lcm = (n1 * n2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
