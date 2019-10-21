
/**
 * player
 */
import java.util.Scanner;

public class Player {

    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.println("\nENTER YOUR NAME:");
        this.name = sc.next();
    }

    public String getName() {
        return this.name;
    }

    public int makeMove() {

        while (true) {
            System.out.println("SELECT:      [ROCK    PAPER   SCISSORS]");
            String input = sc.next().toUpperCase();

            switch (input.charAt(0)) {
            case 'R':
                return rpsGame.ROCK;

            case 'P':
                return rpsGame.PAPER;
            case 'S':
                return rpsGame.SCISSORS;

            default:
                System.out.println("Invalid entry, please try again");

                break;
            }
        }

    }

    private String name;
}