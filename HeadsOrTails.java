import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random randomizer = new Random();

        System.out.println("Tossing a coin ...");

        int countHeads = 0;
        int countTails = 0;

        for (int round = 1; round <= 3; round++) {
            boolean flip = randomizer.nextBoolean();
            String outcome = flip ? "Heads" : "Tails";

            System.out.println("Round " + round + ": " + outcome);

            if (flip) {
                countHeads++;
            } else {
                countTails++;
            }
        }

        System.out.println("Heads: " + countHeads + ", Tails: " + countTails);

        if (countHeads > countTails) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
