public class Tagesabschnitt {
    public static void main(String[] args) {
        int time = 31;
        int time2 = -2;

        PrintDayTime(time);
        PrintDayTime2(time2);
    }

    public static void PrintDayTime(int time) {
        if (time >= 6 && time < 9) {
            System.out.println("Früh");
        } else if (time >= 9 && time < 12) {
            System.out.println("Vormittag");
        } else if (time >= 12 && time < 16) {
            System.out.println("Nachmittag");
        } else if (time >= 16 && time < 20) {
            System.out.println("Abend");
        } else if (time >= 20 && time <= 24 || time < 6 && time >= 0) {
            System.out.println("Nacht");
        } else {
            System.out.println("Falsche Uhrzeit");
        }
    }

    public static void PrintDayTime2(int time) {

        if (time < 0 || time > 24){
            System.out.println("Falsche Zeit");
            return;
        }

        if (time < 6) {
            System.out.println("Nacht");
        } else if (time < 9) {
            System.out.println("Früh");
        } else if (time < 12) {
            System.out.println("Vormittag");
        } else if (time < 16) {
            System.out.println("Nachmittag");
        } else if (time < 20) {
            System.out.println("Abend");
        } else {
            System.out.println("Nacht");
        }
    }
}
