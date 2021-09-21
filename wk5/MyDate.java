package wk5;

//23.7 The date as an object

public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day +"." +this.month +"." +this.year;
    }

    public boolean earlier(MyDate compared) {
        return (this.year < compared.year) || 
                (this.year == compared.year && this.month < compared.month) || 
                (this.year == compared.year && this.month == compared.month && this.day < compared.day);

        //^^^that's the same as this:
    /*  if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }

        return false;
    */
    }

    //Exercise 91.1: Next day
    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else if (this.day == 30) {
            this.month++;
        } else if (this.day == 30 && this.month == 12) {
            this.year++;
        }
    }

    //Exercise 91.2: Advancing many days
    public void advance(int numOfDays) {
        int i = 0;
        while (numOfDays > i) {
            advance();
            i++;
        }
    }

    //Exercise 91.3: Creation of a new date
    // public afterNumOfDays(int days) {
    //     MyDate newMyDate = new MyDate(this.day, this.month, this.year);
    //     advance(days);
    //     return myNewDate;
    // }


    //Exercise 92: Difference of two dates

    //Exercise 92.1: Difference in years, first version
    public int diffInYears(MyDate comparedDate) {
        int yearDiff = this.year - comparedDate.year;
        int thisDays = (this.year*365) + (this.month*30) - (30-this.day); //ex92.2
        int comparedDays = (comparedDate.year*365) + (comparedDate.month*30) - (30-comparedDate.day); //ex92.2
        int daysDiff = thisDays - comparedDays; //ex92.2

        //Exercise 92.3: And the final version
        //let's get the absolute value for the year(s)
        if (yearDiff < 0) {
            yearDiff *= -1;
        } 
        //absolute value for days as well
        if (daysDiff < 0) {
            daysDiff *= -1;
        }

        //Exercise 92.2 More accuracy
        //finally, let's see if it's a full year difference
        if (daysDiff/yearDiff < 365) {
            yearDiff--; //nope
        }

        return yearDiff;
    }


}