//Starting Week 6 ...haven't started yet
import wk6.*;
import java.util.Scanner;

public class Week6 {
    public static void week6() {
        Scanner reader = new Scanner(System.in);

        System.out.println("What do you need:\n "
        +"1. ex94 phonebook\n "
        +"2. ex95 money\n "
        );

        int input = Integer.parseInt(reader.nextLine());

        //24. A quick recap
        //Exercise 94: PhoneBook
        if (input == 1) {
            //Exercise 94.1: Person
            Person pekka = new Person("Pekka Mikkola", "040-123123");

            System.out.println(pekka.getName());
            System.out.println(pekka.getNumber());
            System.out.println(pekka);

            pekka.changeNumber("050-333444");
            System.out.println(pekka);



            //Exercise 94.2: Adding persons to Phonebook
            
            

            //Exercise 94.3: Searching for numbers from the phonebooks

        }

        //Exercise 95: Money
        if (input == 2) {

        }


        reader.close();
    }
}