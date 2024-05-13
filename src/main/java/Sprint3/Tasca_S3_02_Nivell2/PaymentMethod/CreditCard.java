package Sprint3.Tasca_S3_02_Nivell2.PaymentMethod;

public class CreditCard implements PaymentMethod{

    int cardNumber;

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void payment(int price) {
        System.out.println("Payment of " + price + " is being made on your credit card.");
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                '}';
    }
}
