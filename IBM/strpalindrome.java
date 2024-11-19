import java.util.Scanner;

public class strpalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int st = 0;
        int ed = s.length()-1;

        while(st < ed){
            if(s.charAt(st) == s.charAt(ed)){
                System.out.print("panaldrome");
            }else{
                System.out.print("Not Palindrome");
            }
            st++;
            ed--;
        }
    }
}
