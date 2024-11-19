import java.util.*;

public class switch {
    public static int minSwitchesToTurnOnAllBulbs(int[] bulbs) {
        int presses = 0;

        for (int i = 0; i < bulbs.length; i++) {

            if ((bulbs[i] ^ (presses % 2)) == 0) {
                presses++;
            }
        }

        return presses;
    }

    public static void main(String[] args) {
        int[] bulbs = {0, 0, 1, 0, 1}; 
        //int result = minSwitchesToTurnOnAllBulbs(bulbs);
        System.out.println(minSwitchesToTurnOnAllBulbs(bulbs));
    }
}
