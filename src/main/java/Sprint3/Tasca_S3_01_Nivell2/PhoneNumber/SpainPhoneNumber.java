package Sprint3.Tasca_S3_01_Nivell2.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber{

    private static final String spainPrefix = "+34 ";
    private String phoneNumber;

    public SpainPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber(phoneNumber);
    }

    @Override
    public String phoneNumber(String phoneNumber) {
        return spainPrefix + phoneNumber;
    }

    @Override
    public String toString() {
        return "SpainPhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
