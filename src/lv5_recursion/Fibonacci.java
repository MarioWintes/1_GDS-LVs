package lv5_recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(calculateFibonacci(11));
    }

    /**
     * der wert der n-ten fibonacci Zahl
     * @param n
     * @return
     */
    public static int calculateFibonacci(int n){
         if (n <= 1 || n == 2){
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
