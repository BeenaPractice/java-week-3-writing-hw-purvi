package homework_week_7;

import java.util.Scanner;

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        // Object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberorSymbol(ch);
        // closing scanner object
        scanner.close();

    }

    // Find the input value is ALPHABET,DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberorSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT");
        } else {
            System.out.println(ch + " is a SYMBOL");
        }
    }
}
