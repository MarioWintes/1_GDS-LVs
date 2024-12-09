package brueckenkurse;

public class CalcFaculty {
    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5
        int number = 8;
        long sum = calcFaculty(number);
        System.out.println("number = " + sum);
    }
    public static long calcFaculty(int value){
        long sum = 1; //wenn multiplikation startwert 1!!!!!
        for (int i = 1; i <= value; i++){
            sum = sum * i;
        }
        return sum;
    }
}
