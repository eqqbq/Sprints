package Sprint3.Tasca_S3_02_Nivell2.PaymentMethod;

public class Paypal implements PaymentMethod{
    String paypalUser;

    public Paypal(String paypalUser) {
        this.paypalUser = paypalUser;
    }

    @Override
    public void payment(int price) {
        System.out.println("Payment of " + price + " is being made on your paypal account.");
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "paypalUser='" + paypalUser + '\'' +
                '}';
    }
}
