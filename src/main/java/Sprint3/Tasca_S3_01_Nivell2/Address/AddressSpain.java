package Sprint3.Tasca_S3_01_Nivell2.Address;

public class AddressSpain implements Address {
    private String street;
    private int postalCode;
    private final String COUNTRY = "SPAIN";

    public AddressSpain(String street, int postalCode) {
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String address(String street, int postalCode, String COUNTRY) {
        return street + ", " + postalCode + ".";
    }

    @Override
    public String toString() {
        return "AddressSpain{" +
                "street='" + street + '\'' +
                ", postalCode=" + postalCode +
                ", COUNTRY='" + COUNTRY + '\'' +
                '}';
    }
}