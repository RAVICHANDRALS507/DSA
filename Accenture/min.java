public class min {

    public static int countDecreasingDays(int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }

        int decreaseCount = 0; 
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) { 
            }
        }

        return decreaseCount; 
    }

    public static void main(String[] args) {
        int[] stockPrices = {100, 98, 97, 101, 99, 96}; 
        int result = countDecreasingDays(stockPrices);
        System.out.println("Total days of negative growth: " + result);
    }
}
