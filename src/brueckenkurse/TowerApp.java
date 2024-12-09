package brueckenkurse;

import java.util.Scanner;

public class TowerApp {
    public static void main(String[] args) {
        long startNumber = 0;
        long result = 0;
        int multiplier = 2;

        System.out.print("Startzahl: ");

        Scanner scanner = new Scanner(System.in);
        startNumber = scanner.nextInt();
        result = startNumber;

        while (multiplier < 10){
            startNumber = result;
            result = startNumber * multiplier;
            System.out.println(startNumber + " * " + multiplier + " = " + result);
            multiplier = multiplier + 1;
        }

        multiplier = 2;

        while (multiplier < 10){
            startNumber = result;
            result = startNumber / multiplier;
            System.out.println(startNumber + " / " + multiplier + " = " + result);
            multiplier = multiplier + 1;
        }
    }
}
