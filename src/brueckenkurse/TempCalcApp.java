package brueckenkurse;

public class TempCalcApp {
    public static void main(String[] args) {

        double tempCelsius = 37.2;
        double tempFahrenheit = celsius2Fahrenheit(tempCelsius);
        System.out.println(tempFahrenheit);

        double tempFahrenheit1 = 95.1;
        double tempCelsius1 = fahrenheit2Celsius(tempFahrenheit1);
        System.out.println(tempCelsius1);

        System.out.println("Celsius | Fahrenheit");
        System.out.println("---------------------");
        for (int i = -15; i <= 40; i+=5){
            double fh = celsius2Fahrenheit(i);
            System.out.println(i + "°C => " + fh + "°F");
        }
    }

    public static double celsius2Fahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8)+ 32;
        return fahrenheit;
    }

    public static double fahrenheit2Celsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * ((double) 5 /9);
        return celsius;
    }
}

