import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int addition, subtraction, multiplication, rest = 0;
        String calcName = "MaschineBalthasar";

        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        addition = add(number1, number2);
        System.out.println("addition = " + addition);

        subtraction = subtract(number1, number2);
        System.out.println("subtraction = " + subtraction);

        multiplication = multiply(number1, number2);
        System.out.println("multiplication = " + multiplication);

        double division = divide(number1, number2);
        System.out.println("division = " + division);

        rest = modulate(number1, number2);
        System.out.println("modulo = " + rest);


    }
    // access-modifier static return-value=(Datatype) methodName(parameters)
    // public static void/int add(int x, int y)
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        if (b != 0){
            return a / (b * 1.0);
            //return (double) a / b;
        } else { // else eig nicht notwendig
            System.out.println("Division by 0 not possible");
            return 0;
        }
    }

    public static int modulate(int a, int b){
        return a % b;
    }
}
