public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] list1 = new int[3];
        list1[0] = 5;
        list1[1] = 9;
        list1[2] = 1;

        int [] list2 = {7, 1, 3};

        for (int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + list2[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < list2.length; i++){
            System.out.print(list1[i] * list2[i] + ", ");
        }
        System.out.println();

        int[] list3 = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < list3.length; i++){
            sum = sum + list3[i];;
        }
        System.out.println(sum);
    }
}
