package wk5;

//Exercise 84: Overloaded counter, multiple constructors
public class Counter {
    private boolean check;
    private int startingValue;

    //creates new counter with given value, check is on if parameter was true
    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    //creates new counter with given value. Check is off.
    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = false;
    }

    //creates a new counter with the starting value 0. Check is on if true
    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
    }

    //creates new counter with starting value of 0 and with checking off
    public Counter() {
        this.startingValue = 0;
        this.check = false;
    }

    //return the current value of the counter
    public int value() {
        return this.startingValue;
    }

    //increase the value of the counter by one
    public void increase() {
        this.startingValue++;
    }

    //decrease the value of the counter by one, but now below 0 if the check is on
    public void decrease() {
        if (check && this.startingValue > 0) {
            this.startingValue--;
        } else if (!check) {
            this.startingValue--;
        }
    }

    //Exercise 84.2: Alternative methods
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.startingValue = this.startingValue + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (check && decreaseAmount <= this.startingValue) {
            this.startingValue = this.startingValue - decreaseAmount;
        } else if (!check) {
            this.startingValue = this.startingValue - decreaseAmount;
        }
    }

    //23.12 Method returns an object it creates
    public String toString() {
        return "Value: " +startingValue;
    }

    public Counter clone() {
        Counter clone = new Counter(this.startingValue);
        return clone;
    }



}