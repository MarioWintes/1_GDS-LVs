package lv6_oop2;

public class Address {

    private String street;
    private String zipCode;
    private String city;
    private String country;

    public Address(String country, String city, String zipCode, String street) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
