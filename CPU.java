
/**
 * cpu
 */

import java.util.Random;

public class CPU {

    public int makeMove() {
        Random random = new Random();
        int input = random.nextInt(3);
        return input;
    }

}