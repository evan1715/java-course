package wk4;

//Exercise 81: Password randomizer
import java.util.Random;

public class PasswordRandomizer {
    private int len;
    private Random random;

    public PasswordRandomizer(int length) {
        this.len = length;
        this.random = new Random();
    }

    public String createPassword() {
        String passString = new String();
        int i = 0;

        while (this.len > i) {
            int number = this.random.nextInt(23);
            char symbol = "abcdefghijklmnopqrstuvxyz".charAt(number);
            passString += symbol;
            i++;
        }
        return passString;
    }
}