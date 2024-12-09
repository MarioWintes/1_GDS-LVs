public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition " + (a + b));
        System.out.println("Subtraktion " + (a - b));
        System.out.println("Multiplikation " + (a * b));
        System.out.println("Division " + (a / b));

        double divRest = (double) a /b;
        System.out.println("Division " + divRest);
        System.out.println("Modulo " + (a % b));


        int j = 3;
        System.out.println("j = " + j);
        System.out.println("j = " + j++); // POST Increment erwartung 3
        System.out.println("j = " + j); // hier ist j = 4
        System.out.println("j = " + (++j));

        int k = 3;
        System.out.println("k = " + k);
        System.out.println("k = " + (--k)); // PRE Increment erwartung 2
        System.out.println("k = " + k);

        String firstNameA = "Max";
        String firstNameB = "Macx";

        System.out.println(firstNameA == firstNameB); // Bei Strings wird nicht der Wert verglichen sondern die Referenz!!!
        System.out.println(firstNameA.equals(firstNameB));
    }
}
