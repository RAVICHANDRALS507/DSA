import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        System.out.println(validatePassword(password)); 
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 4) {
            return false;
        }

        char firstChar = password.charAt(0);
        if (firstChar >= '0' && firstChar <= '9') {
            return false;
        }

        char[] chars = password.toCharArray();

        boolean hasNumeric = false;  
        boolean hasUppercase = false; 

        for (char ch : chars) {
            if (ch == ' ' || ch == '/') {
                return false;
            }

            if (ch >= '0' && ch <= '9') {
                hasNumeric = true;
            }

            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
        }

        return hasNumeric && hasUppercase;
    }
}
