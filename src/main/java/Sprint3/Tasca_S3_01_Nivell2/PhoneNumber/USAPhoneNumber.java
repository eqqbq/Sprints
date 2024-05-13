package Sprint3.Tasca_S3_01_Nivell2.PhoneNumber;

public class USAPhoneNumber implements PhoneNumber{
    private static final String usaPrefix = "+1 ";
    private String phoneNumber;

    public USAPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber(phoneNumber);
    }

    @Override
    public String phoneNumber(String phoneNumber) {
        return usaPrefix + phoneNumber;
    }

    @Override
    public String toString() {
        return "USAPhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
