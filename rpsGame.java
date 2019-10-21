
/**
 * Main function to handle RPS
 */

import java.util.*;

public class rpsGame {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    static Scanner sc = new Scanner(System.in);
    static public int p1_score, p2_score = 0;

    public static void main(String[] args) {

        Player p1 = new Player();
        CPU p2 = new CPU();

        p1.setName();

        int round = 0;
        int p1_move, p2_move;

        System.out.println("==== GAME START ====\n");

        // Go to best of 9
        while (p1_score != 5 && p2_score != 5) {

            // print round number
            System.out.println("ROUND " + round + "\n");
            p1_move = p1.makeMove();
            p2_move = p2.makeMove();
            System.out.println("=================================================");

            printMove.PrintMove(p1.getName(), p1_move);
            printMove.PrintMove("CPU", p2_move);

            int result = Compare.compare(p1_move, p2_move);

            switch (result) {
            case 0:
                System.out.println("THIS ROUND IS A DRAW");
                break;
            case 1:
                System.out.println(p1.getName() + " WINS THE ROUND");
                p1_score++;
                break;
            case -1:
                System.out.println("CPU WINS THE ROUND");
                p2_score++;
                break;
            }

            System.out.println("=================================================");
            System.out.println("THE SCORE IS " + p1.getName() + ":" + p1_score + "  P2:" + p2_score);
            System.out.println("=================================================");
            round++;

        }

        if (p1_score == 5) {
            System.out.println("CONGRATULATIONS, YOU HAVE WON THE GAME");
        } else {
            System.out.println("BETTER LUCK NEXT TIME, THE CPU HAS WON THE GAME");
        }
    }
}