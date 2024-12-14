package lv8_practice;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }

        int[] array = {14, 12, 20, 24, 8, 26, 1, 2, 3};

        System.out.println(Arrays.toString(array));

        int[] reversedArray = ArrayHelper.reverse(array);

        System.out.println(Arrays.toString(reversedArray));

        int result = ArrayHelper.findIndex(array, 2);
        System.out.println(result);

        int sum = ArrayHelper.calcSum(array);
        System.out.println(sum);


    }
}
