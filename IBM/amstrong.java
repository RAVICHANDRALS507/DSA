import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int c = n;
        int arm = 0;
        while(n>0){
            int rem = n%10;
             arm = (rem*rem*rem)+arm;
             n = n/10;
        }
        if(c == arm){
            System.out.println("Amstrong");
        }else{
            System.out.println("Not Amstrong");
        }
    }
}
