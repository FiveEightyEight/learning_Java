/**
 * Created by robertabreu on 1/15/16.
 */
import java.util.Scanner;

public class Hello {

    static int myFirstNumber = 10;
    static double mySecondNumer = 5.50;
    boolean alwayTrue = true;
    boolean alwaysFalse = false;






    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.println(myFirstNumber);

        int mySecondNumber = 3 * 5 + 12 / 3;

        int myThirdNumber = 12;

        int myFourthNumber = 16;

        int myTotal = myFirstNumber + myThirdNumber - myFourthNumber;

        System.out.println(mySecondNumber);

        System.out.println(myTotal);

        int newTotal = myTotal - 1000;

        System.out.println(newTotal);



    }
}
