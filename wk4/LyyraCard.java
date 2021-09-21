package wk4;

//Exercise 77: Lyyra-card
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
            this.bal = this.bal - 4.00;
        }
    }

    //Exercise 77.4: Loading money onto card
    public void loadMoney(double amount) {
        if (amount < 0) {
            this.bal = this.bal + 0;
        } else {
            this.bal = this.bal + amount;
            if (this.bal > 150 ) {
                this.bal = 150;
            }
        }
    }

}