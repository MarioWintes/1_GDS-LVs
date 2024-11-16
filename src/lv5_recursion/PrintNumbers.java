package lv5_recursion;

public class PrintNumbers {

    public static void main(String[] args) {
        printFromZeroToNRecursive(3);
    }

    public static void printFromNToZero(int n) {
        // wenn n = 3;
        // sout(3)
        // sout(2)
        // sout(1)
        // sout(0) -> ziel
        while (n >= 0) {
            System.out.println("n = " + n);
            n--;
        }
    }

    // rekursiv
    public static void printFromNToZeroRecursive(int n) {
        // !! Abbruchsbestimmung als erstes !!
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        printFromNToZeroRecursive(n - 1);
    }

    public static void printFromZeroToNRecursive(int n) {
        // !! Abbruchsbestimmung als erstes !!
        if (n < 0) {
            return;
        }
        printFromZeroToNRecursive(n - 1);
        System.out.println("n = " + n);
    }


}
