import java.util.*;
public class bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int N = scanner.nextInt();
        
        int result = minbit(N);
        System.out.println("The minimum possible number is: " + result);
    }

    public static int minbit(int N) {
        int count = Integer.bitCount(N);
        return (1 << count)-1;
   }
}