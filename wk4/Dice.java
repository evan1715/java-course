package wk4;
import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        return random.nextInt(numberOfSides)+1; 
    //+1 because the default range is 0 to #-1, so that the range starts at 1 to #
    }
}