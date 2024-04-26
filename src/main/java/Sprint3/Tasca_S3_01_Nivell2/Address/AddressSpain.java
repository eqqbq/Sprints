package Sprint3.Tasca_S3_01_Nivell2.Address;

public class AddressSpain implements Address {
    private String street;
    private int postalCode;

    public AddressSpain(String street, int postalCode) {
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String address() {
        return street + ", " + postalCode + ".";
    }

}