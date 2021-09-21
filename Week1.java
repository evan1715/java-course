import java.util.Scanner;

public class Week1 {
    public static void week1() {
    Scanner reader = new Scanner(System.in);
    //println goes to next line while print itself is continuous
    String x = "Hello world!";
    System.out.println(x);
    //print can be separated
    System.out.print("Hello "); System.out.println("world!");
    //print out lines in the same code
    System.out.println("First line\nSecond line\nThird line\n");
    //exercise
    System.out.println("Jane Doe");
    System.out.println("Hello world!\n(And all the people of the world)");
    System.out.println("    *\n   ***\n  *****\n *******\n*********\n    *");

    String text = "String cmd type include text like this.";
    int wholeNumber = 123; //int cmd type is for whole numbers
    double decimalNumber = 3.14592653; //double cmd type is for decimal numbers
    boolean isTrue = true; //boolean cmd type is for truth values
    
    System.out.println("The variable's type is text. Its value is " +text);
    System.out.println("The variable's type is integer. Its value is " +wholeNumber);
    System.out.println("The variable's type is decimal number. Its value is " +decimalNumber);
    System.out.println("The variable's type is truth value. Its value is " + isTrue);

    wholeNumber = 42; //can change the variable "wholeNumber" to another number
    System.out.println("The variable's type is integer. Its value is " +wholeNumber);

    //integer values can be assigned to decimal number variables because whole numbers are also decimal numbers
    decimalNumber = 1;
    System.out.println(decimalNumber);

    //Exercise
    String nz = "There is none!";
    int i = 3;
    double j = 5.5;

    System.out.println("Chickens:\n" +i +"\nBacon (kg):\n" +j +"\nA tractor:\n" +nz);
    System.out.println("\nIn a nutshell:\n" +i +"\n" +j +"\n" +nz +"\n");
    nz="Zetor"; i=9000; j=0.1;
    System.out.println("Chickens:\n" +i +"\nBacon (kg):\n" +j +"\nA tractor:\n" +nz);
    System.out.println("\nIn a nutshell:\n" +i +"\n" +j +"\n" +nz +"\n");

    //5. Calculations
    int first = 3;
    int second = 2;
    double result = first/second; //the result is 1 because first and second are integers
    int remainder = 7%2; //remainder is 1
    //If either the dividend or the divisor (or both) is a floating number (decimal), the 
    //end result will also be a floating point number.
    double whenDividendIsFloat = 3.0/2; //result is 1.5
    double whenDivisorIsFloat = 3/2.0; //the result is 1.5
    //If needed, integers can be converted to floating point using the type cast operation (double)
    double result1 = (double)first/second; //result is 1.5
    double result2 = first/(double)second; // result is 1.5
    double result3 = (double)(first/second); //result is 1. This is rounded incorrectly because 
    //the calculation between the integers is done before the type cast to a floating number.
    System.out.println(result+remainder+result1+result2+result3+whenDivisorIsFloat+whenDividendIsFloat+"\n");
    //If the quotient is assigned to a variable of integer type, the result will be an integer
//      int integerResultBecauseTypeIsInteger = 3.0/2; //quotient is automatically integer: 1
    //This one will print 1.5 because the dividend is transformed into a floating point before the division
    int dividend = 3;
    int divisor = 2;
    double quotient = 1.0*dividend/divisor;
    System.out.println(quotient);

    //What does the following code print out?
    double quotient2 = dividend/divisor*1.0;
    System.out.println(quotient2);
    //it prints out "1.0"

    //Exercise 5: Create a program that counts how many seconds are in a year
    int SecInYears = 365*24*60*60;
    System.out.println("There are " +SecInYears +" seconds in a year\n");

    //6. Concatenation or combining strings
    System.out.println("Four: " +(2+2)); //Four: 4
    System.out.println("But! Twenty-two: " +2+2 +"\n"); //But! Twenty-two: 22

    //7. Reading user input
    System.out.print("What is your name? ");
    String name = reader.nextLine(); 
    //Reads a line of input from the user and assigns it to the variable called name
    System.out.println("Hi " +name);

    //7.2 Reading integers
    System.out.print("How old are you? ");
    int age = Integer.parseInt(reader.nextLine());
    
    System.out.println("You are " +name +" and are " +age +" years old.\n");

    //8. Conditional statements and truth values
    int number = 11;

    if (number > 10) {
        System.out.println("The number was greater than 10.\n");
    }

    boolean isGreater = first > second;

    if (isGreater) {
        System.out.println(first +" is greater than " +second +"!\n");
    }

    //8.2 else
    if (number > 12) {
        System.out.println("Your number is greater than eleven!\n");
    } else {
        System.out.println("Your number is equal to or less than eleven!\n");
    }

    //Exercise 14: Create a program that asks the user for a number and tells if the number is positive.
    System.out.print("Positive or negative: Type a number: ");
    int input1 = Integer.parseInt(reader.nextLine());
    if (input1 > 0) {
        System.out.println("Your number is positive.\n");
    } else {
        if (input1 < 0) {
            System.out.println("Your number is negative.\n");
        }
    }

    //Exercise 15: Create a program that tells whether the user has reached the age of the majority (18)
    System.out.print("How old are you? ");
    if (age > 18) {
        System.out.println("You have reached the age of majority!\n");
    } else { 
        if (age < 18)
        System.out.println("You have not reached the age of majority yet!\n");
    }
    
    //Exercise 16: Create a program that asks the user for a number and tells whether its even or odd.
    System.out.print("Even or odd: Type a number: ");
    input1 = Integer.parseInt(reader.nextLine());
    if (input1%2 == 1) {
        System.out.println("Number " +input1 +" is odd.\n");
    } else {
        if (input1%2 != 1) {
            System.out.println("Number " +input1 +" is even\n");
        }
    }

    //8.3 else if
    number = 3;
    if (number == 1) {
        System.out.println("The number is one.\n");
    } else if (number == 2) {
        System.out.println("The number is two.\n");
    } else if (number == 3) {
        System.out.println("The number is three.\n");
    } else {
        System.out.println("Quite a lot.\n");
    }

    //8.4 Comparing strings: Strings cannot be compared using the equality operator(==).
    //For string comparison, we use the .equals command.
    text = "course";
    if (text.equals("marzipan")) { 
        System.out.println("The variable text contains the text marzipan\n");
    } else {
        System.out.println("The variable does not contain marzipan.\n");
    }
    String anotherText = "horse";
    if (text.equals(anotherText)) {
        System.out.println("The texts are the same!\n");
    } else {
        System.out.println("The texts are not the same!\n");
    }

    //Exercise 17: Ask the user for two numbers and prints the greater of those two, and if they're equal.
    System.out.print("Greater number: Type a number: ");
    input1 = Integer.parseInt(reader.nextLine());
    System.out.print("Type another number: ");
    int input2 = Integer.parseInt(reader.nextLine());
    if (input1 > input2) {
        System.out.println("Greater number: " +input1 +"\n");
    } else if (input1 < input2) {
        System.out.println("Greater number: " +input2 +"\n");
    } else if (input1 == input2) {
        System.out.println("The numbers are equal.\n");
    }

    //Exercise 18: Create a program that gives the course grade
    System.out.println("Type the points [0-60]: ");
    input1 = Integer.parseInt(reader.nextLine());
    if (input1 < 30 & input1 > -1) {
        System.out.println("Grade: failed\n");
    } else if (input1 > 30 & input1 < 35) {
        System.out.println("Grade: 1\n");
    } else if (input1 >=35 & input1 <=39) {
        System.out.println("Grade: 2\n");
    } else if (input1 >=40 & input1 <=44) {
        System.out.println("Grade: 3\n");
    } else if (input1 >= 45 & input1 <=49) {
        System.out.println("Grade: 4\n");
    } else if (input1 >=50 & input1 <= 60) {
        System.out.println("Grade: 5\n");
    } else {
        System.out.println("Not within point range of [0-60]\n");
    }
    
    //8.5 Logical operations
    //condition1 && condition2 is true if both conditions are true. AND operation.
    //condition1 || condition2 is true if either of the conditions are true. OR operation.
    //!condition is true if the condition is false.
    
    //Exercise 21: Create a program that checks whether the year is a leap year.
    System.out.println("Type a year: ");
    input1 = Integer.parseInt(reader.nextLine());
    if ((input1%400 == 0) || (input1%100 != 0 && input1%4 == 0)) {
        System.out.println("Is a leap year.\n");
        } else {
        System.out.println("Not a leap year.\n");
    }

    if (input1%4 == 0) {
        if(input1%100 == 0 && input1%400 != 0) {
            System.out.println("Not a leap year.\n");
        } else {
            System.out.println("Is a leap year.\n");
        }
    }

    if (input1%4 == 0 && (input1%100 !=0 || input1%400 == 0)) {
        System.out.println("Is a leap year.\n");
        } else {
        System.out.println("Not a leap year.\n");
    }

    //9. Introduction to loops
    while (true) {
        System.out.print("Enter a command (sum, difference, quit): ");
        String command = reader.nextLine();
        if (command.equals("quit")) {
            break;
        }
        System.out.println("enter the numbers");
        first = Integer.parseInt(reader.nextLine());
        second = Integer.parseInt(reader.nextLine());
        if (command.equals("sum")) {
            int sum = first + second;
            System.out.println("The sum of the numbers is " +sum);
        } else if (command.equals("difference")) { 
            int difference = first - second;
            System.out.println("The difference of the numbers is " +difference);
        } else {
            System.out.println("Unknown command");
        }
    } System.out.println("Thanks, bye!\n");

    //Exercise 22: Password
    while (true) {
        System.out.print("Type the password: ");
        String passinput = reader.nextLine();
        if (passinput.equals("carrot")) {
            System.out.println("Right!\n");
            break;
        } else {
            System.out.println("Wrong!");
        }
    }
/*
    //Exercise 23: Temperatures
       while (true) {
        System.out.print("Input decimal numbers");
        double dub1 = Double.parseDouble(reader.nextLine());
        double dub2 = Double.parseDouble(reader.nextLine());
        double dub3 = Double.parseDouble(reader.nextLine());
        if ((dub1 >= -30 && dub1 <= 40) || (dub2 >= -30 && dub1 <= 40) || (dub3 >= -30 && dub1 <= 40)) {
            Graph.addNumber(dub1);
        } else {
            break;
        }
    }
*/

        reader.close();
    }
}