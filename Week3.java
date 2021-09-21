import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; //or java.util.*;

public class Week3 {
    public static void week3() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Pick something:\n 1. week3, nothing in it\n 2. alwaysReturnTen\n 3. sum\n 4. avg\n 5. least\n 6. greatest\n 7. average\n 8. length of name\n 9. first character\n 10. last character\n 11. first 3 char\n 12. ex51 separate characters\n 13. ex52 reversing name\n 14. ex53 first part\n 15. ex54 end part\n 16. ex55 word inside of a word\n 17. ex56 reversing text\n 18. ex57 words\n 19. ex58 recurring word\n 20. ex59 words in reverse\n 21. ex60 alphabetize\n 22. ex61 amount of items in a list\n 23. ex62 remove last\n 24. ex63 sum of numbers\n 25. ex64 avg of numbers\n 26. ex65 length of strings\n 27. ex66 for the greatest\n 28. ex67 variance\n 29. 18.1 & 18.2\n 30. ex68 num more than once?\n 31. ex69 palindrome\n ");
        int input = Integer.parseInt(reader.nextLine());
        if (input == 1) {
            Week3.week3();
        } else if (input == 2) {
            int number = Week3.alwaysReturnTen();
            System.out.println("method returned the number " +number);
            double number1 = 4*Week3.alwaysReturnTen() + (Week3.alwaysReturnTen()/2) - 8;
            System.out.println("calculation total " +number1);
        } else if (input == 3) {
            int ans = Week3.sum(4, 3, 6, 1);
            System.out.println("sum: " +ans);
        } else if (input == 4) {
            System.out.println(Week3.avg(1, 6, 8));
        } else if (input == 5) {
            int ans = Week3.least(2,7);
            System.out.println("Least: " +ans);
        } else if (input == 6) {
            int ans = Week3.greatest(2, 7, 3);
            System.out.println("Greatest: " +ans);
        } else if (input == 7) {
            double answer = Week3.average(4, 3, 6, 1);
            System.out.println("Average: " +answer);
        } else if (input == 8) {
            System.out.print("Type your name: ");
            String name = reader.nextLine();
            System.out.println("Number of characters: " +Week3.calcChar(name));
        } else if (input == 9) {
            System.out.print("Type your name: ");
            String letter = reader.nextLine();
            System.out.println("First character: " +Week3.firstChar(letter));
        } else if (input == 10) {
            System.out.print("Type your name: ");
            String letter = reader.nextLine();
            System.out.println("Last character: " +Week3.lastChar(letter));
        } else if (input == 11) { //Exercise 50: Separating first characters
            System.out.print("Type your name: ");
            String name = reader.nextLine();
            int i = name.length();
            if (i > 2) {
                System.out.println("1st char: " +name.charAt(0) +"\n2nd char: " +name.charAt(1) +"\n3rd char: " +name.charAt(2));
            }
        } else if (input == 12) {
            Week3.Ex51();
        } else if (input == 13) {
            Week3.Ex52();
        } else if (input == 14) {
            Week3.Ex53();
        } else if (input == 15) {
            Week3.Ex54();
        } else if (input == 16) {
            Week3.Ex55();
        } else if (input == 17) {
            System.out.print("Type a text: ");
            String text = reader.nextLine();
            System.out.println("In reverse order: " +Week3.Ex56(text));
        } else if (input == 18) {
            Week3.Ex57();
        } else if (input == 19) {
            Week3.Ex58();
        } else if (input == 20) {
            Week3.Ex59();
        } else if (input == 21) {
            Week3.Ex60();
        } else if (input == 22) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Hallo"); list.add("Ciao"); list.add("Hello");
            System.out.println("There are this many items in the list:");
            System.out.println(Week3.countItems(list));
        } else if (input == 23) {
            ArrayList<String> brothers = new ArrayList<String>();
            brothers.add("Dick"); brothers.add("Henry");
            brothers.add("Michael"); brothers.add("Bob");
            System.out.println("Brothers:\n" +brothers);
            Collections.sort(brothers);
            Week3.removeLast(brothers);
            System.out.println(brothers);
        } else if (input == 24) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3); list.add(2); list.add(7); list.add(2);
            System.out.println("The sum " +Week3.sumArray(list));
            list.add(10);
            System.out.println("the sum: " +Week3.sumArray(list));
        } else if (input == 25) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3); list.add(2); list.add(7); list.add(2);
            System.out.println("The average is: " +Week3.avgArray(list));
        } else if (input == 26) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Hallo"); list.add("Moi"); list.add("Benvenuto"); list.add("badger");
            ArrayList<Integer> lengths = Week3.lengths(list);
            System.out.println("The lengths of the Strings: " +lengths);
        } else if (input == 27) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3); list.add(2); list.add(7); list.add(2);
            System.out.println("The greatest number is: " +Week3.greatest(list));
        } else if (input == 28) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3); list.add(2); list.add(7); list.add(2);
            System.out.println("The variance is: " +Week3.variance(list));
        } else if (input == 29) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(3); numbers.add(1); numbers.add(-1); numbers.add(4);
            if (Week3.allPositive(numbers)) {
                System.out.println("All numbers are positive.");
            } else { 
                System.out.println("There is at least one negative number.");
            }
        } else if (input == 30) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3); list.add(2); list.add(7); list.add(2);
            System.out.print("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());
            if (Week3.moreThanOnce(list, number)) {
                System.out.println(number +" appears more than once.");
            } else {
                System.out.println(number +" does not appear more than once.");
            }
        } else if (input == 31) {
            System.out.println("Type a text: ");
            String text = reader.nextLine();
            if (Week3.palindrome(text)) {
                System.out.println("The text is palindrome!");
            } else {
                System.out.println("The text is not a palindrome!");
            }
        }
        reader.close();
    }
    //14.1 Methods and visibility of variables
    //14.2 Return values
    //void is used when methods do not return anything
    public static int alwaysReturnTen() {
        return 10;
    }
    // public static void methodThatReturnsNothing() {
    //     // method body
    // }
    // public static int methodThatReturnsInteger() {
    //     // method body, needs a return statement
    // }
    // public static String methodThatReturnsText() {
    //     // method body, needs a return statement
    // }
    // public static double methodThatReturnsFloatingpoint() {
    //     // method body, needs a return statement
    // }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }

    //14.3 Method's own variables
    public static double avg(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        double avg = sum/3.0;
        return avg;
    }

    //Exercise 44: Least
    public static int least(int num1, int num2) {
        int lesser;
        if (num1 > num2) {
            lesser = num2;
        } else {
            lesser = num1;
        }
        return lesser;
    }

    //Exercise 45: Greatest
    public static int greatest(int num1, int num2, int num3) {
        int greater;
        if (num1 > (num2 & num3)) {
            greater = num1;
        } else if (num2 > (num1 & num3)) {
            greater = num2;
        } else { 
            greater = num3;
        }
        return greater;
    }

    //Exercise 46: Average of given numbers
    public static double average(int num1, int num2, int num3, int num4) {
        double sum = num1+num2+num3+num4;
        double average = sum/4.0;
        return average;
    }

    //15. Strings of characters
    //Compare strings by using the equals() method. Ex: variable.equals("x");
    //See how many characters long a string is with the length() method. Ex: variable.length();
    //char cmd can store only one character
    //A string variable can return a specific location in itself with the method charAt() that uses the index of the location as a parameter. Note: Counting the index starts from zero.

    //Exercise 47: The length of a name
    public static int calcChar(String name) {
        return name.length();
    }

    //Exercise 48: First character
    public static char firstChar(String letter) {
        return letter.charAt(0);
    }

    //Exercise 49: Last character
    public static char lastChar(String letter) {
        return letter.charAt(letter.length()-1);
    }

    //Exercise 51: Separating characters
    public static void Ex51() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nlen = name.length();
        int i = 0; int j = 1;
        while (i < nlen) {
            System.out.print(j +". character: " +name.charAt(i) +"\n");
            i++; j++;
        }
        reader.close();
    }

    //Exercise 52: Reversing a name
    public static void Ex52() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nlen = name.length();
        int i = nlen-1;
        while (0 <= i && i < nlen) {
            System.out.print(name.charAt(i));
            i--;
        }
        reader.close();
    }
    
    //15.1 Other methods for strings
    //Exercise 53: First part
    public static void Ex53() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 6));
        reader.close();
    }

    //Exercise 54: End part
    public static void Ex54() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String endpart = reader.nextLine();
        System.out.println(endpart.substring(3));
        System.out.println(endpart.substring(0));
        reader.close();
    }

    //Exercise 55: A word inside a word
    public static void Ex55() {
        Scanner reader = new Scanner(System.in);
        System.out.print("First word: ");
        String fword = reader.nextLine();
        System.out.print("Second word: ");
        String sword = reader.nextLine();
        int index = fword.indexOf(sword);
        if (index > -1) {
            System.out.println("The word '" +sword +"' is found in the word '" +fword +"'\n");
        } else {
            System.out.println("The word: '" +sword +"' is not found in the word '" +fword +"'\n");
        }
        reader.close();
    }

    //Exercise 56: Reversing text
    public static String Ex56(String text) {
        int i = text.length()-1;
        String j = "";
        while (0 <= i && i < text.length()) {
            j += text.charAt(i);
            i--;
        }
        return j;
    }


/*  16. Object
    Strings are "objects" - something that has methods and a value. 
    Object's methods are called by adding a dot after the name of the object. Ex: word.length()
    Two ways to create a string object:
    String banana - new String("Banana");
    String carrot = "carrot";
    Both cmds create a new String object. Using the new cmd is uncommon when creating an object.
    The object's "type" is called a class. The class of a string of characters is called String and the class of readers is called Scanner.

    17. ArrayList or an "object container"
    "A very bad idea would be to define a variable for each of many different strings in memory:"
    String word1;
    String word2;
    String word3;
    .....
    String word 10;
    Similar to other modern programming languages, Java gives us different tools to store many objects neatly in our programs.
    An ArrayList is probably the most used object container in Java.
    example:
    import java.util.ArrayList;
    main {
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("First");
        wordList.add("Second");
    }
    The first row creates a new ArrayList called wordList. The type of ArrayList is ArrayList<String>, which means it is meant as a container for strong Strings. 
    The added strings automatically go to the end of the ArrayList.

    17.1 Methods of ArrayLists
    Use .add() to add things to the list. Use .remove() to remove strings from a list.
    Can use array.remove("Word") or array.remove(#) to remove a specific string.
    Can also use the cmd .contains() to search the list.

    17.2 Going through an ArrayList
    Doesn't say much, recommends using "for" instead of "while" for lists.

    17.3 for-each
    int place = 0;
    while ( place < teachers.size() )  //remember why place <= teachers.size() doesn't work?
        System.out.println( teachers.get(place) );
        place++;
    }
    vs
    for (String teacher : teachers) {
        System.out.println( teacher );
    }

*/  //Exercise 57: Words
    public static void Ex57() {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        for (;1 > 0;) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            words.add(input);
            if (input.isEmpty()) { 
                System.out.print("You typed the following words:\n" +words);
                break;
            }
        }
        reader.close();
    }

    //Exercise 58: Recurring word
    public static void Ex58() {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        for (;1 > 0;) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            if (words.contains(input)) { 
                System.out.print("You gave the word " +input +" twice.\n");
                break;
            }
            words.add(input);
        }
        reader.close();
    }

    //17.4 Ordering, reversing, and shuffling a list
    //Collections.sort(arraylistname); alphabetic order for the array
    //need to have import java.util.Collections; for it. It also includes shuffle and reverse

    //Exercise 59: Words in reverse order
    public static void Ex59() {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        for (;1 > 0;) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            if (input.isEmpty()) {
                Collections.reverse(words);
                System.out.print("You typed the following words: " +words);
                break;
            }
            words.add(input);
        }
        reader.close();
    }

    //Exercise 60: Words in alphabetical order
    public static void Ex60() {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        for (;1 > 0;) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            if (input.isEmpty()) {
                Collections.sort(words);
                System.out.print("You typed the following words: " +words);
                break;
            }
            words.add(input);
        }
        reader.close();
    }

    //17.5 ArrayList as a parameter for a method
    //Exercise 61: Amount of items in a list
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    //Exercise 62: Remove last
    public static void removeLast(ArrayList<String> list) {
        int i = list.size()-1;
        list.remove(i);
    }

    //17.6 Numbers in an ArrayList
    //To remove a number inside the list, use array.remove(Integer.valueOf(4));
    //Arrays can also use doubles (decimal) and characters (variables)

    //Exercise 63: Sum of the numbers
    public static int sumArray(ArrayList<Integer> list) {
        int result = 0; 
        for (int i = (list.size()-1); i >= 0; i--) {
            result += list.get(i); //+= NOT =+, they're two different things
        }
        return result;
    }

    //Exercise 64: Average of numbers
    public static double avgArray(ArrayList<Integer> list) {
        double result = 0;
        for (int i = (list.size()-1); i>=0; i--) {
            result += list.get(i);
        }
        return result/list.size();
    }

    //17.7 ArrayList as return value of a method
    //Exercise 65: The lengths of the Strings
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (int i = 0; (list.size()-1) >= i; i++) {
            lengths.add((list.get(i)).length());
        }
        return lengths;
    }

    //Exercise 66: The Greatest
    public static int greatest(ArrayList<Integer> list) {
        int greatest = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > greatest) {
                greatest=list.get(i);
            }
        }
        return greatest;
    }

    //Exercise 67: Variance
    public static double variance(ArrayList<Integer> list ) {
        double variance = 0;
        double j = avgArray(list);
        for (int i = 0; i < list.size(); i++) {
        //eq is ∑(xi-xj)^2/n-1 where xj=average, xi=each int, n is sample size
            variance += (list.get(i)-j)*(list.get(i)-j);
        }
        // for (int i:list) {
        //     variance += i-j*i-j;
        // }
        return variance/(list.size()-1); //divide the sum by the sample size minus 1: x/n-1
    }

/*    18. Using truth values
        int num1 = 1; int num2 = 5;
        boolean firstGreater = true;
        if (num1 <= num2) {
            firstGreater=false;
        }
        if (firstGreater) { //means the same as firstGreater==true
            System.out.println("num1 was greater");
        } else {
            System.out.println("num1 was not greater");
        }
        //If we want to check if the boolean variable is valse, we can use !
        if (!firstGreater) {
            System.out.println("num1 was not greater");
        } else {
            System.out.println("num1 was greater");
        }

        18.1 Methods that return a truth value
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(-1);
        boolean result = allPositive(numbers);
        if (result) {  // means the same as result == true
            System.out.println("all numbers are positive");
        } else {
            System.out.println("there is at least one negative number");
        }
    }
    //Usually isn't necessary to store the answer into a variable.
    //Can simply do if (allPositive(numbers)) {}
        if (allPositive(numbers)) {
            System.out.println("all numbers are positive");
        } else {
            System.out.println("there is at least one negative number");
        }
    }*/

    //18.2 The return command and ending a method
    public static boolean allPositive(ArrayList<Integer> numbers) {
        for (int number:numbers) {
            if (number < 0) {
                return false;
            }
        }
        return true; //if no negatives were found, allPositive == true
    }

    //Exercise 68: Is the number more than once in the list?
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        // int j = 0;
        // for (int num:list) {
        //     if (num == number) {
        //         j++;
        //     }
        // }
        // return j>1;
        //This code does the same thing as the one above^
        // int j = 0;
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) == number) {
        //         j++; 
        //     }
        // }
        // return j>1;
        //This one also does the same as above^
        if (Collections.frequency(list, number) > 1) {
            return true;
        }
        return false;
    }
    
    //Exercise 69: Palindrome
    public static boolean palindrome(String text) {
        if (text.equals(Ex56(text))) { //Compare 'text' to reverse text string
            return true;
        }
        return false;
    }
}        