package lv6_oop2;

public class AddressCustomerDemo {
    public static void main(String[] args) {

        Customer max = new Customer(1, "Max", "Kebab");
        Address maxAddress = new Address("AT", "Bad G", "4822", "test");
        max.addAddress(maxAddress);

        max.print();
        System.out.println("---------------");
        System.out.println(max);

    }


}
