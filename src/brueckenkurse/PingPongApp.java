package brueckenkurse;

public class PingPongApp {
    public static void main(String[] args) {

       for (int i = 1; i <= 100; i++) {
           if (i % 2 == 0 && i % 3 == 0) {
               System.out.println(i + " ping pong");
           }
            else if (i % 2 == 0){
                System.out.println(i + " ping");
            }
            else if (i % 3 == 0) {
                System.out.println(i + " pong");
            }
            else {
               System.out.println(i + " -");
           }
       }
    }
}
