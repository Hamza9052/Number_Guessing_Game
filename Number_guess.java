import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Number_guess {

    
/**
 * @param args
 */
public static void main(String[] args) {
    playgames();
}

/**
 * 
 */


public static void playgames() {
    Scanner guess = new Scanner(System.in);
    Scanner input = new Scanner(System.in);

    System.out.println("****************************Guess Number***********************************");
    System.out.println();
    Random number = new Random();
    int N;
    String Nu;
    HashSet<Integer> setNu = new HashSet<Integer>();

    boolean playAgain = true;

    while (playAgain) {

        
        do {
        N = number.nextInt(100);
        } while (setNu.contains(N));

        setNu.add(N);

        System.out.println("In this Game, You should Guess Number.");

        System.out.println();

        System.out.println("Let's get started, Guess Number Between 0 & 100 :");

        System.out.println();

        int G = guess.nextInt();

        if (N > G) {
            System.out.println("Your Number is Low");
        } else if (N < G) {
            System.out.println("Your Number is High");
        } else if (N == G) {
            System.out.println("Congratulation");
        }

        System.out.println("Do you want to play again? (Y/N)");
        String playAgainInput = input.next();

        if (!playAgainInput.equalsIgnoreCase("Y")) {
            playAgain = false;
        }

        setNu.clear();
    }
}

}
