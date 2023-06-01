package homework_week_7;

import java.util.Scanner;

public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F :");
        char city = scanner.next().charAt(0);
        //object creation
        Programme_8_PrintCityName cityName = new Programme_8_PrintCityName();
        cityName.printCityName(city);
        // closing the scanner object
        scanner.close();

    }
    // Printing city name
    public void printCityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Aberdeen");
        }else if(city == 'B' || city == 'b') {
            System.out.println("Belfast");
        }else if(city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        }else if(city == 'D' || city == 'd') {
            System.out.println("Derby");
        }else if(city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        }else if(city == 'F' || city == 'f') {
            System.out.println("Feltham");
        }else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
