package wk4;

//Exercise 79: NumberStatistics
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int num) {
        if (num > 0) {
            this.amountOfNumbers++;
            sum = sum + num;
        }
        
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    //Exercise 79.2: sum and average
    public int sum() {
        return sum;
    }

    public double average() {
        return sum/(double)amountOfNumbers;
    }
}