// calculate spaces of two given input strings and return a string with whether their differrence is
// odd or even with ":" and count
// example
// inputl : "abc bcd cda"
// input2: "abc bc"
// Output:
// "Odd:l "


public class space {

    public static String findSpaceDifference(String input1, String input2) {
        // Step 1: Count spaces in both input strings
        int count1 = 0, count2 = 0;

        // Count spaces in the first string
        for (char ch : input1.toCharArray()) {
            if (ch == ' ') {
                count1++;
            }
        }

        // Count spaces in the second string
        for (char ch : input2.toCharArray()) {
            if (ch == ' ') {
                count2++;
            }
        }

        // Step 2: Calculate the absolute difference
        int difference = count1 - count2;
        if (difference < 0) {
            difference = -difference; // Convert negative to positive
        }

        // Step 3: Determine if the difference is odd or even
        String oddOrEven; // Declare the variable
        if (difference % 2 == 0) {
            oddOrEven = "Even"; // If the difference is even
        } else {
            oddOrEven = "Odd";  // If the difference is odd
        }

        // Step 4: Return the formatted result
        return oddOrEven + ":" + difference;
    }

    public static void main(String[] args) {
        // Test the function
        String input1 = "abc bcd cda"; // Example input
        String input2 = "abc bc";      // Example input
        
        String result = findSpaceDifference(input1, input2);
        System.out.println(result);  // Expected Output: "Odd:1"
    }
}
