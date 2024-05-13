package Sprint3.Tasca_S3_01_Nivell2.Address;

public class AddressUSA implements Address {
    private String address;
    private final String COUNTRY = "USA";

    private int postalCode;

    public AddressUSA(String address, int postalCode) {
        this.address = address;
        this.postalCode = postalCode;
    }

    @Override
    public String address(String street, int postalCode, String COUNTRY) {
        return street + ", " + COUNTRY + ", " + postalCode;
    }

    @Override
    public String toString() {
        return "AddressUSA{" +
                "address='" + address + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
