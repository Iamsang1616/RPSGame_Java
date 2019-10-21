/**
 * printMove
 */
public class printMove {

    public static void PrintMove(String name, int move) {
        switch (move) {
        case 0:
            System.out.println(name + " HAS CHOSEN ROCK");
            break;
        case 1:
            System.out.println(name + " HAS CHOSEN PAPER");
            break;
        case 2:
            System.out.println(name + " HAS CHOSEN SCISSORS");
            break;
        }
    }
}