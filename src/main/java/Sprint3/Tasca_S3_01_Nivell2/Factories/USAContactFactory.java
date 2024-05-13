package Sprint3.Tasca_S3_01_Nivell2.Factories;

import Sprint3.Tasca_S3_01_Nivell2.Address.Address;
import Sprint3.Tasca_S3_01_Nivell2.Address.AddressUSA;
import Sprint3.Tasca_S3_01_Nivell2.Contact;
import Sprint3.Tasca_S3_01_Nivell2.PhoneNumber.PhoneNumber;
import Sprint3.Tasca_S3_01_Nivell2.PhoneNumber.USAPhoneNumber;

public class USAContactFactory implements AbstractFactory{

    @Override
    public Address createAddress(String street, int postalCode) {
        return new AddressUSA( street, postalCode);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new USAPhoneNumber(phoneNumber);
    }

    @Override
    public Contact createContact(String name, Address address, PhoneNumber phoneNumber) {
        return new Contact(name, address, phoneNumber);
    }
}
