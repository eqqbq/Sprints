package Sprint3.Tasca_S3_01_Nivell2;

import Sprint3.Tasca_S3_01_Nivell2.Factories.AbstractFactory;
import Sprint3.Tasca_S3_01_Nivell2.Factories.SpainContactFactory;
import Sprint3.Tasca_S3_01_Nivell2.Factories.USAContactFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("0. Exit \n1. Add new contact \n2. Show contact list.");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    addContact();
                    break ;
                case 2:
                    showContacts();
                    break;
            }
        }while (opcion!= 0);
    }

    public static void addContact(){
        Scanner sc = new Scanner(System.in);
        int option = 0;

        AbstractFactory factory = null;

        System.out.println("Enter the name of the contact:");
        String name = sc.nextLine();

        System.out.println("Enter the phone number of the contact:");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter the address of the contact:");
        String address = sc.nextLine();

        System.out.println("Enter the postal code of the contact:");
        int postalCode = sc.nextInt();
        sc.nextLine();

        System.out.println("Where is this contact from?");

        do {
            System.out.println("\n1. Spain. \n2. USA.");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    factory = new SpainContactFactory();
                    break;
                case 2:
                    factory = new USAContactFactory();
                    break;
                default:
                    System.out.println("You must choose an option between 1 and 3.");
            }
        } while (option < 1 || option > 2);

        contactList.add(new Contact(name, factory.createAddress(address, postalCode), factory.createPhoneNumber(phoneNumber)));

        System.out.println("The new contact has been added.");
    }

    public static void showContacts(){

        if (contactList.isEmpty()){
            System.out.println("Contact list is empty. Add a new one please.");
        } else{
            contactList.forEach(System.out::println);
        }
    }
}
