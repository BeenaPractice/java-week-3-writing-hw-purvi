package homework_week_7;

import java.util.Scanner;

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation symbol +,-,*,/ :");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        //closing scanner object
        scanner.close();

    }

    // Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + "-" + y + "=" + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " * " + y + " = " + (x * y));
        } else {
            System.out.println(x + " / " + y + " = " + (x / y));
        }
    }
}
