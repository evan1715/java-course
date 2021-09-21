package wk6;

//Exercise 95: Money
public class Money {
    private final int euros, cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents/100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = new String();
        if (cents <= 10) {
            zero = "0";
        }
        return euros +"." +zero +cents +"e";
    }
}