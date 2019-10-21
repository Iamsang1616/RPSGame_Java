/**
 * Compare
 */
public class Compare {
    public static int compare(int p1_m, int p2_m) {
        if (p1_m == p2_m) {
            return 0;
        }

        switch (p1_m) {
        case rpsGame.ROCK:
            return (p2_m == rpsGame.SCISSORS ? 1 : -1);

        case rpsGame.PAPER:
            return (p2_m == rpsGame.ROCK ? 1 : -1);

        case rpsGame.SCISSORS:
            return (p2_m == rpsGame.PAPER ? 1 : -1);

        }

        return 0;
    }

}