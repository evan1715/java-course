//Starting Week5 8/14/2018 @9:45am - ended 8/20/2018 @9pm
import wk5.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Week5 {
    public static void week5() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose an option:\n "
        +"1. ex84 overloaded counter\n "
        +"2. 23.5 weightwatchers\n "
        +"3. ex85 reformatory, weight of a person, feeding a person\n "
        +"4. ex85.3 number of times a weight has been measured\n "
        +"5. ex86 lyyra card and cash register\n "
        +"6. ex86.2 cash register and paying with cash\n "
        +"7. ex86.3 paying with card\n "
        +"8. ex86.4 loading money\n "
        +"9. 23.6 another object of the same type as a parameter to a method\n "
        +"10. 23.7 the date as an object\n "
        +"11. ex87 apartment comparison\n "
        +"12. 23.8 objects on a list\n "
        +"13. ex88 students\n "
        +"14. 23.9 an object within an object\n "
        +"15. current date - not working\n "
        +"16. ex89 clock object\n "
        +"17. 23.10 list of objects within an object - weightWatcher\n "
        +"18. ex90 team and players\n "
        +"19. ex91 extending mydate\n "
        +"20. ex92 difference of two dates\n "
        +"21. ex92 person extended\n "
        );

        int input = Integer.parseInt(reader.nextLine());

        //Exercise 84: Overloaded counter
        if (input == 1) {
            Counter one = new Counter(5, true);
            Counter two = new Counter(1);
            Counter three = new Counter(true);
            Counter four = new Counter();

            System.out.println("Initial: " +one.value() +" " +two.value() +" " +three.value() +" " +four.value());

            one.decrease(); two.decrease(); three.decrease(); four.decrease();

            System.out.println("Decrease: " +one.value() +" " +two.value() +" " +three.value() +" " +four.value());

            one.decrease(5); two.increase(-5); three.decrease(5); four.decrease(5);

            System.out.println("84.2: " +one.value() +" " +two.value() +" " +three.value() +" " +four.value());
        }

        //23.5 An object as a method parameter
        else if (input == 2) {
            Person matti = new Person("Matti");
            Person juhana = new Person("Juhana");
            
            matti.setWeight(86); matti.setHeight(180);
            juhana.setWeight(64); juhana.setHeight(172);

            WeightWatchers kumpWeight = new WeightWatchers(25);

            if (kumpWeight.isAcceptedAsMember(matti)) {
                System.out.println(matti.getName() + " is accepted as a member");
            } else {
                System.out.println(matti.getName() + " is not accepted as a member");
            }

            if (kumpWeight.isAcceptedAsMember(juhana)) {
                System.out.println(juhana.getName() + " is accepted as a member");
            } else {
                System.out.println(juhana.getName() + " is not accepted as a member");
            }
        }

        //Exercise 85.1: Weight of a person
        else if (input == 3) {
            Reformatory eastHR = new Reformatory();
            Person brian = new Person("Brian", 1, 110, 7);
            Person pekka = new Person("Pekka", 33, 176, 85);

            System.out.println(brian.getName() +" weight: " +eastHR.weight(brian) +" kilos.");
            System.out.println(pekka.getName() +" weight " +eastHR.weight(pekka) +" kilos ");

            //Exercise 85.2: Feeding a person
            eastHR.feed(brian); eastHR.feed(brian); eastHR.feed(brian);
            System.out.println(brian.getName() +" weight: " +eastHR.weight(brian) +" kilos.");
            System.out.println(pekka.getName() +" weight " +eastHR.weight(pekka) +" kilos ");
        }

        //Exercise 85.3: Number of times a weight has been measured
        else if (input == 4) { 
            Reformatory eastHR = new Reformatory();
            Person brian = new Person("Brian", 1, 110, 7);
            Person pekka = new Person("Pekka", 33, 176, 85);

            System.out.println("Total weights measured " +eastHR.totalWeightsMeasured());

            eastHR.weight(brian); eastHR.weight(pekka);
            System.out.println("Total weights measured " +eastHR.totalWeightsMeasured());

            eastHR.weight(brian); eastHR.weight(brian);
            eastHR.weight(brian); eastHR.weight(brian);
            System.out.println("Total weights measured " +eastHR.totalWeightsMeasured());

        }

        //Exercise 86: Lyyra card and Cash Register
        //Exercise 86.1: The "stupid" Lyyra card
        else if (input == 5) {
            LyyraCard cardPekka = new LyyraCard(10);

            System.out.println("Balance: " +cardPekka.getBal());
            boolean succeeded = cardPekka.pay(8);
            System.out.println("Money taken: " +succeeded);
            System.out.println("Balance: " +cardPekka.getBal());

            succeeded = cardPekka.pay(4);
            System.out.println("Money taken: " +succeeded);
            System.out.println("Balance: " +cardPekka.getBal());
        }

        //Exercise 86.2: Cash Register and paying with cash
        else if (input == 6) {
            CashRegister unicafeExactum = new CashRegister();
            
            double theChange = unicafeExactum.payEconomical(10);
            System.out.println("The change is " +theChange +"\n" +unicafeExactum);

            theChange = unicafeExactum.payEconomical(5);
            System.out.println("The change is " +theChange +"\n" +unicafeExactum);


            theChange = unicafeExactum.payGourmet(4);
            System.out.println("The change is " +theChange +"\n" +unicafeExactum);
        }

        //Exercise 86.3: Paying with card
        else if (input == 7) {
            CashRegister unicafeExactum = new CashRegister();
            
            double theChange = unicafeExactum.payEconomical(10);
            System.out.println("The change is: " +theChange);

            LyyraCard cardJim = new LyyraCard(7);

            boolean succeeded = unicafeExactum.payGourmet(cardJim);
            System.out.println("Payment success: " +succeeded);
            succeeded = unicafeExactum.payGourmet(cardJim);
            System.out.println("Payment success: " +succeeded);
            succeeded = unicafeExactum.payEconomical(cardJim);
            System.out.println("Payment success: " +succeeded);
            
            System.out.println(unicafeExactum);
        }

        //Exercise 86.4: Loading money
        else if (input == 8) {
            CashRegister unicafeExactum = new CashRegister();
            System.out.println(unicafeExactum);

            LyyraCard cardJim = new LyyraCard(2);
            System.out.println("The balance is: " +cardJim.getBal() +" euros");

            boolean succeeded = unicafeExactum.payGourmet(cardJim);
            System.out.println("Payment success: " +succeeded);

            unicafeExactum.loadMoneyToCard(cardJim, 100);
            succeeded = unicafeExactum.payGourmet(cardJim);
            System.out.println("Payment success: " +succeeded);
            System.out.println("The balance is: " +cardJim.getBal() +" euros");
            System.out.println(unicafeExactum);
        }

        //23.6 Another object of the same type as a parameter to a method
        else if (input == 9) {
            Person pekka = new Person("Pekka", 24);
            Person antti = new Person("Antti", 22);

            //if (peka.getAge() > antti.getAge()) { } works
            //However, this is a more object-oriented way to compare them:
            if (pekka.olderThan(antti)) { //using boolean olderThan method
                System.out.println(pekka.getName() +" is older than " +antti.getName());
            } else {
                System.out.println(pekka.getName() +" is not older than " +antti.getName());
            }
        }

        //23.7 The date as an object
        else if (input == 10) {
            MyDate p1 = new MyDate(14, 2, 2011);
            MyDate p2 = new MyDate(21, 2, 2011);
            MyDate p3 = new MyDate(1, 3, 2011);
            MyDate p4 = new MyDate(31, 12, 2010);

            System.out.println(p1 +" earlier than " +p2 +": " +p1.earlier(p2));
            System.out.println(p2 +" earlier than " +p1 +": " +p2.earlier(p1));

            System.out.println(p2 +" earlier than " +p3 +": " +p2.earlier(p3));
            System.out.println(p3 +" earlier than " +p2 +": " +p3.earlier(p2));

            System.out.println(p4 +" earlier than " +p1 +": " +p4.earlier(p1));
            System.out.println(p1 +" earlier than " +p4 +": " +p1.earlier(p4));
        }

        //Exercise 87: Apartment comparison
        else if (input == 11) {
            Apartment studioManhattan = new Apartment(1, 16, 5500);
            Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
            Apartment fourAndKitchenBronx = new Apartment(3, 79, 2500);

            //Exercise 87.1: Larger
            System.out.println(studioManhattan.larger(twoRoomsBrooklyn)); //false
            System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn)); //true

            //Exercise 87.2: Price difference
            System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
            System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

            //Exercise 87.3: More expensive than
            System.out.println(studioManhattan.costsMoreThan(twoRoomsBrooklyn)); //false
            System.out.println(fourAndKitchenBronx.costsMoreThan(twoRoomsBrooklyn)); //true
        }

        //23.8 Objects on a list
        else if (input == 12) {
            ArrayList<Person> teachers = new ArrayList<Person>();
            Person teacher = new Person("Juhana");
            
            teachers.add(teacher); //add it to the list
            teachers.add(new Person("Matti")); //or create it as we add it
            teachers.add(new Person("Martin"));

            System.out.println("Teachers as newborns: ");
            for (Person prs:teachers) {
                System.out.println(prs);
            }

            for (Person prs:teachers) {
                prs.becomeOlder(30);
            }

            System.out.println("In 30 years: ");
            for (Person prs:teachers) {
                System.out.println(prs);
            }
        }

        //Exercise 88: Students
        else if (input == 13) {
            //Exercise 88.1: Class student
            Student pekka = new Student("Pekka Mikkola", "013141590");
            System.out.println("Name: " +pekka.getName());
            System.out.println("Student #: " +pekka.getStudentNum() +"\n" +pekka);

            //Exercise 88.2: List of students
            ArrayList<Student> students = new ArrayList<Student>();
            System.out.println("Enter name and student number: ");

            while (true) {
                System.out.print("Name: ");
                String inputName = reader.nextLine();
                if (inputName.isEmpty()) {
                    break;
                }
                System.out.print("Student number: ");
                String inputNum = reader.nextLine();
                students.add(new Student(inputName, inputNum));
            }

            for (Student sds:students) {
                System.out.println(sds);
            }

            //Exercise 88.3 Search
            System.out.print("Give search term: ");
            String inputSt = reader.nextLine();
            //System.out.println("Result(s): ");
            for (Student student:students) {
                if (student.getName().contains(inputSt)) {
                    System.out.println(student);
                }
            }
        }

        //23.9 An object within an object
        else if (input == 14) {
            Person martin = new Person(24, 4, 1983, "Martin");
            Person juhana = new Person(17, 9, 1985, "Juhana");

            System.out.println(martin +"\n" +juhana);
        }

/*        //23.9 Current day in Java
        else if (input == 15) {
            int day = Calender.getInstance().get(Calender.DATE);
            int month = Calender.getInstance().get(Calender.MONTH)+1;//Jan is 0, so +1
            int year = Calender.getInstance().get(Calender.YEAR);
            System.out.println("Today is " +day +"." +month +"." +year);
        }
*/
        //Exercise 89: Clock object
        else if (input == 16) {
            Clock clock = new Clock(23, 59, 50);
            int i = 0;

            while (i < 20) {
                System.out.println(clock);
                clock.tick();
                i++;
            }
        }

        //23.10 A list of objects within an object
        else if (input == 17) {
            WeightWatchers weightWatcher = new WeightWatchers("Kumpulan piano", 25);

            Person matti = new Person("Matti");
            matti.setWeight(86); matti.setHeight(180);
            weightWatcher.addAsMember(matti);

            Person juhana = new Person("Juhana");
            juhana.setWeight(64); juhana.setHeight(172);
            weightWatcher.addAsMember(juhana);

            Person harri = new Person("Harri");
            harri.setWeight(104); harri.setHeight(182);
            weightWatcher.addAsMember(harri);

            Person petri = new Person("Petri");
            petri.setWeight(112); petri.setHeight(173);
            weightWatcher.addAsMember(petri);

            System.out.println(weightWatcher);

            //23.11 Method returns an object
            Person fattest = weightWatcher.fattestMember();
            System.out.print("Member with the greatest BMI: " +fattest.getName());
            System.out.println(" weight index " +String.format("%.2f", fattest.BMI()));
        }

        //Exercise 90: Team and Players
        else if (input == 18) {
            //Exercise 90.1: Class Team
            Team barcelona = new Team("FC Barcelona");
            System.out.println("Team: " +barcelona.getName());
            //barcelona.setMaxSize(1); //ex90.4

            //Exercise 90.2: Player
            Player brian = new Player("Brian");
            System.out.println("Player: " +brian);

            Player pekka = new Player("Pekka", 39);
            System.out.println("Player: " +pekka);

            //Exercise 90.3: Adding players to a team
            barcelona.addPlayer(brian);
            barcelona.addPlayer(pekka);
            barcelona.addPlayer(new Player("Mikael", 1));

            barcelona.printPlayers();

            //Exercise 90.4: The team maximum size and current size
            System.out.println("Number of players: " +barcelona.size());

            //Exercise 90.5: Goals of a team
            System.out.println("Total goals of the team: " +barcelona.goals());
        }

        //Exercise 91: Extending MyDate
        else if (input == 19) {
            MyDate day = new MyDate(25, 2, 2011);
            System.out.println(day);
            day.advance(10);
            System.out.println(day);
            // MyDate newDate = day.afterNumOfDays(7);
            // for (int i = 1; i<=7; ++i) {
            //     System.out.println("Friday after " +i +" week is " +newDate);
            //     newDate = newDate.afterNumOfDays(7);
            // }
            // System.out.println("This week's Friday is " +day);
            // System.out.println("The date 790 days from this week's Friday is " + day.afterNumOfDays(790));
        }

        //Exercise 92: Difference of two dates
        else if (input == 20) {
            MyDate first = new MyDate(24, 12, 2009);
            MyDate second = new MyDate(1, 1, 2011);
            MyDate third = new MyDate(25, 12, 2010);

            //Exercise 92.1: Difference in years, first version
            System.out.println(second +" and " +first +" difference in years: " +second.diffInYears(first));
            System.out.println(third +" and " +first +" difference in years: " +third.diffInYears(first));
            System.out.println(second +" and " +third +" difference in years: " +second.diffInYears(third));

            //Exercise 92.3: And the final version
            System.out.println();
            System.out.println(first +" and " +second +" difference in years " +second.diffInYears(first));
            System.out.println(second +" and " +first +" difference in years " +first.diffInYears(second));
            System.out.println(first +" and " +third +" difference in years " +third.diffInYears(first));
            System.out.println(third +" and " +first +" difference in years " +first.diffInYears(third));
            System.out.println(third +" and " +second +" difference in years " +second.diffInYears(third));
            System.out.println(second +" and " +third +" difference in years " +third.diffInYears(second));
        }

        //Exercise 93: Person extended
        else if (input == 21) {
            Person pekka = new Person(15, 2, "Pekka", 1993);
            Person steve = new Person(1, 3, "Steve", 1955);

            System.out.println(steve.getName() +" age " +steve.age() +" years");
            System.out.println(pekka.getName() +" age " +pekka.age() +" years");

            //Exercise 93.2: Comparing ages based on birthdate
            Person thomas = new Person(15, 2, "Thomas", 1983);
            Person martin = new Person(1, 3, "Martin", 1983);

            System.out.println(martin.getName() +" is older than " +thomas.getName() +": " +martin.olderThan(thomas));
            System.out.println(thomas.getName() +" is older than " +martin.getName() +": " +thomas.olderThan(martin));

            //Exercise 93.3: New constructors
            Person pekka2 = new Person("Pekka", new MyDate(15, 2, 1983));
            Person steve2 = new Person("Steve");

            System.out.println(pekka2 +"\n" +steve2);

        }












        reader.close();
    }

/*  23.4 Object is at the end of a wire
    Null refers to nothing. The object has become 'garbage'. Java's garbage 
    collector cleans up the garbage every now and then by itself. If this did not happen, 
    the garbage would pile up in the computer's memory until the execution of the program 
    is done.
*/
}