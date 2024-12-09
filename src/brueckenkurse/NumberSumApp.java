package brueckenkurse;

public class NumberSumApp {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        while (i < 100) {
            i = i + 1;
            sum = sum + i;
        }
        System.out.println("Die Gesamtsumme von 1-100 ist: " + sum);
    }
}
