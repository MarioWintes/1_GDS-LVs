package lv8_practice;

public class Palindrome2Checker {

    public static void main(String[] args) {

        String test = "Trug Tim eine ,so helle Hose nie mit Gurt!";
        String testLower = test.toLowerCase();
        char first = testLower.charAt(0);
        char last = testLower.charAt(test.length() - 1);
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        String test2 = "Motor";

        System.out.println(check(test));
        System.out.println(check(test2));
    }

    public static boolean check(String palindrome){
        String cleaned = palindrome.toLowerCase().strip();

        if (cleaned.length() <= 1){
            return true;
        }
        char first = cleaned.charAt(0);
        if (!Character.isLetter(first)){
            String newCleaned = cleaned.substring(1); // erstes Zeichen weg
            return check(newCleaned);
        }

        char last = cleaned.charAt(cleaned.length() - 1);
        if (!Character.isLetter(last)){
            String newCleaned = cleaned.substring(0, cleaned.length() - 1); // letztes Zeichen weg
            return check(newCleaned);
        }

        if (first != last){
            return false;
        }
        cleaned = cleaned.substring(1, (cleaned.length() - 1));

        return check(cleaned);
    }
}
