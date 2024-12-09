package brueckenkurse;

public class NumberDivisibleApp {
    public static void main(String[] args) {

        int number, i = 0;
        int sum = 0;

        while (i < 100) {
            i += 1;
            if (i % 3 == 0){
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Die Gesamtsumme der Zahlen die durch 3 teilbar sind ist: " + sum);
    }
}
