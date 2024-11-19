public class equalpoint {

    public static int findEquilibriumPoint(int[] arr) {
        int n = arr.length;
        
        if (n == 0) return -1;  // Edge case for empty array
        
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        // Fill prefixSum array
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Fill suffixSum array
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        // Find equilibrium point
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] == suffixSum[i]) {
                return i; // Equilibrium index found
            }
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 2}; // Sample input
        int result = findEquilibriumPoint(arr);
        System.out.println("Equilibrium index: " + result);
    }
}
