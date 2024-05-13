package Sprint3.Tasca_S3_01_Nivell2;

import Sprint3.Tasca_S3_01_Nivell2.Address.Address;
import Sprint3.Tasca_S3_01_Nivell2.PhoneNumber.PhoneNumber;

public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
