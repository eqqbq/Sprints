package Sprint3.Tasca_S3_01_Nivell2.Factories;

import Sprint3.Tasca_S3_01_Nivell2.Address.Address;
import Sprint3.Tasca_S3_01_Nivell2.Address.AddressSpain;
import Sprint3.Tasca_S3_01_Nivell2.Contact;
import Sprint3.Tasca_S3_01_Nivell2.PhoneNumber.PhoneNumber;
import Sprint3.Tasca_S3_01_Nivell2.PhoneNumber.SpainPhoneNumber;

public class SpainContactFactory implements AbstractFactory{
    @Override
    public Address createAddress(String street, int postalCode) {
        return new AddressSpain(street, postalCode);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new SpainPhoneNumber(phoneNumber);
    }

    @Override
    public Contact createContact(String name, Address address, PhoneNumber phoneNumber) {
        return new Contact(name, address, phoneNumber );
    }
}
