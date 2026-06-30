import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.println("Who are you?");
        System.out.print("> ");
        String playerName = input.nextLine();

        System.out.println("Hello, " + playerName + "!");
        System.out.println("Tossing a coin ...");

        int headTotal = 0;
        int tailTotal = 0;

        for (int turn = 1; turn <= 3; turn++) {
            boolean flip = randomizer.nextBoolean();
            String result = flip ? "Heads" : "Tails";

            System.out.println("Round " + turn + ": " + result);

            if (flip) {
                headTotal++;
            } else {
                tailTotal++;
            }
        }

        System.out.println("Heads: " + headTotal + ", Tails: " + tailTotal);
    }
}

