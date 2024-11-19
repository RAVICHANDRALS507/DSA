public class decode {

    public static String decode(String input) {
        if (input == null || input.isEmpty()) {
            return "";  
        }

        String result = "";  
        int count = 0;  

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '1') {
                count++;  
            } 
                    char decodedChar = (char) ('A' + count - 1);
                    result += decodedChar;  
                    count = 0;  
                
        }

        if (count > 0) {
            char decodedChar = (char) ('A' + count - 1);
            result += decodedChar;  
        }

        return result;  
    }

    public static void main(String[] args) {
        String encodedString = "1111001110011110";  // Example input using '1's and '0's
        String decodedString = decode(encodedString);
        System.out.println("Decoded word: " + decodedString);  // Output the decoded word
    }
}
