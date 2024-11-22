package lv6_oop2;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;



    public Customer(int customerNumber, String firstname, String lastname){
        super(firstname, lastname);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address a){
        this.addresses.add(a);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }

    @Override
    public void print() {
        super.print();
        System.out.println("customerNumber = " + customerNumber);
        System.out.println("addresses = " + addresses);
    }
}
