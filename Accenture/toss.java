// You are playing a game of Toss and Score in the Hillwood City Mall with your friends. The
// game consists of the following rules:
// • Toss an unbiased coin multiple times.
// • For each heads you get 2 points and for each tails you lose 1 point.
// • The game ends as soon as you get 3 heads in a row, or you toss the coin throughtout the
// length of string S.
// You have been given a string S consisting of letters H (for heads) and T (for tails) denoting the
// sequence of result. Your task is to find and results you get on the toss of coin N return an
// integer value representing the final score you get once the game ends.

public class toss {

    public static void main(String[] args) {
        String S = "HHTHTHHHTH";
        int result = calculateScore(S);
        System.out.println("Final score: " + result);
    }

    public static int calculateScore(String S) {
        int score = 0;
        int consecutiveHeads = 0;

        for (char toss : S.toCharArray()) {
            if (toss == 'H') {
                score += 2;
                consecutiveHeads++;
                // End the game if there are 3 heads in a row
                if (consecutiveHeads == 3) {
                    break;
                }
            } else if (toss == 'T') {
                score -= 1;
                consecutiveHeads = 0; // Reset the consecutive heads count
            }
        }

        return score;
    }
}
