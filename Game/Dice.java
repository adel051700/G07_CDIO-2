/**
 * Class has method rollDie, that returns a random integer between 1 and number of sides specified.
 */
import java.util.Random;

class Dice {
    private int sides;
    public Dice(int sides)
    {
        this.sides = sides;
    }

    public int rollDie() {
        Random r = new Random();
        int rInt = r.nextInt(this.sides);

        return rInt + 1; 

    }
    
}

