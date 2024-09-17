import java.util.*;

class sumofodd{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
