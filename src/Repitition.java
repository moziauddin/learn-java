import java.util.Random;
import java.util.Scanner;

public class Repitition {
    public static void main(String[] args) {
        printLetters();
    }

    // For loop - Print letters in string
    public static void printLetters() {
        String name = "John Doe";
        for (int i=0; i<name.length(); i++) {
            System.out.println("Char at " + i + " is :" + name.charAt(i));
        }
    }

    // While loop - Dice
    public static void diceRoll() {
        int face = -1;
        boolean roll = true;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while (roll) {
            System.out.print("q or Q to quit. Any other " +
                    "key to roll.\nSelect an Option: ");
            if (scan.nextLine().toLowerCase().charAt(0) == 'q') {
                System.out.println("Quitting the Loop");
                roll = false;
            } else {
                face = rand.nextInt(6) + 1;
                System.out.println(face);
            }
        }
    }
}
