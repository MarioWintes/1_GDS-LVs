package lv2_oop;

import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapierApp {
    public static void main(String[] args) {

        String[] choices = {"Schere", "Stein", "Papier"};

        String playerChoice = playerMakesChoice(choices);
        System.out.println("playerChoice = " + playerChoice);

        String computerChoice = computerMakesChoice(choices);
        System.out.println("computerChoice = " + computerChoice);

        checkWinner(playerChoice, computerChoice);
    }
    // Übung daheim: Stand von player und comp speichern und dann auf 5 gewonnene
    public static String playerMakesChoice(String[] choices) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        String choice = "";

        while (!isValid) {
            printChoices(choices);
            System.out.println("Bitte eine Auswahl treffen: ");
            int userInput = scanner.nextInt();

            if (userInput > 0 && userInput <= 3) {
                isValid = true;
                choice = choices[userInput - 1];
            } else {
                System.out.println("Falsche Auswahl, versuche es nochmal");
            }
        }
        return choice;
    }

    public static void printChoices(String[] choices) {
        System.out.println("Auswahlmöglichkeiten:");
        for (int i = 0; i < choices.length; i++) {
            System.out.println("[" + (i + 1) + "] " + choices[i]);
        }
    }

    public static String computerMakesChoice(String[] choices){
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        return choices[randInt];
    }

    public static void checkWinner(String player, String comp) {
        if (player.equals("Schere") && comp.equals("Papier") ||
                player.equals("Stein") && comp.equals("Schere") ||
                player.equals("Papier") && comp.equals("Stein")){
            System.out.println("Juhu - Gewonnen");
        } else if (player.equals(comp)){
            System.out.println("Unentschieden");
        } else {
            System.out.println("Oje - Verloren");
        }
    }
}
