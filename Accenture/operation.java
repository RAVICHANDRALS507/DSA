public class operation {
    public static void main(String[] args) {
        int N = 234;  // Example input
        int result = (N % 2 == 0) ? sumOfDigits(N) : productOfDigits(N);
        System.out.println("Result: " + result);
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int N) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }

    // Method to calculate the product of digits
    public static int productOfDigits(int N) {
        int product = 1;
        while (N > 0) {
            product *= N % 10;
            N /= 10;
        }
        return product;
    }
}
