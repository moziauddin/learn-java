import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        checkCondition();
    }
    private static void checkCondition() {
        // Variable to base the condition on
        Scanner word = new Scanner(System.in);
        System.out.print("Enter a word: ");
        char option = word.nextLine().toLowerCase().charAt(0);
        switch (option) {
            case 'p':
                System.out.println("Pause");
                break;
            case 'q':
                System.out.println("Quit");
                break;
            case 's':
                System.out.println("Play");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
