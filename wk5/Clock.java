package wk5;

import wk4.BoundedCounter;

//Exercise 89: Clock object

public class Clock {
    private BoundedCounter hours, minutes, seconds;

    public Clock(int startingHrs, int startingMin, int startingSec) {
        this.hours = new BoundedCounter(23, startingHrs); //(upperLimit, starting#)
        this.minutes = new BoundedCounter(59, startingMin); //(59 min, #)
        this.seconds = new BoundedCounter(59, startingSec); //(59 sec, #)
    }

    public void tick() {
        //Clock advances by one second
        this.seconds.next(); //use .next() from BoundedCounter to make it easier

        //Once we reach 60 seconds, BoundedCounter resets to 0, go to next minute
        if (this.seconds.getValue() == 0) { //getValue() from BoundedCounter
            this.minutes.next();
        }

        //When minute & second value are at 0, push to the next hour
        if (this.minutes.getValue() == 0 && this.seconds.getValue() == 0) {
            this.hours.next();
        }
    }

    public String toString() {
        return this.hours +":" +this.minutes +":" +this.seconds;
    }


}