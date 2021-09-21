package wk4;

//Exercise 82: Lottery
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>(); //Format a list for the numbers
        this.drawNumbers(); //Draw numbers as lottery numbers are created
    }

    public ArrayList<Integer> numbers() { //returns the drawn numbers of this draw
        return this.numbers;
    }

    public void drawNumbers() { //draws new numbers
        int i = 0, number = 0;

        while (i < 7) {
            number = this.random.nextInt(39);
            if(!containsNumber(number)) {
                numbers.add(number+1);
                i++;
            }
        }
    }

    public boolean containsNumber(int num) { //reveals if the number is among the drawn
        if (this.numbers.contains(num)) {
            return true;
        }
        return false;
    }
}

//7 numbers between 1 and 39