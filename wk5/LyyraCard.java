package wk5;
//Exercise 77: Lyyra-card
//Exercise 86: Lyyra-card and Cash Register
public class LyyraCard {
    private double bal;

    public LyyraCard(double balAtStart) {
        this.bal = balAtStart;
    }

    public String toString() {
        return "The card has " +this.bal +" euros.";
    }

    //Exercise 77.2: Paying with card
    public void payEconomical() {
        if (this.bal > 2.50) { //77.3: Balance nonnegative
            this.bal = this.bal - 2.50;
        }
    }

    public void payGourmet() {
        if (this.bal > 4.00) { //77.3: Balance nonnegative
            this.bal -= 4.00;
        }
    }

    //Exercise 77.4: Loading money onto card
    public void loadMoney(double amount) {
        if (amount < 0) {
            this.bal += 0;
        } else {
            this.bal += amount;
            if (this.bal > 150 ) {
                this.bal = 150;
            }
        }
    }

    //Exercise 86.1: The "stupid" Lyyra card
    public double getBal() {
        return this.bal;
    }

    public boolean pay(double amount) {
        if (amount < this.bal) {
            this.bal -= amount;
            return true;
        } else {
            return false;
        }
    }

}