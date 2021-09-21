package wk4;

//21.4 Defining your own class - object variables
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    //private will not show outside of the object, they are hidden within it, called encapsulation
    //Variables defined within a class are called object variables, fields, or attributes.
    //in main, Person bob = new Person("Bob"); to create a new object.

    //21.5 Defining your own class - constructor, or "formatting the state"
    public Person(String initialName) { //This is the constructor
        this.age = 0;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    //The constructor always has the same name as the class.
    }

    //21.6 Class definition - methods
    //With objects, the keyword 'static' is not used in method definitions.
    public void printPerson() {
        System.out.println(this.name +", age " +this.age +" years");
        //'this' is used to emphasize we are referring to the name and age of this object
    }

    //21.7 More methods
    public void becomeOlder() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }

    //21.8 The Person class grows
    public boolean isAdult() {
        return this.age>=18;
    }

    public String getName() {
        return this.name;
    }
/*  In Java, it is considered the 'correct' way to name an object-variable-returning method 
    in this manner; as getVariableName. Methods like these are often called 'getters'.

    21.9 toString
    We have been guilty of bad programming style; we have created a method that prints an 
    object, printPerson. The recommended way of doing this is by defining a method that
    returns a "character string representation" of the object. In Java, a method returning a 
    String representation is called a toString. Let us define this method for person:
*/
    public String toString() {
        return this.name +", age" +this.age +" years, my BMI is " +BMI();
    }
/*  The method toString works just like printPerson, but instead of printing it, the method 
    returns the string representation. The call to the method can be used for printing.
    The principle is that the System.out.println method requests the string representation of
    an object and then prints it. The returned string representation of the toString method 
    does not have to be written as Java adds it automatically. When the programmer writes:
    System.out.println(andy);
    Java completes the call during runtime to the formate:
    System.out.println(andy.toString());
    What happens is that the object is asked for its string representation. The string 
    representation the object is returned and is printed normally with the println command.

    21.10 More methods
    Getting the body mass index
    setWeight and setHeight are another Java style like getVariable. 
    These are called setter methods.
*/
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
/*      The parameter could also be named identically with the object variable:
        this.height = height;
        Now the name 'height' means the parameter 'height' and the identically 
        named object variable is referred to as 'this.height'. */
    }

    public double BMI() {
        double heightDividedbyHundred = this.height/100.0;
        return this.weight/(heightDividedbyHundred*heightDividedbyHundred);
    }


}