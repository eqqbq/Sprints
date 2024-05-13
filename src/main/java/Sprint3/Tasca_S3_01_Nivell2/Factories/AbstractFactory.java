package Sprint3.Tasca_S3_01_Nivell2.Factories;

import Sprint3.Tasca_S3_01_Nivell2.Address.Address;
import Sprint3.Tasca_S3_01_Nivell2.Contact;
import Sprint3.Tasca_S3_01_Nivell2.PhoneNumber.PhoneNumber;

public interface AbstractFactory {
    Address createAddress(String street, int postalCode);
    PhoneNumber createPhoneNumber(String phoneNumber);
    Contact createContact(String name, Address address, PhoneNumber phoneNumber);
}
