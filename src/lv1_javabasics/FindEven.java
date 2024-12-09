public class FindEven {
    public static void main(String[] args) {
        int input = 67;
        int i = 0;

        while (i <= input) {
            if (i % 2 == 0) {
                if (i == input || i == input - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
            i++;
        }
    }
}
