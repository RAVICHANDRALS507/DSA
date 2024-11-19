public class decbi {

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";  // Special case for zero
        }

        String binary = "";  // Initialize an empty string to store binary representation

        while (decimal > 0) {
            int remainder = decimal % 2;  // Get the last binary digit (0 or 1)
            binary = remainder + binary;  // Append remainder to the front of the string
            decimal /= 2;  // Divide decimal by 2 to shift right
        }

        return binary;  // Return the final binary string
    }

    public static void main(String[] args) {
        int decimalNumber = 43;  // Example decimal number
        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryRepresentation);
    }
}
