import java.util.Scanner;

public class Week2 {
    public static void week2() {
        Scanner reader = new Scanner(System.in);

        //10. Changing variables
        //variable++ means a variable + 1
        //variable-- means variable - 1
        //can use variable+#, variable-#, variable/#, variable*# to change the variable

        //11. More loops
        int number = 1;
        while (number < 11) {
            System.out.println(number);
            number++; //counts to 10 and stops loop at 10
        }

        //11.1 Assignment operations
        //variable operation= change, example: variable += 5;
        //int variable = 0;
        //variable = variable + 100;
        //or variable += 100;
        //*=    /=  %=
        int result = 0;
        int i = 0;

        //Exercise 32: The sum of a set of numbers
        System.out.print("Sum until what? - Type a number: ");
        int NumInput = Integer.parseInt(reader.nextLine());
        while (i <= NumInput) {
            result += i; //same as result = result +3;
            i++; //same as i = i+1;
        }
        System.out.println("Sum is " +result +"\n");

        //Exercise 33: The sum between two numbers
        System.out.print("Sum between two numbers\n" +"First number: ");
        NumInput = Integer.parseInt(reader.nextLine());
        System.out.print("Last number: ");
        int NumInput2 = Integer.parseInt(reader.nextLine());
        int result2 = 0;
        while (NumInput <= NumInput2) {
            result2 += NumInput;
            NumInput++;
        }
        System.out.println("Sum is " +result2 +"\n");


        //Exercise 34: Factorial
        System.out.print("Factorial - Type a number: ");
        NumInput = Integer.parseInt(reader.nextLine());
        int result3 = 1;
        while (0 < NumInput) {
            result3 *= NumInput;
            NumInput--;
        }
        System.out.println("Factorial is " +result3 +"\n");

        //Exercise 35: Sum of powers
        System.out.print("Sum of powers\n" +"Enter a number: ");
        NumInput = Integer.parseInt(reader.nextLine());
        int result4 = 0;
        while (0 <= NumInput) {
            result4 += Math.pow(2, NumInput);
            NumInput--;

        }
        System.out.println("The result is: " +result4 +"\n");
        //A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3). This assigns the value of 23 to variable result.
        
        //11.2 Infinite loops
        //don't do them

        //11.3 Ending a while loop
        System.out.println("Type your age: ");
        NumInput = Integer.parseInt(reader.nextLine());
        while (NumInput < 5 || NumInput > 85) {
            System.out.println("You're lying!");
            if (NumInput < 5) {
                System.out.println("Too young");
            } else if (NumInput > 85) {
                System.out.println("Too old");
            }
            System.out.println("Type your age again: ");
            NumInput = Integer.parseInt(reader.nextLine());
        } 
        System.out.println("Your age is " +NumInput +"\n");
        //or could use "while (true)" structure
        System.out.println("Type your age: ");
        NumInput = Integer.parseInt(reader.nextLine());
        while (true) {
            if (NumInput >= 5 && NumInput <= 85) {
                break;
            }
            System.out.println("You're lying!");
            if (NumInput < 5) {
                System.out.println("Too young");
            } else {
                System.out.println("Too old");
            } 
            System.out.println("Type your age again: ");
            NumInput = Integer.parseInt(reader.nextLine());
        } 
        System.out.println("Your age is " +NumInput +"\n");

        //Exercise 36
        System.out.println("Type numbers, -1 to stop: ");
        int sum = 0; //36.2
        int InputCount = 0; //36.3
        int EvenCount = 0; //36.5
        int OddCount = 0; //36.5
        while (true) {
            NumInput = Integer.parseInt(reader.nextLine());
            if (NumInput < 0) {
                break;
            } else if (NumInput%2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
            sum += NumInput; //36.2 Adds the inputs together
            InputCount++; //36.3 Counts the amount of numbers used
        }
        double avg = (double)sum/InputCount; //36.4
        System.out.println(
            "Thanks and see ya!\n" //36.1
            +"The sum is " +sum +"\n" //36.2
            +"Amount of inputs: " +InputCount +"\n" //36.3
            +"Average: " +avg +"\n" //36.4
            +"Even numbers: " +EvenCount +"\n" //36.5
            +"Odd numbers: " +OddCount +"\n" //36.5
        );

        //12. Methods
        //Can count the max of two numbers with the cmd Math.max()
        //Commands ending with brackets are called methods (), like println("");
        //The input given to the method inside the brackets is called a method parameter
        //Integer.parseInt(reader.nextLine()); reader.nextLine is the first inner method. Integer typed by the user as a return value
        //Integer.parseInt is the outer method. The return value is the string of characters transformed into an integer.
        //Method name starts after the dot, reader.nextLine() is nextLine()

        //13. Self-written methods
        reader.close();
    }
    //13. Self-written methods
    //13.1 
    public static void greet(String name) {
        System.out.println("Hi " +name +", greetings from the world of methods!");
    }
    //13.3
    public static void greetManyTimes(String name, int times) {
        int i = 0;
        while (i < times) {
            greet(name);
            i++;
        }
    }
    //Exercise 37
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe, and Java.\n");
    }
    public static void println() {
        System.out.println();
    }
    //Exercise 39.1: Printing stars
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
    //Exercise 39.2: Printing a square
    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }
    //Exercise 39.3: Printing a rectangle
    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }
    //Exercise 39.4: Printing a left-aligned triangle
    public static void printTriangle(int size) {
        int i = 1;
        while (0 < size) {
            printStars(i);
            i++;
            size--;
        }
    }
    //Exercise 40.1: Printing  white spaces
    public static void printSpaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
    }
    //Exercise 40.2: Printing a right-aligned triangle
    public static void printTriangle2(int size) {
        int i = 1;
        while (0 < size) {
            printSpaces(size);
            printStars(i);
            i++;
            size--;
        }
    }
    //Exercise 40.3: Printing a Christmas tree
    public static void xmasTree(int height) {
        int i = 1;
        int heightTree = height;
        while (0 < heightTree) {
            printSpaces(heightTree);
            printStars(i);
            i = i+2;
            heightTree = heightTree-1;
        }
        printSpaces(height-1); printStars(3);
        printSpaces(height-1); printStars(3);
    }
}

//     public static void fkingSq(int input) {
//         int i = 1;
//         int zed = 0;
//         int j = input;

//         while (0 <= j) {
//             System.out.print("* ");
//             j -= 1;
//             while (0 )
//         }
//     }
// }
