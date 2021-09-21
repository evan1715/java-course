package wk4;

//Exercise 78: Clock using a counter
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    //added this from wk5 ex89 clock object to use and overload the constructor
    public BoundedCounter(int upperLimit, int value) {
        this.upperLimit = upperLimit;
        this.value = value;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) { //Ex78.2 Printing the initial zero
            return "0"+this.value;
        }
        return ""+this.value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

/*
Important notes regarding the use of objects. You should definitely read these.

Object-oriented programming is mostly about turning concepts into their own entities, or in other words forming abstractions. One might think that it is pointless to create an object that only holds one number in it, and that the same could be achieved with simple int variables. This is not the case. If a clock consists of just 3 int variables that are then increased, the program loses some human readability. It becomes more difficult to "see" what the program is about. Earlier in the material we mentioned the advice of the renown programmer Kent Beck: "Any fool can write code that a computer can understand. Good programmers write code that humans can understand", since the hand of a clock is its own clearly definable concept, it is a good idea to create it an own class - BoundedCounter - for the sake of human readability.

Turning a concept into a class of its own is a good idea for a lot of reasons. Firstly, some details (i.e. when the counter makes a full round) can be hidden inside the class (abstracted). Instead of writing an if-clause and an assignment operation, it is enough that the user of the counter calls the descriptively named method next(). In addition to clocks, the created counter might be good for being used as a building block for other projects too, so a class made from a clear concept can be very versatile. Another huge advantage we gain by writing code this way, is that when the details of the mechanics are hidden, they can be changed if need be.

We established that a clock contains three hands, it consists of three concepts. Actually the clock itself is a concept too and next week we will make the class Clock. Then, we can create distinct Clock objects. Clock will be an object which functionality is based on "simpler" objects, the hands. This is the grand idea of object-oriented programming: a program is built out of small, clearly defined co-operating objects.

Now, we will take some careful first steps in the object world. Towards the end of the course, objects will start to come to you naturally and the idea of programs being built out of small, well defined, co-operating pieces - which at this point might feel incomprehensible - will become something you will take for granted.
*/