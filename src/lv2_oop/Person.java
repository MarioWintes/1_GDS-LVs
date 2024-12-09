package lv2_oop;

public class Person {

    public String firstname;
    public String lastname;
    private int age;
    public int height;

    /*
    public void setLastname(String lastname1) {
        lastname = lastname1;
    } // so ist es nicht so schön
     */
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {
        System.out.println(firstname +  " " + lastname + " " + age);
    }

    public void getOlder() {
            age++;
    }
}
