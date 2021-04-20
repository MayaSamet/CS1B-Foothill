import java.util.Scanner;
import java.util.Random;

public class numberGuesser {
    public static void main(String[] args) {
        // create Random object
        Random random = new Random();

        // generate a random int from 0 to 100
        int randInt = random.nextInt(101);

        // test and continue asking until the user guesses the right number (or opts out)
        Scanner input = new Scanner(System.in);
        boolean mySweetLittleBoolean = true;

        while (mySweetLittleBoolean) {
            System.out.print("What number am I thinking of? ");
            int guess = input.nextInt();

            if (guess > randInt) {
                System.out.println("Too high!");
            } else if (guess < randInt) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congrats! You got it!");
                mySweetLittleBoolean = false;
            }
        }
    }
}

