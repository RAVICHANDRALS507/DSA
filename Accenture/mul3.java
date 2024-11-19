public class mul3 {

    public static int countClimbableHouses(int[] A) {
        int count = 0; 
        for (int roofHeight : A) {
            if (roofHeight % 3 == 0) { 
                count++; 
            }
        }

        return count; 
    }

    public static void main(String[] args) {
        int[] roofs = {3, 5, 9, 12, 7}; 
        int result = countClimbableHouses(roofs);
        System.out.println("Number of houses Alice can climb: " + result);
    }
}
