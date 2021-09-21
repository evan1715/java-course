package wk4;

//Exercise 75: Decreasing counter
public class DecreasingCounter {
    private int value; //object variable that remembers the value of the counter
    private int intValue;
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.intValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("Value: " +this.value);
    }

    //Exercise 75.1: Implementing method decrease()
    public void decrease() {
        if (this.value > 0) { //Exercise 75.2: Value remains positive
            this.value--;
        }
    }

    //Exercise 75.3: Counter reset
    public void reset() {
        this.value = 0;
    }

    //Exercise 75.4: Back to initial value
    public void setIntitial() {
        this.value = intValue;
    }
}