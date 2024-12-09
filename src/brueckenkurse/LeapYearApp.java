package brueckenkurse;

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {

        int i = 0;
        int leap_year = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Jahr eingeben: ");
        leap_year = scanner.nextInt();

        // Abfragung ist es ein Schaltjahr

        if (leap_year % 4 == 0 && leap_year % 400 == 0){
            System.out.println(leap_year + " ist EIN Schaltjahr");
        }

        else if (leap_year % 4 == 0 && leap_year % 100 == 0){
            System.out.println(leap_year + " ist KEIN Schaltjahr");
        }
        else if (leap_year % 4 == 0) {
            System.out.println(leap_year + " ist EIN Schaltjahr");
        }
        else {
            System.out.println(leap_year + " ist KEIN Schaltjahr");
        }
    }
}
