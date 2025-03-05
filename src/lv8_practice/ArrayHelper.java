package lv8_practice;

public class ArrayHelper {

    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            reversed[reversed.length - i - 1] = numbers[i];
        }
        return reversed;
    }

    public static int findIndex(int[] numbers, int number) {
        if (numbers.length == 0) return -1;
        else if (numbers.length == 1) return number;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int calcSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

}
