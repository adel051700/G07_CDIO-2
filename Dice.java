/**
 * Class has method rollDie, that returns a random integer between 1 and number of sides specified.
 */
import java.util.Random;

class Dice {

    public static int rollDie(int sides) {
        Random r = new Random();
        int rInt = r.nextInt(sides);

        return rInt + 1; 

    }
    
}

