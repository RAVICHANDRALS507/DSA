import java.util.Scanner;

public class kwords {
    public static String getFirstKWords(String str, int k) {
        if (str == null || str.isEmpty() || k <= 0) {
            return ""; 
        }

        int wordCount = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += ch;

            if (ch == ' ') {
                wordCount++;
                if (wordCount == k) { 
                    break;
                }
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the number of words to extract: ");
        int k = scanner.nextInt();

        // String result = (getFirstKWords(sentence, k);
        System.out.println(getFirstKWords(sentence, k));

        scanner.close();
    }
}
