package wk5;

//Exercise 86.2: Cash Register and paying with cash

public class CashRegister {
    private double cashInRegister;
    private int economicalSold, gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000; //at the star, register has 1000 euros
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.50) {
            cashGiven -= 2.50;
            this.cashInRegister += 2.50;
            this.economicalSold++;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.00) {
            cashGiven -= 4.00;
            this.cashInRegister += 4.00;
            this.gourmetSold++;
        }
        return cashGiven;
    }

    //Exercise 86.3: Paying with card
    public boolean payEconomical(LyyraCard card) {
        if (card.getBal() >= 2.50) {
            card.payEconomical();;
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.getBal() >= 4.00) {
            card.payGourmet();
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Money in register: " +cashInRegister +" economical lunches sold: "
                +economicalSold +" gourmet lunches sold: " +gourmetSold;
    }

    //Exercise 86.4: Loading money
    public void loadMoneyToCard(LyyraCard card, double sum) {
        card.loadMoney(sum);
        if (sum > 0) {
            this.cashInRegister += sum;
        }
    }


}