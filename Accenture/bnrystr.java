import java.util.Scanner;

public class bnrystr {

    public static int OperationsBinaryString(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }

        char[] chars = str.toCharArray();
        int result = chars[0] - '0';
        int ans = result;

        for (int i = 1; i < chars.length - 1; i += 2) {
            char operation = chars[i];
            int nextDigit = chars[i + 1] - '0';

            if (operation == 'A') { // AND operation
                ans = ans & nextDigit;
            } else if (operation == 'B') { // OR operation
                ans = ans | nextDigit;
            } else if (operation == 'C') { // XOR operation
                ans = ans ^ nextDigit;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //String str = "1C0C1C1A0B1";
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(OperationsBinaryString(str)); // Expected output is 1
    }
}
