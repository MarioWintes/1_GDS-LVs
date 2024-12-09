package brueckenkurse;

import java.util.Arrays;

public class IBANValidation {
    public static void main(String[] args) {
        String iban = "644904300234573201";

        int[] arr = buildArray(iban);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println(arr[1]);
    }
    public static int[] buildArray(String iban){
        System.out.println("iban = " + iban.length());
        int[] result = new int[iban.length()];
        
        for (int i = 0; i < result.length; i++){
            result[i] = iban.charAt(i) - '0'; // oder -48 wegen ascii
        }
        return result;
    }
}
