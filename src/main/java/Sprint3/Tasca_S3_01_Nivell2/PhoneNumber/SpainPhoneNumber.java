package Sprint3.Tasca_S3_01_Nivell2.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber{

    private static final String spainPrefix = "+34 ";
    private int phoneNumber;

    public SpainPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String phoneNumber() {
        return spainPrefix + phoneNumber;
    }

    @Override
    public String toString() {
        return "SpainPhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
