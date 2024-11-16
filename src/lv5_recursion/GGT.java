package lv5_recursion;

public class GGT {
    public static void main(String[] args) {

        System.out.println(calculateGGT(48, 100));
        System.out.println();
        System.out.println(calculateGGTIterative(4, 6));
    }

    public static int calculateGGT(int a, int b) {
        if (b == 0){
            return a;
        }
        return calculateGGT(b, a % b);
    }

    public static int calculateGGTIterative(int a, int b){
        while (b != 0){
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}
