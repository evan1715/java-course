package wk5;

//Exercise 85: Reformatory
public class Reformatory {
    private int i;

    public Reformatory() {
        this.i = 0;
    }

    //Exercuse 85.1: Weight of a person
    public int weight(Person person) {
        this.i++; //count how many times we've called this method
        return person.getWeight();
    }

    //Exercise 85.2: Feeding a person
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }

    //Exercise 85.3: Number of times a weight has been measured
    public int totalWeightsMeasured() {
        return this.i;
    }
}