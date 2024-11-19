//Given string and two characters chl,ch2 as input, replace all occurences of ch with ch2 and ch2 with chi in the input string.

public class swpch {

    public static String swapCharacters(String str, char ch1, char ch2) {
        // Check if input string is null or empty
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Convert the string to a char array for in-place modifications
        char[] chars = str.toCharArray();

        // Traverse through each character in the array
        for (int i = 0; i < chars.length; i++) {
            // Swap occurrences of ch1 with ch2 and ch2 with ch1
            if (chars[i] == ch1) {
                chars[i] = ch2;
            } else if (chars[i] == ch2) {
                chars[i] = ch1;
            }
        }

        // Convert the modified char array back to a string and return it
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello world";  // Example input string
        char ch1 = 'h';  // Character to replace
        char ch2 = 'w';  // Character to swap with

        String output = swapCharacters(input, ch1, ch2);
        System.out.println("Modified string: " + output);
    }
}
