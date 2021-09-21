//Starting Week4 8/2/2018 @4pm - ended 8/10/2018 @2pm
import wk4.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; //or java.util.*;
import java.util.Random;

public class Week4 {
    public static void week4() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Select one:\n "
        +"1. ex70 combine\n "
        +"2. ex71 smart combine\n "
        +"3. person class\n "
        +"4. ex73 product\n "
        +"5. ex74 multiplier\n "
        +"6. ex75 decreasing counter\n "
        +"7. ex75.3 counter reset\n "
        +"8. ex75.4 reset to initial value\n "
        +"9. ex76 menu\n "
        +"10. 21.8 person class\n "
        +"11. ex77 lyyra-card\n "
        +"12. 21.10 more methods, BMI\n "
        +"13. ex78 clock using a counter\n "
        +"14. 78.3 first version of the clock\n "
        +"15. 78.4 second version of the clock\n "
        +"16. ex79 num stats\n "
        +"17. ex79.3 input for sum\n "
        +"18. 22. Randomness\n "
        +"19. 22. weather forecaster\n "
        +"20. ex80 rolling dice\n "
        +"21. ex81 password randomizer\n "
        +"22. ex82 lottery\n "
        );

        int input = Integer.parseInt(reader.nextLine());

        //Exercise 70: Combining ArrayLists
        if (input == 1) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();

            list1.add(4); list1.add(3);
            list2.add(5); list2.add(10); list2.add(7);

            combine(list1, list2);
            System.out.println(list1 +"\n" +list2);
        } 

        //Exercise 71: Smart combining
        else if (input == 2) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();

            list1.add(4); list1.add(3); list1.add(5);
            list2.add(5); list2.add(10); list2.add(7); 

            smartCombine(list1, list2);
            System.out.println(list1 +"\n" +list2);
        } 

        //21.6 Class definition - methods
        else if (input == 3) {
            Person pekka = new Person("Pekka");
            Person brian = new Person("Brian");
            Person martin = new Person("Martin");

            pekka.printPerson();
            brian.printPerson();
            martin.printPerson();
        } 

        //21.7 More methods
        else if (input == 4) {
            Person pekka = new Person("Pekka");
            Person andrew = new Person("Andrew");

            pekka.printPerson();
            andrew.printPerson();
            System.out.println();

            pekka.becomeOlder(); pekka.becomeOlder();

            pekka.printPerson();
            andrew.printPerson();
        } 

        //21.7 More methods, second half
        else if (input == 4) {
            Person pekka = new Person("Pekka");
            Person andrew = new Person("Andrew");

            pekka.becomeOlder(); pekka.becomeOlder();
            andrew.becomeOlder();

            System.out.println("Age of Pekka: " +pekka.getAge() +"\nAge of Andrew: " +andrew.getAge());

            int total = pekka.getAge() + andrew.getAge();
            System.out.println("Pekka and Andrew total for " +total +" years old.");
        } 

        //Exercise 74: Multiplier
        else if (input == 5) {
            Multiplier threeMultiplier = new Multiplier(3);
            Multiplier fourMultiplier = new Multiplier(4);

            System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
            System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
            System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
            System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
        } 

        //Exercise 75: Decreasing counter
        else if (input == 6) {
            DecreasingCounter counter = new DecreasingCounter(2);

            counter.printValue(); counter.decrease(); 
            counter.printValue(); counter.decrease(); 
            counter.printValue(); counter.decrease(); 
            counter.printValue();
        } 

        //Exercise 75.3: Counter reset
        else if (input == 7) {
            DecreasingCounter counter = new DecreasingCounter(100);

            counter.printValue(); counter.reset();
            counter.printValue(); counter.decrease();
            counter.printValue();
        } 

        //Exercise 75.4: Back to initial value
        else if (input == 8) {
            DecreasingCounter counter = new DecreasingCounter(100);

            counter.printValue(); counter.decrease();
            counter.printValue(); counter.decrease();
            counter.printValue(); counter.reset();
            counter.printValue(); counter.setIntitial();
            counter.printValue();
        } 

        //Exercise 76: Menu
        else if (input == 9) {
            Menu cake = new Menu();
            //Exercise 76.1: Adding a meal to the menu
            cake.addMeal("Hamburger"); cake.addMeal("Fish'n'Chips");
            cake.addMeal("Hamburger"); cake.addMeal("Sauerkraut"); 
            //Exercise 76.2: Printing the menu
            cake.printMeals();
            //Exercise 76.3: Clearing a menu
            cake.clearMenu(); cake.printMeals(); 
        } 

        //21.8 The Person class grows
        else if (input == 10 ) {
            Person bob = new Person("Bob");
            Person andy = new Person("Andy");
            int i = 0;

            while (i < 30) {
                bob.becomeOlder();
                i++;
            }
            andy.becomeOlder(); System.out.println();

            if (andy.isAdult()) {
                System.out.println(andy.getName() +" is an adult.");
            } else {
                System.out.println(andy.getName() +" is a minor."); 
            }

            if (bob.isAdult()) {
                System.out.println(bob.getName() +" is an adult.");
            } else {
                System.out.println(bob.getName() +" is a minor."); 
            }
            System.out.println(andy); //same as println(andy.toString());
            System.out.println(bob); //same as println(bob.toString());
        } 

        //Exercise 77: Lyyra-card
        else if (input == 11) { 
            //Exercise 77.1: Class skeleton
            LyyraCard card = new LyyraCard(50); 
            System.out.println("First card:\n" +card);

            //Exercise 77.2: Paying with card
            card.payEconomical(); 
            System.out.println(card);

            card.payGourmet(); card.payEconomical(); 
            System.out.println(card);

            //Exercise 77.3: Balance nonnegative
            LyyraCard card2 = new LyyraCard(5); 
            System.out.println("Second card:\n" +card2);

            card2.payGourmet(); 
            System.out.println(card2);

            card2.payGourmet();
            System.out.println(card2);

            //Exercise 77.4: Loading money to card
            LyyraCard card3 = new LyyraCard(10); 
            System.out.println("Third card:\n" +card3);

            card3.loadMoney(15);
            System.out.println(card3);

            card3.loadMoney(10);
            System.out.println(card3);

            card3.loadMoney(200);
            System.out.println(card3);

            //Exercise 77.5: Loading a negative amount
            LyyraCard card4 = new LyyraCard(10); 
            System.out.println("Fourth card:\n" +card4);

            card4.loadMoney(-15);
            System.out.println(card4);

            //Exercise 77.6 Multiple cards
            LyyraCard pCard = new LyyraCard(20);
            LyyraCard bCard = new LyyraCard(30);

            pCard.payGourmet();
            System.out.println("Pekka: " +pCard);

            bCard.payEconomical();
            System.out.println("Brian: " +bCard);

            pCard.loadMoney(20);
            System.out.println("Pekka: " +pCard);

            bCard.payGourmet();
            System.out.println("Brian: " +bCard);

            pCard.payEconomical(); pCard.payEconomical();
            System.out.println("Pekka: " +pCard);

            bCard.loadMoney(50); 
            System.out.println("Brian: " +bCard);
        }

        //21.10 More methods
        else if (input == 12) {
            Person matti = new Person("Matti");
            Person john = new Person("John");

            matti.setHeight(180); matti.setWeight(86);
            john.setHeight(175); john.setWeight(64);

/*      21.12 Controlling the number of decimals when printing a float
        If the value is a float number, the cmd String.value("%.2f", value) returns
        a string where the value is rounded to contain 2 decimals. */            
            System.out.println(matti.getName() +", body mass index: " +String.format("%.2f", matti.BMI()));
            System.out.println(john.getName() +", body mass index: " +String.format("%.2f", john.BMI()));
        }

        //Exercise 78: Clock using a counter
        else if (input == 13) {
            BoundedCounter counter = new BoundedCounter(14);
            System.out.println("Value at start: " +counter);
            int i = 0;

            while (i < 16) {
                counter.next();
                System.out.println("Value: " +counter);
                i++;
            }
        }

        //Exercise 78.3: First version of the clock
        else if (input == 14) {
            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);
            int i = 0;

            while (i < 121) {
                System.out.println(hours +":" +minutes);
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
                i++;
            }
        }

        //Exercise 78.4: Second version of the clock
        else if (input == 15) {
            BoundedCounter seconds = new BoundedCounter(59);
            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);

            System.out.print("seconds: ");
            int s = Integer.parseInt(reader.nextLine());
            System.out.print("minutes: ");
            int m = Integer.parseInt(reader.nextLine());
            System.out.print("hours: ");
            int h = Integer.parseInt(reader.nextLine());

            seconds.setValue(s);
            minutes.setValue(m);
            hours.setValue(h);

            int i = 0;
            while (i < 121) {
                System.out.println(hours +":" +minutes +":" +seconds);
                seconds.next();
                if (seconds.getValue() == 0) {
                    minutes.next();
                }
                if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                    hours.next();
                }
                i++;
            }
        }

        //Exercise 79: NumberStatistics
        else if (input == 16) {
            //Exercise 79.1: Amount of numbers
            NumberStatistics stats = new NumberStatistics();
            stats.addNumber(3); stats.addNumber(5);
            stats.addNumber(1); stats.addNumber(2);
            System.out.println("Amount: " +stats.amountOfNumbers());

            //Exercise 79.2: sum and average
            System.out.println("Sum: " +stats.sum());
            System.out.println("Average: " +stats.average());
        }

        //Exercise 79.3: Asking for numbers from the user
        else if (input == 17) {
            NumberStatistics statSum = new NumberStatistics();
            NumberStatistics statSumE = new NumberStatistics();
            NumberStatistics statSumO = new NumberStatistics();

            System.out.println("Type numbers:");
            
            while (input > 0 ) {
                input = Integer.parseInt(reader.next());
                statSum.addNumber(input);
                if (input%2 != 1) {
                    statSumE.addNumber(input);
                } else {
                    statSumO.addNumber(input);
                }
            }
            System.out.println("Sum: " +statSum.sum());
            //Exercise 79.4: Many sums
            System.out.println("Sum of even: " +statSumE.sum());
            System.out.println("Sum of odd: " +statSumO.sum());
        }

        //22. Randomness
        else if (input == 18) {
            Random randomizer = new Random();
            int i = 0;
    
            while (i < 10) { //Print 10 times
                System.out.println(randomizer.nextInt(10)); //Random # within the range of 10
                i++;
            }
        }

        //22. Randomness -> WeatherForecaster
        else if (input == 19) {
            WeatherForecaster forecaster = new WeatherForecaster();
            ArrayList<String> days = new ArrayList<String>(); //A list helps organize
            Collections.addAll(days, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

            System.out.println("Weather forecast for the next week: ");
            for (String day:days) {
                String weatherForecast = forecaster.forecastWeather();
                int temperatureForecast = forecaster.forecastTemperature();

                System.out.println(day +": " +weatherForecast +" " +temperatureForecast +" degrees.");
            }
        }

        //Exercise 80: Rolling the dice
        else if (input == 20) {
            Dice dice = new Dice(6);
            int i = 0;

            while (i < 10) {
                System.out.println(dice.roll());
                i++;
            }
        }

        //Exercise 81: Password randomizer
        else if (input == 21) {
            PasswordRandomizer randomizer = new PasswordRandomizer(13);

            System.out.println("Password: " +randomizer.createPassword());
            System.out.println("Password: " +randomizer.createPassword());
            System.out.println("Password: " +randomizer.createPassword());
            System.out.println("Password: " +randomizer.createPassword());
        }

        //Exercise 82: Lottery
        else if (input == 22) {
            LotteryNumbers lotteryNumbers = new LotteryNumbers();
            ArrayList<Integer> numbers = lotteryNumbers.numbers();

            System.out.println("Lottery numbers: ");
            for (int number:numbers) {
                System.out.print(number +" " );
            }
            System.out.println();
        }




        reader.close();
    }


    //19. Methods and copying parameters
    //Exercise 70: Combining ArrayLists
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    //Exercise 71: Smart combining
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int i:first) {
            if (second.contains(i)) {
                second.remove(Integer.valueOf(i));
            }
        }
        first.addAll(second);
    }
}

/*  21.1 Object
    In java, objects are always created with 'new', except in a few cases. Ex: new Scanner, new ArrayList. One of the cases where you do not need to use 'new' is Strings.
    Ex: String text = "some text"; or String text = new String("some text");

    21.2 Class
    Not all objects have the same methods. Arrays have add, contains, remove, size,... and String objects have substring, length, charAt,...
    ArrayList, String, Scanner, etc. are called a class. Objects, on the other hand, are instances of classes.
    Objects of the same class all have the same methods and a similar state. For example, ArrayList object consists of a list while String object consists of characters.

    21.3 A class and its objects
    A class defines what kind of objects it has:
    -what methods the objects have
    -what the state of the objects are (what kind of attributes the objects have)
    The blueprints of a house are the class, they define the general characteristics of the objects created out of that class. Individual objects are made from that same blueprint.
    An object is always created from its class by calling the method - the constructor - that creates the object with the command new. For example, a new instance is created from the class Scanner by calling new Scanner(...).
    Constructors take the parameters the way any other method does.
*/
