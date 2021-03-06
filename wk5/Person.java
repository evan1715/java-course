package wk5;

//21.4 Defining your own class - object variables
public class Person {
    private String name;
    private int age, weight, height, month;
    //private MyDate birthMyDate;
    private MyDate birthday; //ex93
    //private will not show outside of the object, they are hidden within it, called encapsulation
    //Variables defined within a class are called object variables, fields, or attributes.
    //in main, Person bob = new Person("Bob"); to create a new object.

    //23.2 Calling your own constructor
    public Person(String name) { //this one confuses me
        this(name, 0); //run here the other constructor's code and set the age parameter to 0
        this.birthday = new MyDate(20, 8, 2018);
    }

    //21.5 Defining your own class - constructor, or "formatting the state"
    public Person(String name, int age) { //This is the constructor
        this.age = age;
        this.name = name;
        this.weight = 0;
        this.height = 0;
    //The constructor always has the same name as the class.
    }

    //Exercise 85: Weight of a person
    //yeah, he thought you could do it without modifying Person.java, but no
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //23.9 An object within an object
    public Person(int day, int month, int year, String name) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
        this.birthMyDate = new MyDate(day, month, year);
    }

    //Exercise 93: Person extended
    public Person(int pp, int kk, String name, int vv) { 
        //shuffled^^ so it doesn't mix with other constructors
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        this.month = kk;
    }

    public int age() { //ex93
    //Calender doesn't actually work, so we'll make our own date:
        MyDate today = new MyDate(20, 8, 2018);

        return this.birthday.diffInYears(today);
    }

    //Exercise 93.3: New constructors
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
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

    //23.3 Overloading a method
    public void becomeOlder(int years) {
        this.age += years;
    }

    public int getAge() {
        return this.age;
    }

    //23.1 Added getHeight and getWeight
    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
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
        return this.name +", born " +this.birthday; //ex93
        //return this.name +", born " +this.birthMyDate;
        //return this.name +", age " +this.age +" years";
        //return this.name +", age " +this.age +" years, my BMI is " +BMI();
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
    /*  The parameter could also be named identically with the object variable:
        this.height = height;
        Now the name 'height' means the parameter 'height' and the identically 
        named object variable is referred to as 'this.height'.
    */
    }

    public double BMI() {
        double hDividedBy100 = this.height/100.0;
        return this.weight/(hDividedBy100*hDividedBy100);
    }

    //23.6 Another object of the same type as a parameter to a method
    public boolean olderThan(Person compared) { //also in ex93.2
        if (this.age > compared.age) {
            return false;
        } else if (this.age == compared.age) { //ex93.2
            if (this.month > compared.month) {
                return false;
            }
        }
        return true;


    /*  Even though age is a private object variable, we cna read the value of the variable
        by writing compared.age. This is because private variables can be read in all
        methods that the class in question contains. Note that the syntax resembles the
        call of a method of an object. Unlike calling a method, we refer to a field of an
        object, in which case we do not write the parentheses.
    */
    }
}