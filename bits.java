import java.util.Scanner;

public class bits {

    public static int getMinimumRearrangedNumber(int N) {
         int count = Integer.bitCount(N);
         return (1 << count)-1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int N = scanner.nextInt();
        
        int result = getMinimumRearrangedNumber(N);
        System.out.println("The minimum possible number is: " + result);
    }
}