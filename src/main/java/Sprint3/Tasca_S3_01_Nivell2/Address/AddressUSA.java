package Sprint3.Tasca_S3_01_Nivell2.Address;

public class AddressUSA implements Address {
    private String street;
    private String state;
    private String city;
    private int postalCode;

    public AddressUSA(String street, String state, String city, int postalCode) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String address() {
        return street + ", " + state + ", " + city + ", " + postalCode;
    }

}
