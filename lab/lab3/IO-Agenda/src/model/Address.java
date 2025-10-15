package model;

public class Address {
    private String surname;
    private String name;
    private String street;
    private int civicNumber;
    private String city;

    public Address(String c, String name, String v, int n, String cit) {
            surname = c;
            this.name = name;
            street = v;
            civicNumber = n;
            city = cit;
    }

    public String toString() {
            return "Surname: "+surname + "; " + "name: "+name + "; street: " + street +
                    "; civic number: " + civicNumber + "; city: " + city;
    }
}
