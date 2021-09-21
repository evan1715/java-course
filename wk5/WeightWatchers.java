package wk5;

import java.util.ArrayList;

//23.5 An object as a method parameter
//23.10 A list of objects within an object

public class WeightWatchers {
    private double lowestWeightIndex;
    //23.10 A list of objects within an object
    private String name;
    private ArrayList<Person> members;

    public WeightWatchers(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }

    //23.10 A list of objects within an object
    public WeightWatchers(String name, double lowestWeightIndex) {
        this.lowestWeightIndex = lowestWeightIndex;
        this.name = name;
        this.members = new ArrayList<Person>();
    }

    public boolean isAcceptedAsMember(Person person) {
        if (person.BMI() < this.lowestWeightIndex) {
            return false;
        }
        return true;
    }

    //23.10 A list of objects within an object
    public void addAsMember(Person person) {
        if (!isAcceptedAsMember(person)) {
            return;
        }
        this.members.add(person);
    }

    public String toString() {
        String memberAsString = new String();

        for (Person member:this.members) {
            memberAsString += " " +member.getName() +"\n";
        }

        return "WeightWatchers " +this.name +" members: \n" +memberAsString;
    }

    //23.11 Method returns an object
    public Person fattestMember() {
        //if member list is empty, return null
        if (this.members.isEmpty()) {
            return null;
        }
        
        Person fattest = this.members.get(0);

        for (Person person:this.members) {
            if (person.BMI() > fattest.BMI()) {
                fattest = person;
            }
        }

        return fattest;
    }

}