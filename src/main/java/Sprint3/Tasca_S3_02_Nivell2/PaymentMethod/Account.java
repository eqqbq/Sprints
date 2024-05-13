package Sprint3.Tasca_S3_02_Nivell2.PaymentMethod;

public class Account implements PaymentMethod{
    int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void payment(int price) {
        System.out.println("Payment of " + price + " is being made in your account number." );
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
