package Sprint3.Tasca_S3_01_Nivell2.PhoneNumber;

public class USAPhoneNumber implements PhoneNumber{
    private static final String usaPrefix = "+34 ";
    private int phoneNumber;

    public USAPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String phoneNumber() {
        return usaPrefix + phoneNumber;
    }

    @Override
    public String toString() {
        return "USAPhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
