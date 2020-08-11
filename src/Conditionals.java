import java.util.InputMismatchException;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        expressions();
    }

    public static void expressions() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int firstNum = scan.nextInt();
            System.out.print("Enter second number: ");
            int secondNum = scan.nextInt();
            int result = sumTwoNumbers(firstNum, secondNum);
            System.out.println("The sum is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Enter a proper number.");
            System.exit(0);
        }
    }

    public static int sumTwoNumbers(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }
}
