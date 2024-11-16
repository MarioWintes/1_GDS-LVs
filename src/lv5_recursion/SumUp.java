package lv5_recursion;

import java.util.ArrayList;

public class SumUp {
    public static void main(String[] args) {
        //System.out.println(recursiveSum(3));
        //System.out.println();
        //System.out.println(sumUpRecursive(3, 0));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(iterativeSumList(numbers));
        System.out.println();
        System.out.println(recursiveSumList(new ArrayList<>(numbers))); // Unbedingt KOPIE machen sonst ist liste leer danach
        System.out.println(numbers);

        System.out.println("liste vor recursion:");
        System.out.println(numbers);
        System.out.println(recursiveSumListIndex(numbers, 0));
        System.out.println(numbers);
    }

    public static int iterativeSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recursiveSum(int n) {
        if (n <= 0) {
            return n;
        }
        return n + recursiveSum(n - 1);
    }

    public static int sumUpRecursive(int n, int acc) {
        if (n <= 0) {
            return acc;
        }
        acc += n;
        return sumUpRecursive(n - 1, acc);
    }

    public static int iterativeSumList(ArrayList<Integer> values) {
        int sum = 0;
        for (int index : values) {
            sum = sum + index;
        }
        return sum;
    }

    public static int recursiveSumList(ArrayList<Integer> values) {
        if (values.isEmpty()){
            return 0;
        }
        Integer value = values.remove(0);
        return value + recursiveSumList(values);
    }

    public static int recursiveSumListIndex(ArrayList<Integer> values, int index){
        if (values.size() <= index){
            return 0;
        }
        int value = values.get(index);
        return value + recursiveSumListIndex(values, index + 1);
    }
}
