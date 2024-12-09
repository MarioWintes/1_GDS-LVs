package brueckenkurse;

public class UmsatzDemoApp {
    public static void main(String[] args) {
        double [] turnovers = new double[] {1000, 1111, 1150, 1300, 2500, 1550, 800, 3000};

        System.out.println("getUmsatzsteigerungGT10(turnovers) = " + getUmsatzsteigerungGT10(turnovers));

        System.out.println("calcAverage(turnovers) = " + calcAverage(turnovers));

        System.out.println("getMaximumIndex(turnovers) = " + getMaximumIndex(turnovers));

        System.out.println("getMaximumValue(turnovers) = " + getMaximumValue(turnovers));

        System.out.println("getMaximumValue2(turnovers) = " + getMaximumValue2(turnovers));
    }

    public static int getUmsatzsteigerungGT10(double[] turnovers){

        int counter = 0;

        for (int i = 1; i < turnovers.length; i++) {
            if (turnovers[i] / turnovers[i - 1] > 1.1){
                counter++;
            }
        }
        return counter; //null
    }

    public  static double calcAverage(double[] turnovers) {
        double sum = 0;
        for (int i = 0; i < turnovers.length; i++){
            sum = sum + turnovers[i];
        }
        System.out.println("sum = " + sum);
        return sum / turnovers.length;
    }

    public  static int getMaximumIndex(double[] turnovers) {
        //welches monat höchstens
        // 1000, 1111, 1150, 1300, 1500, 1550, 800 // ergebnis = 5
        int indexMaxValue = 0;

        for (int i = 0; i < turnovers.length; i++){
            if (turnovers[i] > turnovers[indexMaxValue]){
                    indexMaxValue = i;
            }
        }
        return indexMaxValue;
    }

    public  static double getMaximumValue(double[] turnovers) {
        //welcher betrag höchster
        //double maxValue = 0;
        double maxValue = Double.MIN_VALUE; // kleinster wert der in Double platz hat!! KONSTANTE

        for (int i = 0; i < turnovers.length; i++){
            if (turnovers[i] > maxValue){
                maxValue = turnovers[i];
            }
        }
        return maxValue;
    }    
    
    public  static double getMaximumValue2(double[] turnovers) {
        return turnovers[getMaximumIndex(turnovers)];
    }
}
