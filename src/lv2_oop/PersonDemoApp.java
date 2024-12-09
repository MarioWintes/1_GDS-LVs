package lv2_oop;

public class PersonDemoApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstname = "Hermann";
        person1.lastname = "Maier";
        person1.setAge(31);
        person1.height = 187;

        Person ich = new Person();
        ich.setAge(24);
        ich.height = 170;
        ich.firstname = "Mario";
        ich.lastname = "Wintes";

        person1.print();
        ich.print();
        ich.getOlder();

        person1.setLastname("Harold");
        person1.print();

        person1.setAge(11);

    }
}
