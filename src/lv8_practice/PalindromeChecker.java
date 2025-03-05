package lv8_practice;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeChecker {

    public static void main(String[] args) {

        ArrayList<Character> elements = new ArrayList<>();
        elements.add('a');
        elements.add('b');
        elements.add('c');
        elements.add('d');
        elements.add('c');
        elements.add('b');
        elements.add('a');

        System.out.println(elements);

        System.out.println(checkPalindrome(elements));

        System.out.println(elements);

    }

    public static boolean checkPalindrome(ArrayList<Character> chars) {

        ArrayList<Character> list = new ArrayList<>(chars);
        //Abbruchsbedingung
        if (list.size() <= 1){
            return true;
        }

        if (list.get(0) != list.get(list.size() - 1)){
            return false;
        }

        list.remove(0);
        list.remove(list.size() - 1);

        return checkPalindrome(list);
    }


}
