import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Which week do you want: #1-12? "); 
        int input = Integer.parseInt(reader.nextLine());
        if (input == 1) {
            Week1.week1();
        } else if (input == 2) {
            System.out.println("Select method:\n "
            +"1 for week1\n "
            +"2 for greet\n "
            +"3 for printText Ex 37\n "
            +"4 for printStars Ex 39.1\n "
            +"5 for printSquare\n "
            +"6 for printRectangle\n "
            +"7 for printTriangle\n "
            +"8 for printTriangle2 right\n "
            +"9 for xmasTree\n");
            input = Integer.parseInt(reader.nextLine());
            if (input == 1) {
                Week2.week2();
            } else if (input == 2) {
                Week2.greet("Matt");
                Week2.greet("Arthur");
                Week2.greetManyTimes("Anthony", 3);
                System.out.println("and");
                Week2.greetManyTimes("Martin", 2);
            } else if (input == 3) {
                Week2.printText();
            } else if (input == 4) {
                Week2.printStars(5);
                Week2.printStars(3);
                Week2.printStars(9);
            } else if (input == 5) {
                Week2.printSquare(4);
            } else if (input == 6) {
                Week2.printRectangle(17, 3);
            } else if (input == 7) {
                Week2.printTriangle(4);
            } else if (input == 8) {
                Week2.printTriangle2(4);
            } else if (input == 9) {
                Week2.xmasTree(4);
                Week2.xmasTree(10);
            }
        } else if (input == 3) {
            Week3.week3();
        } else if (input == 4) {
            Week4.week4();
        } else if (input == 5) {
            Week5.week5();
        } else if (input == 6) {
            Week6.week6();
        }
    reader.close();
    }
}